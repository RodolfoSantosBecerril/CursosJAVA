/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import accesodatos.*;
/**
 *
 * @author black
 */
public class TestInterfaces {
    public static void main(String[] args) {
       IAccesoDatos datos=new  ImplementacionMySql();     //no podemos crear objetos de la interface
       //datos.listar();
       imprimir(datos);
       datos = new ImplementacionOracle();
       //datos.listar();
       imprimir(datos);
       
     }
    public static void imprimir(IAccesoDatos datos){ //un metodo generico que manda a llamar el objeto del metodo 
        datos.listar();
    }
}
