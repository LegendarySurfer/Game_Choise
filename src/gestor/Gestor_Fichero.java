package gestor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import modelo.Jugador;

public class Gestor_Fichero {

    public static void ficheroGuardaDatosUsuarioDelPrimero(Jugador j) {
        try {
            FileOutputStream fos = new FileOutputStream("PrimeraPartida");
            ObjectOutputStream salida = new ObjectOutputStream(fos);
            salida.writeObject(j);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido crear la partida guardada.");
        }

    }

    public static void ficheroGuardaDatosUsuarioDelSegundo(Jugador j) {
        try {
            FileOutputStream fos = new FileOutputStream("SegundaPartida");
            ObjectOutputStream salida = new ObjectOutputStream(fos);
            salida.writeObject(j);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido crear la partida guardada.");
        }

    }

    public static void ficheroGuardaDatosUsuarioDelTercero(Jugador j) {
        try {
            FileOutputStream fos = new FileOutputStream("TerceraPartida");
            ObjectOutputStream salida = new ObjectOutputStream(fos);
            salida.writeObject(j);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido crear la partida guardada.");
        }
    }

}
