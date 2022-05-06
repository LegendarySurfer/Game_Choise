package modelo;

import exception.GameException;
import java.io.Serializable;

//implements para ficheros de objetos
public class Jugador implements Serializable{

    private String nombrePersonaje;
    private String nombrePerro;
    private int puntoPartida;

    public Jugador(String nombrePersonaje, String nombrePerro, int puntoPartida)throws GameException{
        setNombrePersonaje(nombrePersonaje);
        setNombrePerro(nombrePerro);
        this.puntoPartida = puntoPartida;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje)throws GameException{
        
        if(nombrePersonaje==null){
            throw new GameException("Error: El nombre del personaje no puede ser nulo");
        }
        
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro)throws GameException{
      
        if(nombrePerro==null){
           throw new GameException("Error: El nombre del perro no puede ser nulo.");
        }
          this.nombrePerro = nombrePerro;
       
    }

    public int getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(int puntoPartida) {
        this.puntoPartida = puntoPartida;
    }
    
    

}
