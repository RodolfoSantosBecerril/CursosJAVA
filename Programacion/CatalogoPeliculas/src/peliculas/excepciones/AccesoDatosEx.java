/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas.excepciones;

/**
 *
 * @author black
 */
public class AccesoDatosEx extends Exception{
    public AccesoDatosEx(String mensaje){
        super(mensaje); //se propaga a la clase padre   
    }
    
    
}
