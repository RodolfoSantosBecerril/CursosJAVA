/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import domain.*;
/**
 *
 * @author black
 */
public class TestClasesAbstractas {
    public static void main(String[] args) {
        //no se pueden crear objetos de una clase abstracta
        //solo se pueden crear objetos de la clase hija.
        // a vece se marca como abstractas para no crear objetos de la clase padre
        FiguraGeometrica figuraGeometrica= new Rectangulo("rectangulo");//objeto de la clase hija
        figuraGeometrica.dibujar();// toma prioridad la clase hija, 
        
    
    }
    
}
