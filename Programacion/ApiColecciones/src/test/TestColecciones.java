/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author black
 */
public class TestColecciones {

    public static void main(String[] args) {
        //IMPORTANTE RESPETA EL ORDEN CUANDO SE AGREGARON
        List miLista = new ArrayList(); //una lista es similar a un array y crece dinamicamente   
        //se asigna un objetos a una interface
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo");
        imprimir(miLista);
//        for (Object elemento : miLista) {//recuperamos un objeto de tipo object y lo nombramos elemento y proporcionamos la lista
//            System.out.println("elemento = " + elemento);
//        }
//        miLista.forEach(elemento -> { //esto recomienda el id, eso se llama funcion landa 
//            //for (Object elemento : miLista) {//recuperamos un objeto de tipo object y lo nombramos elemento y proporcionamos la lista
//            System.out.println("elemento = " + elemento);
//        });
        
        Set miSet=new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("viernes");
        miSet.add("Sabado");
        miSet.add("Domingo"); 
        //miSet.add("Domingo"); 
        
        imprimir(miSet);
        
        //no se puede duplicar elementos
      Map miMapa=new HashMap();
      miMapa.put("valor1", "Rodolfo1");//ene el argumento puede ir cualquier object
      miMapa.put("valor2", "Rodolfo2");
      miMapa.put("valor3", "Rodolfo3");
        //  String elemento= (String) miMapa.get("valor1"); //agregamos (String) porque para manejo de object
         // System.out.println("elemento = " + elemento);
         imprimir(miMapa.keySet());// hace interacion en cada elemento en todas la llaves
        
        imprimir(miMapa.values());//iteracion de todos los valoes
    }
      public static void imprimir(Collection coleccion){ //Collection es una interface padre de List y Set derivada de lajava.util
          coleccion.forEach(elemento -> {
              System.out.println("elemento = " + elemento);
        });
//          for(Object elemento:coleccion){
//              System.out.println("elemento = " + elemento);
//          }
     }
    }
    


