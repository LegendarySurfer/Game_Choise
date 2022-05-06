package ventana;

import javax.swing.JOptionPane;
import music.MusicPlay;

public class VentanaOpciones extends javax.swing.JFrame {

    private boolean sonido = false;
    private MusicPlay music;
    
    public VentanaOpciones(MusicPlay music) {
        initComponents();
        this.music = music;
        this.setLocationRelativeTo(null); //PONE LA VENTANA EN EL CENTRO
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_Creditos = new javax.swing.JButton();
        boton_Idioma = new javax.swing.JButton();
        botonSonido = new javax.swing.JButton();
        boton_Volver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        linea1 = new javax.swing.JLabel();
        linea2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_Creditos.setBackground(new java.awt.Color(0, 0, 0));
        boton_Creditos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_Creditos.setForeground(new java.awt.Color(255, 255, 255));
        boton_Creditos.setText("Creditos");
        boton_Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_CreditosActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 240, 80));

        boton_Idioma.setBackground(new java.awt.Color(0, 0, 0));
        boton_Idioma.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_Idioma.setForeground(new java.awt.Color(255, 255, 255));
        boton_Idioma.setText("Idioma");
        boton_Idioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_IdiomaActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Idioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 240, 80));

        botonSonido.setBackground(new java.awt.Color(0, 0, 0));
        botonSonido.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        botonSonido.setForeground(new java.awt.Color(255, 255, 255));
        botonSonido.setText("Quitar sonido");
        botonSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSonidoActionPerformed(evt);
            }
        });
        jPanel1.add(botonSonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 240, 80));

        boton_Volver.setBackground(new java.awt.Color(0, 0, 0));
        boton_Volver.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_Volver.setForeground(new java.awt.Color(255, 255, 255));
        boton_Volver.setText("Volver");
        boton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 240, 80));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/fondo_partidas.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 660));

        linea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        linea1.setText("------------------------------------------------------------------------------------------------------------");
        jPanel1.add(linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 710, 30));

        linea2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        linea2.setText("------------------------------------------------------------------------------------------------------------");
        jPanel1.add(linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 710, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_VolverActionPerformed
        dispose();
        VentanaGris a = new VentanaGris();
        a.setVisible(true);

    }//GEN-LAST:event_boton_VolverActionPerformed

    private void boton_IdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_IdiomaActionPerformed

        JOptionPane.showMessageDialog(null, "Solo español,te jodes y estudias.");

    }//GEN-LAST:event_boton_IdiomaActionPerformed

    private void boton_CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_CreditosActionPerformed

        JOptionPane.showMessageDialog(null, " Creado por: LS \n Desarrollado por: LS \n Musica puesta por: LS");


    }//GEN-LAST:event_boton_CreditosActionPerformed

    private void botonSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSonidoActionPerformed

        if (sonido) {
            botonSonido.setText("Quitar sonido");
            sonido = !sonido;
            music.play();

        } else {
            botonSonido.setText("Activar sonido");
            sonido = !sonido;
          music.stop();
        }
    }//GEN-LAST:event_botonSonidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonSonido;
    private javax.swing.JButton boton_Creditos;
    private javax.swing.JButton boton_Idioma;
    private javax.swing.JButton boton_Volver;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel linea1;
    private javax.swing.JLabel linea2;
    // End of variables declaration//GEN-END:variables
}
