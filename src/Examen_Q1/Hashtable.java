package Examen_Q1;


public class Hashtable {

    Entry Inicio;
    long size = 0;

    public boolean isEmpty() {
        return Inicio == null;
    }
 public long buscar(String username) {
    if(!isEmpty()){
    Entry temp = Inicio;
        while (temp != null) {
            if (temp.username.equals(username)) {
                return temp.posicion;
            }
            temp = temp.siguiente;
        }
    }
     return -1;
    }
    public void add(String username, long pos) {
        if (buscar(username) != -1) {
            return;
        }
        Entry nuevonodo = new Entry(username, pos);
        if (isEmpty()) {
            Inicio = nuevonodo;
        } else {
            Entry temp = Inicio;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevonodo;
        }
        size++;
    }

    public void remove(String username) {
        if (!isEmpty()) {
            if (Inicio.username.equals(username)) {
                Inicio = Inicio.siguiente;
                size--;
            } else {
                Entry temp = Inicio;
                while (temp.siguiente != null) {
                    if (temp.username.equals(username)) {
                        temp.siguiente = temp.siguiente.siguiente;
                        size--;
                        return;
                    } else {
                        temp = temp.siguiente;
                    }
                }
            }
        }
    }

   
}
