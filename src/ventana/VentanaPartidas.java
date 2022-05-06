package ventana;

public class VentanaPartidas extends javax.swing.JFrame {

    public VentanaPartidas() {
        initComponents();
        this.setLocationRelativeTo(null); //PONE LA VENTANA EN EL CENTRO
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombrePersonajeUno = new javax.swing.JLabel();
        nombrePersonajeDos = new javax.swing.JLabel();
        texto_Tiempo_Primer = new javax.swing.JLabel();
        texto_donde_va_tiempo_primero = new javax.swing.JLabel();
        texto_donde_va_tiempo_segundo = new javax.swing.JLabel();
        texto_donde_va_tiempo_tercero = new javax.swing.JLabel();
        texto_Tiempo_Segundo = new javax.swing.JLabel();
        texto_Tiempo_tercer = new javax.swing.JLabel();
        nombrePersonajeTres = new javax.swing.JLabel();
        nombre_primero = new javax.swing.JLabel();
        nombre_tercero = new javax.swing.JLabel();
        nombre_segundo = new javax.swing.JLabel();
        linea = new javax.swing.JLabel();
        lineaDos = new javax.swing.JLabel();
        boton_Volver = new javax.swing.JButton();
        boton_primeraPartida = new javax.swing.JButton();
        boton_segundaPartida = new javax.swing.JButton();
        boton_TerceraPartida = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        linea1 = new javax.swing.JLabel();
        linea2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombrePersonajeUno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombrePersonajeUno.setForeground(new java.awt.Color(255, 255, 255));
        nombrePersonajeUno.setText("---");
        jPanel1.add(nombrePersonajeUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 380, 30));

        nombrePersonajeDos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombrePersonajeDos.setForeground(new java.awt.Color(255, 255, 255));
        nombrePersonajeDos.setText("---");
        jPanel1.add(nombrePersonajeDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 320, 40));

        texto_Tiempo_Primer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        texto_Tiempo_Primer.setForeground(new java.awt.Color(255, 255, 255));
        texto_Tiempo_Primer.setText("Tiempo:");
        jPanel1.add(texto_Tiempo_Primer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 80, 40));

        texto_donde_va_tiempo_primero.setText("Proximamente");
        jPanel1.add(texto_donde_va_tiempo_primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 280, 30));

        texto_donde_va_tiempo_segundo.setText("Proximamente");
        jPanel1.add(texto_donde_va_tiempo_segundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 330, 30));

        texto_donde_va_tiempo_tercero.setText("Proximamente");
        jPanel1.add(texto_donde_va_tiempo_tercero, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 526, 370, 20));

        texto_Tiempo_Segundo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        texto_Tiempo_Segundo.setForeground(new java.awt.Color(255, 255, 255));
        texto_Tiempo_Segundo.setText("Tiempo:");
        jPanel1.add(texto_Tiempo_Segundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 70, 40));

        texto_Tiempo_tercer.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        texto_Tiempo_tercer.setForeground(new java.awt.Color(255, 255, 255));
        texto_Tiempo_tercer.setText("Tiempo:");
        jPanel1.add(texto_Tiempo_tercer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 520, 70, 30));

        nombrePersonajeTres.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombrePersonajeTres.setForeground(new java.awt.Color(255, 255, 255));
        nombrePersonajeTres.setText("---");
        jPanel1.add(nombrePersonajeTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 460, 370, 40));

        nombre_primero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_primero.setForeground(new java.awt.Color(255, 255, 255));
        nombre_primero.setText("Nombre:");
        jPanel1.add(nombre_primero, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 80, 50));

        nombre_tercero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_tercero.setForeground(new java.awt.Color(255, 255, 255));
        nombre_tercero.setText("Nombre:");
        jPanel1.add(nombre_tercero, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 100, 40));

        nombre_segundo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nombre_segundo.setForeground(new java.awt.Color(255, 255, 255));
        nombre_segundo.setText("Nombre:");
        jPanel1.add(nombre_segundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 80, 40));

        linea.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        linea.setForeground(new java.awt.Color(255, 255, 255));
        linea.setText("------------------------------------------------------------------------------------------------------------");
        jPanel1.add(linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 710, 30));

        lineaDos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lineaDos.setForeground(new java.awt.Color(255, 255, 255));
        lineaDos.setText("------------------------------------------------------------------------------------------------------------");
        jPanel1.add(lineaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 700, -1));

        boton_Volver.setBackground(new java.awt.Color(0, 0, 0));
        boton_Volver.setForeground(new java.awt.Color(255, 255, 255));
        boton_Volver.setText("Volver");
        boton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_VolverActionPerformed(evt);
            }
        });
        jPanel1.add(boton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 584, 110, 50));

        boton_primeraPartida.setBackground(new java.awt.Color(102, 0, 0));
        boton_primeraPartida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_primeraPartida.setForeground(new java.awt.Color(255, 255, 255));
        boton_primeraPartida.setText("Primer Espacio");
        boton_primeraPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_primeraPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(boton_primeraPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 280, 100));

        boton_segundaPartida.setBackground(new java.awt.Color(102, 0, 0));
        boton_segundaPartida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_segundaPartida.setForeground(new java.awt.Color(255, 255, 255));
        boton_segundaPartida.setText("Segundo Espacio");
        boton_segundaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_segundaPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(boton_segundaPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 280, 110));

        boton_TerceraPartida.setBackground(new java.awt.Color(102, 0, 0));
        boton_TerceraPartida.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        boton_TerceraPartida.setForeground(new java.awt.Color(255, 255, 255));
        boton_TerceraPartida.setText("Tercer Espacio");
        boton_TerceraPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_TerceraPartidaActionPerformed(evt);
            }
        });
        jPanel1.add(boton_TerceraPartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 280, 120));

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

    private void boton_primeraPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_primeraPartidaActionPerformed
        
        //Comprobar que no exista ya la partida
        
        
        dispose();
        VentanaNegraHistoria a = new VentanaNegraHistoria();
        a.setVisible(true);

    }//GEN-LAST:event_boton_primeraPartidaActionPerformed

    private void boton_segundaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_segundaPartidaActionPerformed
       //Guardar partida
        dispose();
        VentanaNegraHistoria a = new VentanaNegraHistoria();
        a.setVisible(true);
    }//GEN-LAST:event_boton_segundaPartidaActionPerformed

    private void boton_TerceraPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_TerceraPartidaActionPerformed
        //Guardar partida
        dispose();
        VentanaNegraHistoria a = new VentanaNegraHistoria();
        a.setVisible(true);
    }//GEN-LAST:event_boton_TerceraPartidaActionPerformed

    private int x, y;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_TerceraPartida;
    private javax.swing.JButton boton_Volver;
    private javax.swing.JButton boton_primeraPartida;
    private javax.swing.JButton boton_segundaPartida;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel linea;
    private javax.swing.JLabel linea1;
    private javax.swing.JLabel linea2;
    private javax.swing.JLabel lineaDos;
    private javax.swing.JLabel nombrePersonajeDos;
    private javax.swing.JLabel nombrePersonajeTres;
    private javax.swing.JLabel nombrePersonajeUno;
    private javax.swing.JLabel nombre_primero;
    private javax.swing.JLabel nombre_segundo;
    private javax.swing.JLabel nombre_tercero;
    private javax.swing.JLabel texto_Tiempo_Primer;
    private javax.swing.JLabel texto_Tiempo_Segundo;
    private javax.swing.JLabel texto_Tiempo_tercer;
    private javax.swing.JLabel texto_donde_va_tiempo_primero;
    private javax.swing.JLabel texto_donde_va_tiempo_segundo;
    private javax.swing.JLabel texto_donde_va_tiempo_tercero;
    // End of variables declaration//GEN-END:variables

}
