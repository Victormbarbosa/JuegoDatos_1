package lab_final_valeriaosoriovictorbarbosa;

import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public static int sw = 0;
    public static String nick = "";
    public static int desicion=0;
    public static String orden = "";
    public static int pr = 0;

    public void registrar_nickname(String nickname, String temp) throws IOException {
        File F = new File("Nickname.txt");
        FileWriter fw = new FileWriter(F);

        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(fw);

        if (nickname.contains(" ")) {
            JOptionPane.showMessageDialog(null, "Su nickname no puede contener espacios");
            pw.append(temp);
            pw.close();
            bw.close();
            fw.close();
        } else {
            pw.write(nickname);
            pw.append(temp);
            pw.close();
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null, "¡Nickname creado con exito!");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        manual = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        partida_nueva = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(410, 500));
        setPreferredSize(new java.awt.Dimension(410, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manual.setBackground(new java.awt.Color(102, 102, 102));
        manual.setForeground(new java.awt.Color(255, 255, 255));
        manual.setText("Tutorial");
        manual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manual.setMaximumSize(new java.awt.Dimension(113, 23));
        manual.setMinimumSize(new java.awt.Dimension(113, 23));
        manual.setPreferredSize(new java.awt.Dimension(113, 23));
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });
        jPanel1.add(manual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 160, 40));

        jLabel2.setFont(new java.awt.Font("Castellar", 0, 46)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manos Ciegas");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        partida_nueva.setBackground(new java.awt.Color(102, 102, 102));
        partida_nueva.setForeground(new java.awt.Color(255, 255, 255));
        partida_nueva.setText("Iniciar partida nueva");
        partida_nueva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        partida_nueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        partida_nueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partida_nuevaActionPerformed(evt);
            }
        });
        jPanel1.add(partida_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, 40));

        cargar.setBackground(new java.awt.Color(102, 102, 102));
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setText("Cargar Partida");
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
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/clouds-fog-forest-6718.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, -1, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void partida_nuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partida_nuevaActionPerformed
        // TODO add your handling code here:
        String nickname = JOptionPane.showInputDialog(null, "Ingrese su nickname (No se permiten nicknames con espacios)");

        nick = nickname;
        Historia h;
        if (!nick.equals("")) {
            try {
                h = new Historia();
                h.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        dispose();
    }//GEN-LAST:event_partida_nuevaActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        // TODO add your handling code here:
        CargarPartida h = new CargarPartida();
        h.setVisible(true);
        dispose();

    }//GEN-LAST:event_cargarActionPerformed

    private void manualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manualActionPerformed
        try {
            File path = new File("MANUAL DE USUARIO.docx");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_manualActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Inicio().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton manual;
    public javax.swing.JButton partida_nueva;
    // End of variables declaration//GEN-END:variables
}
