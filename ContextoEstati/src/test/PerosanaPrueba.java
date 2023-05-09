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
public class PerosanaPrueba {
    private int contador;
    public static void main(String[] args) {
        Persona persona1= new Persona("Rodolfo");
        //System.out.println("persona"+persona1);
        Persona persona2 = new Persona ("santos");
        //System.out.println("persona"+persona2);
        imprimir(persona1);
        imprimir(persona2);
    }
    public static void imprimir(Persona persona){
        System.out.println("persona"+persona); 
    }
    public int  getContador(){
        imprimir(new Persona("Reno"));
        return this.contador;
    }
}
