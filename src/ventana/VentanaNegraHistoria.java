package ventana;

import gestor.Textos;

public class VentanaNegraHistoria extends javax.swing.JFrame {

    public VentanaNegraHistoria() {
        initComponents();
        this.setLocationRelativeTo(null); //PONE LA VENTANA EN EL CENTRO
        
        String texto= Textos.prologo();
        texto_historia.setText(texto);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        texto_historia = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        fondo_Negro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto_historia.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(texto_historia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 1000, 100));

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo_Negro;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel texto_historia;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
