/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author black
 */
public class OperacionExcepcion extends RuntimeException {
    public OperacionExcepcion (String mensaje){ //indica mensaje de la excepcion
        super(mensaje);//inicializamos la clase 
        
    }
    
}
