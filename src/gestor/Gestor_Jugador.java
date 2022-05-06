package gestor;

import java.util.ArrayList;
import java.util.ListIterator;
import modelo.Jugador;

public class Gestor_Jugador {

    //Provisional
    private static ArrayList<Jugador> listaJugador = new ArrayList<>();

    //Metera los usuarios al array
    public static void meterJugador(Jugador j) {

        listaJugador.add(j);
    }

    //Buscara el usuario
    public static Jugador buscaJugador(String nombreUsuario) {

        for (Jugador j : listaJugador) {
            if (nombreUsuario.equalsIgnoreCase(j.getNombrePersonaje())) {
                return j;
            }
        }
        return null;
    }

    //Si la cuenta es la misma que dada por parametros la borrara
    public static boolean borrarJugador(Jugador j) {

        ListIterator<Jugador> iterator = listaJugador.listIterator();

        while (iterator.hasNext()) {
            Jugador aa = iterator.next();
            if (j.getNombrePersonaje().equalsIgnoreCase(aa.getNombrePersonaje())) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
