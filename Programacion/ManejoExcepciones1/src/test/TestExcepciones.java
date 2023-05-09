/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

/**
 *
 * @author black
 */
public class TestExcepciones {

    public static void main(String[] args) {
        int res = 0;
        try {
            res = Aritmetica.division(10, 0); //  asigna los argumentos del metodo division
            // res=10/0; //se pone aqui la execpion 
           //el resultado es el retorno del metodo de division  
        }
        catch(OperacionExcepcion e){ //se pone la excepcion de menor a mayo gerarquia
            System.out.println("Ocurrio un error de tipo operacion excepcion");
             System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error de tipo exception");
            e.printStackTrace(System.out);//imprimir fila de excepciones
            System.out.println(e.getMessage());//este metodo trae el mensaje desde throw 
        }
        finally{  //nueva palabra reservada  siempre se ejecuta 
                 //se usa para cerrar recursos 
                System.out.println("Se realizó division entre cero");
                
                 
        }
        System.out.println("resultado=" + res);
    }
}
