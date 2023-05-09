/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author black
 */
public class Persona {
   private final int idPersona;
   private static int contadorPersonas;
   static{ // bloque estatico se ejecuta antes que el constructor y antes de un bloque no estatico
       System.out.println("Ejecucion bloque estatico");
       ++Persona.contadorPersonas;
       
   }
   
   {// Bloque de inicializacion no estatico, se ejecutan antes del constructor
       System.out.println("Ejecucion bloque No estatico o contexto dinamico");  
       this.idPersona=Persona.contadorPersonas++;
       
   }
   public Persona(){
       System.out.println("Ejecucion de constructor");
   }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
   
}
