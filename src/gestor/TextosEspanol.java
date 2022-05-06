package gestor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import modelo.Jugador;
//----------------------------- PROLOGO ------------------------------------
//Todo el texto en español prologo

public class TextosEspanol {

    public static String setPersonaje() {
        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String personaje = j.getNombrePersonaje();
            return personaje;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return "null";
    }

    public static String setPerro() {
        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            return perro;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "null";
    }

    //-------------------------- Introduccion ---------------------------------- 
    public static String nombrePersonanje() {
        String texto = "Cierras los ojos y piensas ¿Cómo me llamaba?";
        return texto;

    }

    public static String nombrePerro() {
        String texto = "Creo recordar que tenia un perro ¿Cómo se  llamaba?";
        return texto;

    }

    //---------------------------Opcion General --------------------------------
    //Dara a elegir tres opciones  Solo para la primera partida guardada
    public static String tresElecciones() {

        String texto = "<html>Te despiertas por el agobiante calor de verano, "
                + "mientras mirabas el techo, te apetece: "
                + " <br> 1- Jugar a la consola que tienes en el salón."
                + " <br> 2- Ir a la nevera para comer algo. "
                + " <br> 3- Ir a pasear a " + setPerro() + "</html>.";
        return texto;

    }

    //-------------------------- Primera Opcion --------------------------------
    //De las primeras opciones(Dara a elegir entre dos opciones)
    public static String textoDeLaPrimeraOpcion() {
        String texto = "<html>Te incorporas para jugar y miras los diferentes juegos que hay: "
                + "<br> 1- Calculo Math."
                + "<br> 2- Guess the answer.</html>";
        return texto;

    }

    public static String textoMedio() {
        String texto = "<html>Enciendes la tele, la consola y empiezas a jugar, el"
                + " juego trata sobre retos matemáticos,¿Podrás superarlos?.</html>";
        return texto;

    }

    public static String respuestaMatematica() {
        String texto = "<html>Cuanto es 100-50+200-15+(100-50):"
                + "<br> 1- La respuesta es 285."
                + "<br> 2- La respuesta es 305.</html>";
        return texto;

    }

    public static String primeraRespuesta() {
        String texto = "<html>¡¡Has acertado!! Ahora se complicara un poco más¿preparado?"
                + "<br> Cuanto es (100-35)+(50-45)+200:"
                + "<br> 1- La respuesta es 270."
                + "<br> 2- La respuesta es 280.</html>";
        return texto;

    }

    public static String finalUno() {

        String texto = "<html>¡¡Has vuelto a acertar !! Después de estar un poco más "
                + "jugando no te apetece seguir jugando y decides sacar a "
                + "pasear a " + setPerro() + " ya que lleva un rato ladrándote para que lo "
                + "saques a pasear .</html>";
        return texto;

    }

    public static String finalDos() {

        String texto = "<html>La respuesta es incorrecta, te cansas de este juego "
                + "y te vas a pasear a " + setPerro() + ".</html>.";
        return texto;
    }

    public static String segundaRespuesta() {

        String texto = "<html>Has fallado, después de este difícil reto te das cuenta "
                + "que " + setPerro() + " te lleva ladrando un rato y te preparas para sacarlo a pasear.</html>";
        return texto;
    }

    //Habla el personaje por primera vez
    public static String textoDeLaSegundaOpcion() {

            String texto = "<html>Enciendes la tele, la consola y empiezas a jugar, el "
                    + "juego trata sobre retos  , ¿Podrás superarlos?"
                    + "<br> Vamos con tu primer reto: ¿Cómo se llama el creador de este juego?"
                    + "<br> " + setPersonaje() + ":¿Juego?"
                    + "<br> 1- LS."
                    + "<br> 2- PS.</html>";
            return texto;

    }

    public static String finParteUno() {

        String texto = "<html>¡¡Has acertado!! Pasamos a la siguiente ronda."
                + "<br> ¿Qué estabas haciendo antes de empezar a jugar a este juego?"
                + "<br>" + setPersonaje() + ":¿Cómo sabe lo que estaba haciendo?"
                + "<br> 1- Mirar el techo."
                + "<br> 2- Ver la tele.</html>";
        return texto;

    }

    public static String finSeguroUno() {

        String texto = "<html>¡¡Has acertado!! <br>" + setPersonaje() + " :"
                + "¿Cómo sabia el juego todo esto?"
                + "<br>Decides irte a sacar a pasear a " + setPerro() + " antes "
                + "de que sea muy tarde.</html>";
        return texto;

    }

    public static String finSeguroDos() {

        String texto = "<html>Has fallado, te incomoda la pregunta así que"
                + " prefieres sacar a pasear a " + setPerro() + " "
                + "antes de que sea tarde.</html>";
        return texto;

    }

    public static String finParteDos() {

        String texto = "<html>Has fallado. <br>" + setPersonaje() + ":Que clase de juego es "
                + "este, mejor voy a pasear a " + setPerro() + " "
                + "antes de que sea mas tarde.</html>";
        return texto;

    }

    //------------------------ Segunda Opcion ----------------------------------
    public static String opcionDos() {

        String texto = "<html>Te levantas del sofá, cuando estás a punto de ver que hay"
                + " en la nevera, " + setPerro() + " te ladra para que lo lleves a pasear:"
                + "<br> 1- Ignorarlo. "
                + "<br> 2- Te preparas para ir a pasear a " + setPerro() + "."
                + "Cuando ya estas listo vas con " + setPerro() + " a la puerta para pasearlo.</html>";
        return texto;

    }

    public static String opcionDosUno() {

        String texto = "<html>No le haces caso a " + setPerro() + ", más tarde tu hermana aparece "
                + "preguntado porque esta " + setPerro() + " tan alterado, al contarle que "
                + "no lo has sacado a pasear te obliga a sacarlo a pasear.</html>";
        return texto;

    }

    //------------------------- Tercera Opcion ---------------------------------
    public static String opcionTres() {

        String texto = "<html>Estas a punto de pasear a " + setPerro() + " pero en verdad te dan "
                + "ganas de jugar a la consola del salón, piensas que puede sacarlo tu hermana:"
                + "<br> 1- Prepararse para ira a pasear a <perro> de todas formas. "
                + "<br> 2- Preguntarle a tu hermana.</html>";
        return texto;

    }

    //Opcion uno lleva directamente a final(no metodo)
    public static String opcionTresDos() {

        String texto = "<html>Subes para ir a la habitación de tu hermana, parece que"
                + " esta  jugando a un juego de fantasía en el ordenar,"
                + " aunque según viste en las noticias parece que da algún tipo "
                + "de ∞ ╰╮❪ ❫ en algunas personas."
                + "<br> 1- No la molestas y vas a sacar a " + setPerro() + "."
                + "<br> 2- Le preguntas si puede sacar a  " + setPerro() + ".</html>";
        return texto;

    }

    //La primera opcion lleva al final 
    public static String opcionTresDosDos() {

        String texto = "<html>Te contesta que ahora no puede, te recompensara luego"
                + " si vas a pasear a " + setPerro() + "<html>.";
        return texto;
    }

    //------------------------ FINAL -------------------------------------------
    public static String opcionFinal() {
        String texto = "<html>Sales por la puerta con " + setPerro() + ",todo va "
                + "bien, lo llevas al parque de siempre.Para que no sea tan "
                + "aburrido llamas a tu amigo para dar un paseo por el parque."
                + "<br>Después de un rato de estar en el parque hablando os vais "
                + "cada uno a su casa,cómo los dos vivís lejos del uno y ya es "
                + "casi de noches te diriges rápido a casa no sea que tenga "
                + "un ∞ ╰╮❪ ❫ como habías escuchado en las noticias."
                + "<br> Justo antes de llegar a casa se pone el semáforo en rojo"
                + " y tienes que esperar,al lado tuyo divisas a una persona,"
                + " no logras verle bien ya que va con una sudadera gris con la "
                + "capucha puesta, ves que va a cruzar la acera, para impedir "
                + "un accidente corres a detenerlo pero antes de agarrarlo miras"
                + " a ver si viene algún vehículo pero ya es tarde, solo ves dos "
                + "rayos de luz dirigiéndose a ti muy rápido.<br> Sin pensarlo "
                + "dos veces cierras los ojos, dé repente todo estaba tranquilo, "
                + "lo único que sientes es como si tu cuerpo flotara en el espacio, "
                + "todo estaba en silencio, no sabes lo que pasa, abres los ojos "
                + "y no crees lo que ves delante tuyo.";
        return texto;

    }

    //--------------------------------------------------------------------------
    public static String pideCadena() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine().toLowerCase().trim();
    }
    //--------------------------------------------------------------------------
}
