package lab_final_valeriaosoriovictorbarbosa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static lab_final_valeriaosoriovictorbarbosa.Inicio.desicion;
import static lab_final_valeriaosoriovictorbarbosa.Inicio.nick;

public class CargarPartida extends javax.swing.JFrame {
    
    public static ListaCola lc;
    
    public CargarPartida() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            CrearLista();
        } catch (IOException ex) {
            Logger.getLogger(CargarPartida.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void CrearLista() throws FileNotFoundException, IOException {
        lc = new ListaCola();
        Metodos e = new Metodos();
        File f = new File("CheckPoint.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String bef = br.readLine();
        String ty;
        if (bef == null) {
            if(desicion==0){
            JOptionPane.showMessageDialog(null, "No existen Checkpoints previos.");
            }
            while (bef!=null) {
                lc.insertar(bef);
                bef=br.readLine();;
            }
        } else{
            while (bef!=null) {
                lc.insertar(bef);
                bef=br.readLine();;
            }
        }
        br.close();
        fr.close();
        Node p=lc.frente;
        while(p!=null){
            nicks.addItem(e.CampoEspecifico(p.info, 2));
            p=p.link;
        }
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        partida_nueva1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        nicks = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(553, 342));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        partida_nueva1.setBackground(new java.awt.Color(102, 102, 102));
        partida_nueva1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        partida_nueva1.setForeground(new java.awt.Color(255, 255, 255));
        partida_nueva1.setText("Menu Principal");
        partida_nueva1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        partida_nueva1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        partida_nueva1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partida_nueva1ActionPerformed(evt);
            }
        });
        jPanel1.add(partida_nueva1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jLabel2.setFont(new java.awt.Font("Castellar", 0, 46)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CheckpOints");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Seleccione un punto de guardado.");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 280, 30));

        Eliminar.setBackground(new java.awt.Color(102, 102, 102));
        Eliminar.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setText("Eliminar");
        Eliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 160, 40));

        cargar.setBackground(new java.awt.Color(102, 102, 102));
        cargar.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setText("Reanudar");
        cargar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cargar.setMaximumSize(new java.awt.Dimension(113, 23));
        cargar.setMinimumSize(new java.awt.Dimension(113, 23));
        cargar.setPreferredSize(new java.awt.Dimension(113, 23));
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, 40));

        nicks.setBackground(new java.awt.Color(153, 153, 153));
        nicks.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        nicks.setForeground(new java.awt.Color(255, 255, 255));
        nicks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        nicks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(nicks, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/clouds-fog-forest-6718.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -130, -1, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Node p = lc.frente;
        Node antp = p;
        Metodos e = new Metodos();
        Inicio in = new Inicio();
        String nickname = (String) nicks.getSelectedItem();
        boolean sw = false;
        if (!"...".equals(nickname)) {
            nick = nickname;
            while (p != null && sw == false) {
                if (nick.equals(e.CampoEspecifico(p.info, 2))) {

                    lc.Eliminar(p, antp, lc);
                    sw = true;

                }
                antp = p;
                p = p.link;
            }
            try {
                e.Sobreescribir(lc, "CheckPoint.txt");
            } catch (IOException ex) {
                Logger.getLogger(CargarPartida.class.getName()).log(Level.SEVERE, null, ex);
            }
            Node t = lc.frente;
            nicks.removeAllItems();
            nicks.addItem("...");
            while (t != null) {
                nicks.addItem(e.CampoEspecifico(t.info, 2));
                t = t.link;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion que no sea la por defecto.");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        // TODO add your handling code here:
        Node p = lc.frente;
        Metodos e = new Metodos();
        Inicio in = new Inicio();
        String nickname = (String) nicks.getSelectedItem();
        if (!"...".equals(nickname)) {
            nick = nickname;
            while (p != null) {
                if (nick.equals(e.CampoEspecifico(p.info, 2))) {
                    in.desicion = Integer.parseInt(e.CampoEspecifico(p.info, 1)) - 1;
                    in.orden = e.CampoEspecifico(p.info, 3);
                    in.pr=Integer.parseInt(e.CampoEspecifico(p.info, 4));
                    
                }
                p = p.link;
            }
            Historia h;
            try {
                h = new Historia();
                h.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }

            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una opcion que no sea la por defecto.");
        }
    }//GEN-LAST:event_cargarActionPerformed

    private void partida_nueva1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partida_nueva1ActionPerformed
        Inicio in = new Inicio();
        in.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_partida_nueva1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CargarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargarPartida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new CargarPartida().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Eliminar;
    public javax.swing.JButton cargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> nicks;
    public javax.swing.JButton partida_nueva1;
    // End of variables declaration//GEN-END:variables
}
