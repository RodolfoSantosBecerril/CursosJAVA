/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author black
 */
public class PersonaPrueba {
    
private int contador;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Rodolfo");
        //System.out.println("Persona1"+persona1);
        Persona persona2 = new Persona("Santos");
        // System.out.println("Persona 2"+persona2);
        imprimir(persona1);
        imprimir(persona2);
        //this.contador=10; No podemos usar this dentro de un metodo estatico

    }

    public static void imprimir(Persona persona) {
        System.out.println("Persona " + persona);
    }
    public int getContador(){
        imprimir(new Persona("otro"));
        return this.contador;
        
        
    }
}
