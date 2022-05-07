package main;

import gestor.Gestor_Fichero;
import modelo.Jugador;
import ventana.VentanaGris;
import ventana.VentanaPrincipal;

public class Menu {

    public static void iniciaPartida() {

        //Si el jugador gana el fondo deja de ser gris
        boolean juegoTerminado = false;

        if (!juegoTerminado) {
            VentanaGris a = new VentanaGris();
            a.setVisible(true);
        } else {
            VentanaPrincipal b = new VentanaPrincipal();
            b.setVisible(true);
        }
    }

    public static void main(String[] args) {
        
        //Inica la ventana
        iniciaPartida();

    }

}
