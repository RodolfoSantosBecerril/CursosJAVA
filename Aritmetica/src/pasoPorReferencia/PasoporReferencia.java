/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoPorReferencia;
import clases.Persona;

public class PasoporReferencia {
    public static void main(String[] args) {
        Persona persona1= new Persona();
        persona1.nombre="otro";
        System.out.println("Persona1 nombre"+ persona1.nombre);
        cambiaValor(persona1);
         System.out.println("Persona1  cambio nombre"+ persona1.nombre);
    }
    public static Persona cambiaValor(Persona persona){
        persona.nombre = "Cambio";
        
        return persona;
        
    }
}
