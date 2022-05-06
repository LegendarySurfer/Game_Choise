package gestor;

//Todo el texto en español prologo
import java.util.Scanner;

public class Textos {

    //-----------------------------PROLOGO -----------------------------
    public static String nombrePersonanje() {
        String texto = "Cierras los ojos y piensas ¿Cómo me llamaba?";
        return texto;
  
    }
    
     public static String nombrePerro() {
        String texto = "Creo recordar que tenia un perro ¿Cómo se  llamaba?";
        return texto;
  
    }
    
    
    

    //------------------------------------------------------------------------
    public static String pideCadena() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine().toLowerCase().trim();
    }
    //------------------------------------------------------------------------
}
