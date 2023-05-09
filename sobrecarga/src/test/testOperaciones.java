/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import operaciones.Operaciones;

/**
 *
 * @author black
 */
public class testOperaciones {
    public static void main(String[] args) {
        int  resultado = Operaciones.sumar(3, 4);
        System.out.println("resutlado"+resultado);    
        double resultado2=Operaciones.sumar(2.3, 3.4);
         
        System.out.println("resultado"+resultado2);
        double resultado3=Operaciones.sumar(4, 5L);
        System.out.println("resultado"+resultado3);
    }
    
}
