package main;

import music.MusicPlay;
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

    public static void musica() {
       // MusicPlay music=true;

        //music.setVolume(0.1f);
        //music.setNivel(1);
    }

    public static void main(String[] args) {

        iniciaPartida();

    }

}
