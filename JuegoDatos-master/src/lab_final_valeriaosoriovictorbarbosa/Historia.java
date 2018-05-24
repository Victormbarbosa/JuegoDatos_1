package lab_final_valeriaosoriovictorbarbosa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import static lab_final_valeriaosoriovictorbarbosa.CargarPartida.lc;

public class Historia extends javax.swing.JFrame {

    public String ViMu = "";
    public static int col;

    public Historia() throws IOException {
        col = 0;
        initComponents();
        Inicio in = new Inicio();
        this.setLocationRelativeTo(null);
        in.desicion = in.desicion + 1;

        int f = (in.desicion + 1) / 2;
        Dia.setText("Dia " + String.valueOf(f));
        Desicion.setText("Desicion " + String.valueOf(in.desicion));
        nickname.setText(in.nick);
        Metodos e = new Metodos();
        String h = String.valueOf(in.desicion);
        esconder(Guardar);
        esconder(DesA);
        esconder(DesB);
        esconder(arriba);
        esconder(abajo);
        marco.setVisible(false);
        UA.setVisible(false);
        multi(in.desicion, 1);
        ViMu = e.VivirOMorir(A, B, DesA, DesB, UA, ViMu, arbol, marco);

    }

    void esconder(JButton j) {
        j.setContentAreaFilled(false);
        j.setFocusPainted(false);
        j.setBorderPainted(false);
    }

    public void multi(int t, int f) throws IOException {
        Multilistas n = new Multilistas();
        col = col + f;
        if (col >= 1) {
            n.pop = col;
            n.createList();
            n.SubNodeCorrect(t, Impresor, A, B);
        } else {
            JOptionPane.showMessageDialog(null, "No hay mas texto antes.");
            col = col + 1;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        progresohistoria = new javax.swing.JProgressBar();
        UA = new javax.swing.JButton();
        marco = new javax.swing.JLabel();
        DesA = new javax.swing.JButton();
        DesB = new javax.swing.JButton();
        arbol = new javax.swing.JLabel();
        B = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        nickname = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        abajo = new javax.swing.JButton();
        arriba = new javax.swing.JButton();
        Impresor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Desicion = new javax.swing.JLabel();
        Dia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 800));
        setMinimumSize(new java.awt.Dimension(381, 608));
        setPreferredSize(new java.awt.Dimension(395, 645));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(progresohistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 160, 20));

        UA.setFont(new java.awt.Font("Book Antiqua", 3, 15)); // NOI18N
        UA.setText("Ver tu destino. ");
        UA.setBorder(new javax.swing.border.MatteBorder(null));
        UA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UAActionPerformed(evt);
            }
        });
        jPanel2.add(UA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 120, 30));

        marco.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        marco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/borde2122.png"))); // NOI18N
        jPanel2.add(marco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 120, 30));

        DesA.setText("A");
        DesA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DesA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesAActionPerformed(evt);
            }
        });
        jPanel2.add(DesA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 407, 80, -1));

        DesB.setText("B");
        DesB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesBActionPerformed(evt);
            }
        });
        jPanel2.add(DesB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 90, 20));

        arbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Arbol Definitivo 2.png"))); // NOI18N
        jPanel2.add(arbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 220, 240));

        B.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        B.setText("B.");
        jPanel2.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 230, -1));

        A.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        A.setText("A.");
        jPanel2.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 240, -1));

        nickname.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        nickname.setForeground(new java.awt.Color(255, 255, 255));
        nickname.setText("Nombre");
        jPanel2.add(nickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 90, 20));

        Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Guardar.setForeground(new java.awt.Color(0, 51, 102));
        Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Entypo_d83d(0)_48.png"))); // NOI18N
        Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel2.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 40));

        abajo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        abajo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Entypo_e4b0(1)_28.png"))); // NOI18N
        abajo.setBorder(null);
        abajo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abajoActionPerformed(evt);
            }
        });
        jPanel2.add(abajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 30, 30));

        arriba.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        arriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Entypo_e4af(0)_28.png"))); // NOI18N
        arriba.setBorder(null);
        arriba.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        arriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arribaActionPerformed(evt);
            }
        });
        jPanel2.add(arriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, 30));

        Impresor.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        Impresor.setText("Impresor");
        Impresor.setToolTipText("");
        Impresor.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(Impresor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 280, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/marx.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 380, 520));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/ada.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        Desicion.setFont(new java.awt.Font("Old English Text MT", 0, 20)); // NOI18N
        Desicion.setForeground(new java.awt.Color(255, 255, 255));
        Desicion.setText("Desicion");
        jPanel2.add(Desicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 100, 30));

        Dia.setFont(new java.awt.Font("Old English Text MT", 0, 20)); // NOI18N
        Dia.setForeground(new java.awt.Color(255, 255, 255));
        Dia.setText("Dia");
        jPanel2.add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 400, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void DesAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesAActionPerformed
        Inicio in = new Inicio();
        in.orden = in.orden + "A";
        Historia h;
        try {
            h = new Historia();
            h.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Historia.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();
    }//GEN-LAST:event_DesAActionPerformed

    private void DesBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesBActionPerformed
        Inicio in = new Inicio();
        in.orden = in.orden + "B";
        Historia h;
        try {
            h = new Historia();
            h.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Historia.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();

    }//GEN-LAST:event_DesBActionPerformed

    private void UAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UAActionPerformed

        if ("Hasta aqui ha llegado tu camino".equals(ViMu)) {
            JOptionPane.showMessageDialog(null, "Has Muerto");
        }
        if ("Felicidades Afortunado".equals(ViMu)) {
            JOptionPane.showMessageDialog(null, "Has Ganado");
        }
        Inicio in = new Inicio();
        in.nick = "";
        in.desicion = 0;
        in.orden = "";
        ViMu = "";
        Metodos e = new Metodos();
        e.contpuncoma = 0;
        in.setVisible(true);
        in.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_UAActionPerformed

    private void arribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arribaActionPerformed
        Inicio in = new Inicio();
        try {
            multi(in.desicion, -1);
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Historia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_arribaActionPerformed

    private void abajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abajoActionPerformed
        Inicio in = new Inicio();
        try {
            multi(in.desicion, 1);
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Historia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_abajoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String save = JOptionPane.showInputDialog(null, "Digite el numero de la opcion que desea realizar:" + "\n" + "1. Guardar partida y salir. " + "\n" + "2. Guardar partida." + "\n" + "3. Salir sin guardar. " + "\n" + "4. Volver al juego. ");
        Metodos e = new Metodos();
        Inicio in = new Inicio();
        int sw = 0;
        CargarPartida cp = new CargarPartida();
        String cadena = in.desicion + ":" + in.nick + ":" + in.orden + ":";
        if (save.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, digite alguna de las tres opciones");
        } else {
            int res = Integer.parseInt(save);
            if (res < 1 || res > 4) {
                JOptionPane.showMessageDialog(null, "Opcion Digitida no es valida, intente otra vez.");
            } else {
                Node p = cp.lc.frente;
                if (res == 1 || res == 2) {
                    while (p != null && sw == 0) {
                        String comprobar = e.CampoEspecifico(p.info, 2);
                        if (comprobar.equals(in.nick)) {
                            String s = JOptionPane.showInputDialog(null, "Archivo ya existente Desea sobreescribirlo? \n 1. Si \n 2. No");
                            if ("1".equals(s)) {
                                p.setInfo(cadena);
                                sw = 1;
                            } else {
                                if ("2".equals(s)) {
                                }
                            }
                        } else {
                            lc.insertar(cadena);
                            sw = 1;
                        }
                        p = p.link;

                    }
                    try {
                        e.Sobreescribir(lc, "CheckPoint.txt");
                    } catch (IOException ex) {
                        Logger.getLogger(Historia.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (res == 1) {
                        in.setVisible(true);
                        dispose();
                    }
                }
                if (res == 3) {
                    in.setVisible(true);
                    dispose();
                }
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new Historia().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Historia.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel B;
    private javax.swing.JButton DesA;
    private javax.swing.JButton DesB;
    private javax.swing.JLabel Desicion;
    private javax.swing.JLabel Dia;
    public javax.swing.JButton Guardar;
    private javax.swing.JLabel Impresor;
    private javax.swing.JButton UA;
    public javax.swing.JButton abajo;
    private javax.swing.JLabel arbol;
    private javax.swing.JButton arriba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel marco;
    public javax.swing.JLabel nickname;
    public static javax.swing.JProgressBar progresohistoria;
    // End of variables declaration//GEN-END:variables
}
