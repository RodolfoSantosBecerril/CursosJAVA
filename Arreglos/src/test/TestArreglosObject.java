/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import damian.Persona;

/**
 *
 * @author black
 */
public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[]=new Persona[2];
        personas[0]= new Persona ("rodolfo");
        
        personas[1]= new Persona ("rodolfo2");
        System.out.println("persona1"+personas[0]);
        System.out.println("persona2"+personas[1]);
        for(int i = 0; i<personas.length; i++){
            System.out.println("personas "+i+"="+personas[i]);
        }
    }
    
}
