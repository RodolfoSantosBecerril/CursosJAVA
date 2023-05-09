/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dos;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class numeroPrimo {
    public static void main(String[] ARGS)
    {
        Scanner obtenerNumero = new Scanner(System.in);
        int contador,I,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = obtenerNumero.nextInt();
 
        contador = 0;
 
        for(I = 1; I <= numero; I++)
        {
            if((numero % I) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
    
}
