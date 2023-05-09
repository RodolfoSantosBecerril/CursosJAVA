/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author black
 */
public class ClaseGenericas<T> {
     private T objeto;
    public ClaseGenericas(T objeto1){
        this.objeto=objeto1;
    } 
    public void obtnerTipo(){
        System.out.println(" El tipo T es:"+objeto.getClass().getSimpleName());
    }
}
