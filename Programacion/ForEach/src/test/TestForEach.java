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
public class TestForEach {
    public static void main(String[] args) {
        int edades[]={1,2,3,4,5,6};
        for(int edad: edades){
            System.out.println("edad="+edad);
        }
        Persona personas[]={new Persona ("rodolfo"),new Persona ("Santos")};
        for(Persona persona: personas){
            System.out.println("Nombres="+persona);
        }
    }
    
}
