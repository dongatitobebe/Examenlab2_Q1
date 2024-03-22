package Examen_Q1;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    PSNUsers psn;
    boolean active = false;

    public Main() {
        psn = new PSNUsers();
        initComponents();
        setLocationRelativeTo(null);
        loadUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addDialog = new javax.swing.JDialog();
        labels = new javax.swing.JLabel();
        texfieluser = new javax.swing.JTextField();
        Agregarboton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        trophDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        trofeoaseleccionar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        guardartrofeo = new javax.swing.JButton();
        usuarioAseleccionar = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreJuego = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Nombretrofeo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        playerInfoText = new javax.swing.JTextArea();
        usersCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AgregarUsuarios = new javax.swing.JButton();
        Agregartrofeos = new javax.swing.JButton();
        EliminarUsuario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        addDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addDialog.setTitle("Trofeos PSN - Agregar Usuarios");
        addDialog.setModal(true);

        labels.setBackground(new java.awt.Color(0, 0, 51));
        labels.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labels.setForeground(new java.awt.Color(255, 255, 255));
        labels.setText("Agregar Usuario");

        texfieluser.setBackground(new java.awt.Color(255, 255, 255));
        texfieluser.setForeground(new java.awt.Color(0, 0, 0));

        Agregarboton.setBackground(new java.awt.Color(102, 102, 102));
        Agregarboton.setForeground(new java.awt.Color(0, 0, 0));
        Agregarboton.setText("Agregar");
        Agregarboton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarbotonMouseClicked(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User");

        javax.swing.GroupLayout addDialogLayout = new javax.swing.GroupLayout(addDialog.getContentPane());
        addDialog.getContentPane().setLayout(addDialogLayout);
        addDialogLayout.setHorizontalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDialogLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texfieluser, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDialogLayout.createSequentialGroup()
                        .addComponent(Agregarboton)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addDialogLayout.createSequentialGroup()
                        .addComponent(labels)
                        .addGap(83, 83, 83))))
        );
        addDialogLayout.setVerticalGroup(
            addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labels)
                .addGap(26, 26, 26)
                .addGroup(addDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texfieluser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(Agregarboton)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trofeoaseleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Platino", "Oro", "Plata", "Bronce", " " }));
        jPanel2.add(trofeoaseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        guardartrofeo.setText("Agregar Trofeo");
        guardartrofeo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardartrofeoMouseClicked(evt);
            }
        });
        guardartrofeo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardartrofeoActionPerformed(evt);
            }
        });
        jPanel2.add(guardartrofeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, -1, -1));

        usuarioAseleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(usuarioAseleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 158, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Añadir trofeos");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 31, -1, -1));
        jPanel2.add(nombreJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 71, 141, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre del Juego");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 71, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre del Trofeo");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        jPanel2.add(Nombretrofeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 107, 141, -1));

        javax.swing.GroupLayout trophDialogLayout = new javax.swing.GroupLayout(trophDialog.getContentPane());
        trophDialog.getContentPane().setLayout(trophDialogLayout);
        trophDialogLayout.setHorizontalGroup(
            trophDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        trophDialogLayout.setVerticalGroup(
            trophDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 0, 153)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PSN Trofeos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        playerInfoText.setEditable(false);
        playerInfoText.setColumns(20);
        playerInfoText.setLineWrap(true);
        playerInfoText.setRows(5);
        playerInfoText.setWrapStyleWord(true);
        playerInfoText.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(playerInfoText);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 420, 250));

        usersCombo.setBorder(new javax.swing.border.MatteBorder(null));
        usersCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                usersComboItemStateChanged(evt);
            }
        });
        usersCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersComboMouseClicked(evt);
            }
        });
        usersCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersComboActionPerformed(evt);
            }
        });
        getContentPane().add(usersCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 170, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuarios");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 80, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Menu");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 30));

        AgregarUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        AgregarUsuarios.setText("Agregar Usuario");
        AgregarUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarUsuariosMouseClicked(evt);
            }
        });
        getContentPane().add(AgregarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 158, 30));

        Agregartrofeos.setForeground(new java.awt.Color(0, 0, 0));
        Agregartrofeos.setText("Agregar Trofeo");
        Agregartrofeos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregartrofeosMouseClicked(evt);
            }
        });
        Agregartrofeos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregartrofeosActionPerformed(evt);
            }
        });
        getContentPane().add(Agregartrofeos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 158, 30));

        EliminarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        EliminarUsuario.setText("Eliminar Usuario");
        EliminarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarUsuarioMouseClicked(evt);
            }
        });
        EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(EliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 30));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadUsers() {
        active = false;
        Entry temp = psn.user.Inicio;
        usersCombo.removeAllItems();

        while (temp != null) {
            
            usersCombo.addItem(temp.username);
            temp = temp.siguiente;
        }

        active = true;
        updateText();

    }

    private void updateText() {
        if( usersCombo.getSelectedItem()!=null){
        String name = usersCombo.getSelectedItem().toString();
        playerInfoText.setText(psn.playerInfo(name));
        }else{
            
        }
    }
    private void usersComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_usersComboItemStateChanged

        if (!active) {
            return;
        }
        updateText();
    }//GEN-LAST:event_usersComboItemStateChanged

    private void AgregarUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarUsuariosMouseClicked

        texfieluser.setText("");
        addDialog.pack();
        addDialog.setVisible(true);

    }//GEN-LAST:event_AgregarUsuariosMouseClicked

    private void AgregarbotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarbotonMouseClicked
        // TODO add your handling code here:
        String username = texfieluser.getText();
        active = false;
        if (username.isBlank()) {
            JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos");
            return;
        }

        boolean res = psn.addUser(username);
        System.out.println(res);
        if (res) {
            System.out.println("Click dialog add btn");
            JOptionPane.showMessageDialog(null, "Se ha agregado el usuario.");
            addDialog.dispose();
            loadUsers();
        }
        active = true;
    }//GEN-LAST:event_AgregarbotonMouseClicked

    private void updateTrophUsers() {
        Entry temp = psn.user.Inicio;
        usuarioAseleccionar.removeAllItems();

        while (temp != null) {
            usuarioAseleccionar.addItem(temp.username);
            temp = temp.siguiente;
        }
    }
    private void guardartrofeoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardartrofeoMouseClicked
       trophy trophType;
        String selectedType = (String) trofeoaseleccionar.getSelectedItem();

        switch (selectedType) {
            case "Platino":
                trophType = trophy.platino;
                break;
            case "Oro":
                trophType = trophy.Oro;
                break;
            case "Plata":
                trophType = trophy.plata;
                break;
            default:
                trophType = trophy.bronce;
                break;
        }

        String gameName = nombreJuego.getText();
        String trophName = Nombretrofeo.getText();
        String username = usuarioAseleccionar.getSelectedItem().toString();

        if (gameName.isBlank() || trophName.isBlank()) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
            return;
        }

        psn.addTrophieTo(username, gameName, trophName, trophType);
        trophDialog.dispose();
        updateText();

    }//GEN-LAST:event_guardartrofeoMouseClicked

    private void AgregartrofeosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregartrofeosMouseClicked
        if (psn.size == 0) {
            JOptionPane.showMessageDialog(null, "no hay users");
            return;
        }
        Nombretrofeo.setText("");
        nombreJuego.setText("");
        updateTrophUsers();
        trophDialog.pack();
        trophDialog.setVisible(true);
    }//GEN-LAST:event_AgregartrofeosMouseClicked

    private void EliminarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarUsuarioMouseClicked
        try {
            int eleccion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el usuario actual?");
            if (eleccion != 0) {
                return;
            }
            String username =usersCombo.getSelectedItem().toString();
            psn.deactiveUser(username);
            loadUsers();
            playerInfoText.setText("Este Usuario fue desactivado");
            
        } catch (IOException ex) {
            System.out.println("error");
        }
    }//GEN-LAST:event_EliminarUsuarioMouseClicked

    private void usersComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersComboActionPerformed
   if(usersCombo.getSelectedItem()!=null){
        String name = usersCombo.getSelectedItem().toString();
        if(!"".equals(name)){
            updateText();
        }
   }
    }//GEN-LAST:event_usersComboActionPerformed

    private void usersComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersComboMouseClicked
   if(usersCombo.getSelectedItem()!=null){
        String name = usersCombo.getSelectedItem().toString();
        if(!"".equals(name)){
            updateText();
        }
   }
    }//GEN-LAST:event_usersComboMouseClicked

    private void EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarUsuarioActionPerformed

    private void AgregartrofeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregartrofeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregartrofeosActionPerformed

    private void guardartrofeoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardartrofeoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardartrofeoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarUsuarios;
    private javax.swing.JButton Agregarboton;
    private javax.swing.JButton Agregartrofeos;
    private javax.swing.JButton EliminarUsuario;
    private javax.swing.JTextField Nombretrofeo;
    private javax.swing.JDialog addDialog;
    private javax.swing.JButton guardartrofeo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labels;
    private javax.swing.JTextField nombreJuego;
    private javax.swing.JTextArea playerInfoText;
    private javax.swing.JTextField texfieluser;
    private javax.swing.JComboBox<String> trofeoaseleccionar;
    private javax.swing.JDialog trophDialog;
    private javax.swing.JComboBox<String> usersCombo;
    private javax.swing.JComboBox<String> usuarioAseleccionar;
    // End of variables declaration//GEN-END:variables
}
