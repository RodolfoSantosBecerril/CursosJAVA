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
public class TestArgumentos {

    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4,5);
        imprimirNumeros(6,7,8);
        variosParametros("rodolfo",9, 10);
        
    }
    private static void variosParametros(String nombre,int... numeros){
        System.out.println("nombre: "+nombre);
        imprimirNumeros(numeros);
        
    }
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numeros impresos: "+numeros[i]);
            
            
        }
    }
}