/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import genericos.ClaseGenericas;

/**
 *
 * @author black
 */
public class TestGenerics {
 
    public static void main(String[] args) {
    ClaseGenericas<Integer> objetoInt=new ClaseGenericas(15);
    objetoInt.obtnerTipo();
    ClaseGenericas<String> objectoString= new ClaseGenericas("Rodo");
    objectoString.obtnerTipo();
 
    
    }
    
}
