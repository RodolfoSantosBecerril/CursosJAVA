/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import excepciones.OperacionExcepcion;

/**
 *
 * @author black
 */
public class Aritmetica {
     public static int division(int numerador, int denominador)
     throws OperacionExcepcion{ //en la firma del metodo tambien usamos throws
         if (denominador==0){
             throw new  OperacionExcepcion("Division entre 0");    //throw es arrojar,  creamos un nuevo objeto de tipo excepcion
          //se usa el metodo de la clase OperacionException
         }
         return numerador/denominador;
           
     }    
}
