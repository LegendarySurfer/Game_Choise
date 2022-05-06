package gestor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;
import modelo.Jugador;
//----------------------------- PROLOGO ------------------------------------
//Todo el texto en español prologo

public class TextosEspanol {

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

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "Te despiertas por el agobiante calor de verano, mientras mirabas el techo, te apetece: \n 1- Jugar a la consola que tienes en el salón."
                    + " \n 2- Ir a la nevera para comer algo. \n 3- Ir a pasear a  " + perro + ".";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return "null";
    }

    //-------------------------- Primera Opcion --------------------------------
    //De las primeras opciones(Dara a elegir entre dos opciones)
    public static String textoDeLaPrimeraOpcion() {
        String texto = "Te incorporas para jugar y miras los diferentes juegos que hay: "
                + "\n 1- Calculo Math. \n 2- Guess the answer.";
        return texto;

    }

    public static String textoMedio() {
        String texto = "Enciendes la tele, la consola y empiezas a jugar, el"
                + " juego trata sobre retos matemáticos,¿Podrás superarlos?";
        return texto;

    }

    public static String respuestaMatematica() {
        String texto = "Cuanto es 100-50+200-15+(100-50):"
                + "\n 1- La respuesta es 285."
                + "\n 2- La respuesta es 305.";
        return texto;

    }

    public static String primeraRespuesta() {
        String texto = "¡¡Has acertado!! Ahora se complicara un poco más¿preparado?"
                + "\n Cuanto es (100-35)+(50-45)+200:"
                + "\n 1- La respuesta es 270."
                + "\n 2- La respuesta es 280.";
        return texto;

    }

    public static String finalUno() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "¡¡Has vuelto a acertar !! Después de estar un poco más "
                    + "jugando no te apetece seguir jugando y decides sacar a "
                    + "pasear a " + perro + " ya que lleva un rato ladrándote para que lo "
                    + "saques a pasear .";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "null";
    }

    public static String finalDos() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "La respuesta es incorrecta, te cansas de este juego "
                    + "y te vas a pasear a " + perro + ".";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "null";
    }

    public static String segundaRespuesta() {
        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "Has fallado, después de este difícil reto te das cuenta "
                    + "que " + perro + " te lleva ladrando un rato y te preparas para sacarlo a pasear.";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "null";
    }

    //Habla el personaje por primera vez
    public static String textoDeLaSegundaOpcion() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String personaje = j.getNombrePersonaje();
            String texto = "Enciendes la tele , la consola y empiezas a jugar, el "
                    + "juego trata sobre retos , ¿Podrás superarlos?"
                    + "\n Vamos con tu primer reto: ¿Cómo se llama el creador de este juego?"
                    + "\n " + personaje + ":¿Juego?"
                    + "\n 1- LS."
                    + "\n 2- PS.";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "null";

    }

    public static String finParteUno() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String personaje = j.getNombrePersonaje();
            String perro = j.getNombrePerro();
            String texto = "¡¡Has acertado!! Pasamos a la siguiente ronda."
                    + "\n ¿Qué estabas haciendo antes de empezar a jugar a este juego?"
                    + "\n" + personaje + ":¿Cómo sabe lo que estaba haciendo?"
                    + "\n 1- Mirar el techo."
                    + "\n 2- Ver la tele.";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "null";

    }

    public static String finSeguroUno() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String personaje = j.getNombrePersonaje();
            String perro = j.getNombrePerro();
            String texto = "¡¡Has acertado!! " + personaje + " :¿Cómo sabia el juego todo esto?\n"
                    + " Decides irte a sacar a pasear a " + perro + " antes de que sea muy tarde.";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "null";

    }

    public static String finSeguroDos() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "Has fallado, te incomoda la pregunta así que"
                    + "  prefieres sacar a pasear a " + perro + " antes de que sea tarde.";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "null";

    }

    public static String finParteDos() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String personaje = j.getNombrePersonaje();
            String perro = j.getNombrePerro();
            String texto = "Has fallado. " + personaje + ":Que clase de juego es "
                    + "este, mejor voy a pasear a " + perro + " antes de que sea mas tarde.";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return "null";

    }

    //------------------------ Segunda Opcion ----------------------------------
    public static String opcionDos() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "Te levantas del sofá, cuando estás a punto de ver que hay"
                    + " en la nevera, " + perro + " te ladra para que lo lleves a pasear:"
                    + "\n 1- Ignorarlo. \n 2- Te preparas para ir a pasear "
                    + " a " + perro + ".Cuando ya estas listo vas con " + perro + " a la puerta para pasearlo.";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return "null";

    }

    public static String opcionDosUno() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "No le haces caso a " + perro + ", más tarde tu hermana aparece "
                    + "preguntado porque esta " + perro + " tan alterado, al contarle que "
                    + "no lo has sacado a pasear te obliga a sacarlo a pasear.";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return "null";

    }

    //------------------------- Tercera Opcion ---------------------------------
    public static String opcionTres() {

        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "Estas a punto de pasear a " + perro + " pero en verdad te dan "
                    + "ganas de jugar a la consola del salón, piensas que puede sacarlo tu hermana:"
                    + "\n 1- Prepararse para ira a pasear a <perro> de todas formas. "
                    + "\n 2- Preguntarle a tu hermana.";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return "null";

    }

    //Opcion uno lleva directamente a final(no metodo)
    public static String opcionTresDos() {
        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "Subes para ir a la habitación de tu hermana, parece que"
                    + " esta  jugando a un juego de fantasía en el ordenar,"
                    + " aunque según viste en las noticias parece que da algún tipo "
                    + "de ∞ ╰╮❪ ❫ en algunas personas."
                    + "\n 1- No la molestas y vas a sacar a " + perro + "."
                    + "\n 2- Le preguntas si puede sacar a  " + perro + ".";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return "null";
    }

    //La primera opcion lleva al final 
    public static String opcionTresDosDos() {
        try {
            FileInputStream ficheroEntrada = new FileInputStream("PrimeraPartida");
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            //Se leen objeto de la clase Jugador
            Jugador j = (Jugador) objetoEntrada.readObject();
            objetoEntrada.close();
            String perro = j.getNombrePerro();
            String texto = "Te contesta que ahora no puede, te recompensara luego"
                    + " si vas a pasear a " + perro + ".";
            return texto;

        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return "null";
    }

    //------------------------ FINAL -------------------------------------------
    public static String opcionFinal() {
        String texto = "Sales por la puerta con <perro>,todo va bien, lo llevas al parque de siempre."
                + "Para que no sea tan aburrido llamas a tu amigo para dar un paseo por el parque ."
                + "\n Después de un rato de estar en el parque hablando os vais cada uno a su casa, "
                + " cómo los dos vivís lejos del uno y ya es casi de noches te "
                + "diriges rápido a casa no sea que tenga un ∞ ╰╮❪ ❫ como habías escuchado en las noticias."
                + "\n Justo antes de llegar a casa se pone el semáforo en rojo y tienes que esperar,al "
                + "lado tuyo divisas a una persona, no logras verle la cara porque va muy "
                + " tapado pero ves que va a cruzar la acera, para impedir un accidente corres "
                + " a detenerlo pero antes de agarrarlo miras a ver si viene algún vehículo "
                + " pero ya es tarde, solo ves dos rayos de luz dirigiéndose a ti muy rápido."
                + "\n Sin pensarlo dos veces cierras los ojos, dé repente todo estaba tranquilo, "
                + " lo único que sientes es como si tu cuerpo flotara en el espacio, todo estaba "
                + " en silencio, no sabes lo que pasa, abres los ojos y no crees lo "
                + " que ves delante tuyo.";
        return texto;

    }

    //--------------------------------------------------------------------------
    public static String pideCadena() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine().toLowerCase().trim();
    }
    //--------------------------------------------------------------------------
}
