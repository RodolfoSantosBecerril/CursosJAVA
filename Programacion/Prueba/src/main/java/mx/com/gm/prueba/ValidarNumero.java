/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.prueba;

import java.util.Scanner;

/**
 *
 * @author black
 */
public class ValidarNumero {

    public static void main(String[] args) {
        

        Scanner pedirNumero = new Scanner(System.in);
        int n =0;

        System.out.println("Ingrese el número a evaluar");
        n = pedirNumero.nextInt();
               if (n < 0) {
            System.out.println("Ingrese otro numero");
        } 
        else if (n == 0) {
            System.out.println("El cero no es primo ni compuesto");
        } //detectar si es primo
        else if (n < 1) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) 
                    n++;
                }
            }
            if (n == 2) {
                System.out.println("es primo");
                
            } else {
                System.out.println("Es compuesto");

            }
            

        
        }
        

    }

