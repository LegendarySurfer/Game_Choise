package gestor;

//Todo el texto en español en diferentes prologos

import java.util.Scanner;

public class Textos {
    
    //-----------------------------PROLOGO -----------------------------
    
   public static String prologo(){
      String texto="Cierras los ojos y piensas ¿Cómo me llamaba?";
     return texto;         
       
       
   }
    
    
    
    
    
    
    
    
    
    
    
    
    //------------------------------------------------------------------------
    public static String pideCadena(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine().toLowerCase().trim();
    }
    //------------------------------------------------------------------------
}
