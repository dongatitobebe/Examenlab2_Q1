package Examen_Q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;


public class PSNUsers {

    private RandomAccessFile RAF, ArchivosUser;
    Hashtable user;
    long size = 0;

    public PSNUsers() {
        try {
            ArchivosUser = new RandomAccessFile("users", "rw");
            RAF = new RandomAccessFile("psn", "rw");
        } catch (FileNotFoundException ex) {
            System.out.print("Archivo no encontrado");
        }
        reloadHashTable();
    }

    private void reloadHashTable() {
        try {
            size = 0;
            ArchivosUser.seek(0);
            user = new Hashtable();
            while (ArchivosUser.getFilePointer() < ArchivosUser.length()) {
                String username = ArchivosUser.readUTF();
                int puntos = ArchivosUser.readInt();
                int cant_trofeos = ArchivosUser.readInt();
                boolean Estado = ArchivosUser.readBoolean();
                System.out.println("nombre" + username + "Puntos: " + puntos + " estado " + Estado + " #trofeos: " + cant_trofeos);

                if (!Estado) {
                    System.out.println("Este esta borrado - nombre" + username + "Puntos: " + puntos + " estado " + Estado + " #trofeos: " + cant_trofeos);
                }

                user.add(username, size);
                size++;
            }
            System.out.println("si hay: " + user.size);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
public String playerInfo(String username) {
        if (user.buscar(username) == -1) {
            return "";
        }

        try {
            String texto = "";
            ArchivosUser.seek(0);
            while (ArchivosUser.getFilePointer() < ArchivosUser.length()) {
                String nombreactual = ArchivosUser.readUTF();
                int trophyPoints = ArchivosUser.readInt();
                int trophyCount = ArchivosUser.readInt();
                boolean estado = ArchivosUser.readBoolean();

                if (!nombreactual.equals(username) || !estado) {
                    continue;
                }
                if (nombreactual.equals(username) && estado == false) {
                    return "Usuario borrado";
                }

                texto = "Usuario: " + username + "\n Puntaje: " + trophyPoints + "\nCantidad de trofeos: " + trophyCount + texto + "\n\nNombre de Trofeos:\n";

                RAF.seek(0);
                while (RAF.getFilePointer() < RAF.length()) {
                    String name = RAF.readUTF();
                    String trophyType = RAF.readUTF();
                    String trophyGame = RAF.readUTF();
                    String trophyName = RAF.readUTF();
                    long date = RAF.readLong();

                    if (name.equals(username)) {
                        texto += "\nTrofeo " + trophyType + " de " + trophyGame + " llamado " + trophyName + " el "
                                + new Date(date) + " \n------------------------------------";
                    }
                }
                texto += "\n\n";
            }
            return texto;

        } catch (IOException e) {
            return "";
        }

    }
    public boolean addUser(String username) {
        if (user.buscar(username) != -1) {
            return false;
        }

        try {
            ArchivosUser.seek(ArchivosUser.length());
            ArchivosUser.writeUTF(username);
            ArchivosUser.writeInt(0);
            ArchivosUser.writeInt(0);
            ArchivosUser.writeBoolean(true);

            user.add(username, size);
            size++;
            System.out.println("Usuario creado ");
            return true;

        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


    

    public void deactiveUser(String Username) throws IOException {
        if (user.buscar(Username) == -1) {
            return;
        }

        try {
            File newUsersFile = new File("tempUsers");
            newUsersFile.createNewFile();
            try (
                RandomAccessFile newUsers = new RandomAccessFile(newUsersFile, "rw")) {
                ArchivosUser.seek(0);
                while (ArchivosUser.getFilePointer() < ArchivosUser.length()) {
                    String currentUsername = ArchivosUser.readUTF();
                    if (Username.equals(currentUsername)) {
                        ArchivosUser.skipBytes(9);
                        continue;
                    }
                    int trophyPoints = ArchivosUser.readInt();
                    int trophyCount = ArchivosUser.readInt();

                    newUsers.writeUTF(currentUsername);
                    newUsers.writeInt(trophyPoints);
                    newUsers.writeInt(trophyCount);

                    if (Username.equals(currentUsername)) {
                        newUsers.writeBoolean(false); 
                    } else {
                        newUsers.writeBoolean(true); 
                    }
                }
            }
            ArchivosUser.close();

            File usersFile = new File("users");
            usersFile.delete();
            newUsersFile.renameTo(usersFile);
            ArchivosUser = new RandomAccessFile("users", "rw");
            reloadHashTable();

            File tempTrophies = new File("temp");
            tempTrophies.createNewFile();
            try (RandomAccessFile tempRaf = new RandomAccessFile("temp", "rw")) {
                RAF.seek(0);
                while (RAF.getFilePointer() < RAF.length()) {
                    String usActual = RAF.readUTF();
                    String trophyType = RAF.readUTF();
                    String trophyGame = RAF.readUTF();
                    String trophyName = RAF.readUTF();
                    long date = RAF.readLong();

                    if (usActual.equals(Username)) {
                        continue;
                    }
                    tempRaf.writeUTF(usActual);
                    tempRaf.writeUTF(trophyType);
                    tempRaf.writeUTF(trophyGame);
                    tempRaf.writeUTF(trophyName);
                    tempRaf.writeLong(date);
                }
            }
            RAF.close();

            File psnFile = new File("psn");
            psnFile.delete();
            tempTrophies.renameTo(psnFile);
            RAF = new RandomAccessFile("psn", "rw");

        } catch (IOException e) {
        }

    }

    public boolean addTrophieTo(String username, String trophyGame, String trophyName, trophy type) {
        if (user.buscar(username) == -1) {
            return false;
        }

        try {
            RAF.seek(RAF.length());
            RAF.writeUTF(username);
            RAF.writeUTF(type.name());
            RAF.writeUTF(trophyGame);
            RAF.writeUTF(trophyName);

            Date currentDate = new Date();
            RAF.writeLong(currentDate.getTime());

            ArchivosUser.seek(0);
            long currentPos;
            while (ArchivosUser.getFilePointer() < ArchivosUser.length()) {
                currentPos = ArchivosUser.getFilePointer();
                String UsuarioActual = ArchivosUser.readUTF();

                if (!UsuarioActual.equals(username)) {
                    ArchivosUser.skipBytes(9);
                    continue;
                }
                int trophyPoints = ArchivosUser.readInt();
                int trophyCount = ArchivosUser.readInt();
                boolean registered = ArchivosUser.readBoolean();

                if (!registered) {
                    return false;
                }
                trophyPoints += type.puntos;
                trophyCount++;
                ArchivosUser.seek(currentPos);
                ArchivosUser.writeUTF(UsuarioActual);
                ArchivosUser.writeInt(trophyPoints);
                ArchivosUser.writeInt(trophyCount);
                ArchivosUser.writeBoolean(true);
                ArchivosUser.close();
                ArchivosUser = new RandomAccessFile("users", "rw");
                return true;
            }

            return false;

        } catch (IOException e) {
            return false;
        }

    }
    
}
