/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author black
 */
public class TestArreglos {
    public static void main(String[] args) {
        int edades[]=new int [3]; //se declara = se instancia 
        System.out.println("edades:"+edades);
        
        edades[0]=10;
        System.out.println("elemento 0: "+edades[0]);
         edades[1]=13344;
        System.out.println("elemento 1: "+edades[1]);
         edades[2]=2123;
        System.out.println("elemento 2: "+edades[2]);
        for (int i=0; i<edades.length; i++) {//.length llega hasta el utimo elemento
            System.out.println("elemento: "+i+" edades" + ": " + edades[i]);
        
    }
        String frutas[]={"manzana","limon","uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("fruta:"+frutas[i] );
        }
}
}