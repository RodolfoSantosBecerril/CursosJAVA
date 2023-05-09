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
public class TestSobreInstanceOf {

    public static void main(String[] args) {
//        GerenteClaseHija gerente1=new GerenteClaseHija("Rodolfo", 5000, "polanco");
//        System.out.println("gerente ="+gerente1.obtenerDetalles());
         EmpleadoClasePadre empleado = new EmpleadoClasePadre("Rodolfo", 5000);
        //determinarTipo(empleado);
      //GerenteClaseHija gerente = new GerenteClaseHija("Santos", 10000, "polanco");
       
      empleado =new GerenteClaseHija ("Santos", 10000, "polanco");
       
      determinarTipo(empleado);
    }

    //metodo polimorfismo 
    //polimorfismo es decir multiples comportamientos en los que se apuntan en memoria
    public static void determinarTipo(EmpleadoClasePadre empleado) {
     if(empleado instanceof   GerenteClaseHija){
         System.out.println("es gerente");
         GerenteClaseHija gerente= (GerenteClaseHija)empleado;//Conversion para asignar a la variable
         System.out.println("gerente = " + gerente.getDepartamento());
    }
     else if (empleado instanceof EmpleadoClasePadre){
         System.out.println("Es tipo empleado");
     }
     else if (empleado instanceof Object){
         System.out.println("es de tipo objet");
     }
    }

}
