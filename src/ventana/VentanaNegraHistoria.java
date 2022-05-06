package ventana;

import gestor.Gestor_Jugador;
import gestor.Textos;
import javax.swing.JOptionPane;
import modelo.Jugador;

public class VentanaNegraHistoria extends javax.swing.JFrame {

    public VentanaNegraHistoria() {
        initComponents();
        this.setLocationRelativeTo(null); //PONE LA VENTANA EN EL CENTRO

        String texto = Textos.nombrePersonanje();
        texto_historia.setText(texto);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        texto_historia = new javax.swing.JLabel();
        boton_siguiente = new javax.swing.JButton();
        nombre_Personaje = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        fondo_Negro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto_historia.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(texto_historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1000, 100));

        boton_siguiente.setBackground(new java.awt.Color(0, 0, 0));
        boton_siguiente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        boton_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        boton_siguiente.setText("Siguiente");
        boton_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_siguienteActionPerformed(evt);
            }
        });
        jPanel2.add(boton_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 340, 190, 70));

        nombre_Personaje.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_Personaje.setForeground(new java.awt.Color(0, 0, 0));
        nombre_Personaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_PersonajeActionPerformed(evt);
            }
        });
        jPanel2.add(nombre_Personaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 310, 50));

        titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("----------------------------   PROLOGO   --------------------------------------------");
        jPanel2.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 460, 90));

        fondo_Negro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/negro.jpg"))); // NOI18N
        jPanel2.add(fondo_Negro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombre_PersonajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_PersonajeActionPerformed


    }//GEN-LAST:event_nombre_PersonajeActionPerformed

    private void boton_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_siguienteActionPerformed

        if (nombre_Personaje.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "¿Como?");
        } else {
            String personaje = nombre_Personaje.getText();
            nombre_Personaje.setText("");
            String texto = Textos.nombrePerro();
            texto_historia.setText(texto);
            String perro = nombre_Personaje.getText();
            Jugador j = new Jugador(personaje, perro, 1);
            Gestor_Jugador.meterJugador(j);
                    
        }


    }//GEN-LAST:event_boton_siguienteActionPerformed

    private void guardaPartida() {

        nombre_Personaje.getText();
        int puntoPartida = 1;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_siguiente;
    private javax.swing.JLabel fondo_Negro;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre_Personaje;
    private javax.swing.JLabel texto_historia;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
