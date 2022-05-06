package ventana;

import music.MusicPlay;

public class VentanaGris extends javax.swing.JFrame {

    MusicPlay music = new MusicPlay();

    public VentanaGris() {

        initComponents();
        this.setLocationRelativeTo(null); //PONE LA VENTANA EN EL CENTRO
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_nuevoJuego = new javax.swing.JButton();
        boton_salirEscritorio = new javax.swing.JButton();
        boton_Opciones = new javax.swing.JButton();
        titulo_principal = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        fondo_Negro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton_nuevoJuego.setBackground(new java.awt.Color(0, 0, 0));
        boton_nuevoJuego.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_nuevoJuego.setForeground(new java.awt.Color(255, 255, 255));
        boton_nuevoJuego.setText("Continuar");
        boton_nuevoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevoJuegoActionPerformed(evt);
            }
        });
        jPanel1.add(boton_nuevoJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 310, 70));

        boton_salirEscritorio.setBackground(new java.awt.Color(0, 0, 0));
        boton_salirEscritorio.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_salirEscritorio.setForeground(new java.awt.Color(255, 255, 255));
        boton_salirEscritorio.setText("Salir al escritorio");
        boton_salirEscritorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirEscritorioActionPerformed(evt);
            }
        });
        jPanel1.add(boton_salirEscritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 310, 60));

        boton_Opciones.setBackground(new java.awt.Color(0, 0, 0));
        boton_Opciones.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_Opciones.setForeground(new java.awt.Color(255, 255, 255));
        boton_Opciones.setText("Opciones");
        boton_Opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_OpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 310, 60));

        titulo_principal.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        titulo_principal.setForeground(new java.awt.Color(255, 255, 255));
        titulo_principal.setText("GAME_CHOISE");
        jPanel1.add(titulo_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, -10, 290, 110));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/ImagenGris.jpg"))); // NOI18N
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1220, 550));

        fondo_Negro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/negro.jpg"))); // NOI18N
        fondo_Negro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fondo_NegroMouseDragged(evt);
            }
        });
        fondo_Negro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fondo_NegroMousePressed(evt);
            }
        });
        jPanel1.add(fondo_Negro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 80));

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

    private void boton_salirEscritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirEscritorioActionPerformed

        System.exit(0);
    }//GEN-LAST:event_boton_salirEscritorioActionPerformed

    private int x, y;
    private void fondo_NegroMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_NegroMouseDragged

        int x1, y1;
        x1 = evt.getXOnScreen();
        y1 = evt.getYOnScreen();

        setLocation(x1 - x, y1 - y);

    }//GEN-LAST:event_fondo_NegroMouseDragged

    private void fondo_NegroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondo_NegroMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_fondo_NegroMousePressed

    private void boton_nuevoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevoJuegoActionPerformed

        dispose();
        VentanaPartidas a = new VentanaPartidas();
        a.setVisible(true);

    }//GEN-LAST:event_boton_nuevoJuegoActionPerformed

    private void boton_OpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_OpcionesActionPerformed

        dispose();
        VentanaOpciones a = new VentanaOpciones(music);
        a.setVisible(true);

    }//GEN-LAST:event_boton_OpcionesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_Opciones;
    private javax.swing.JButton boton_nuevoJuego;
    private javax.swing.JButton boton_salirEscritorio;
    private javax.swing.JLabel fondo_Negro;
    private javax.swing.JLabel imagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titulo_principal;
    // End of variables declaration//GEN-END:variables
}
