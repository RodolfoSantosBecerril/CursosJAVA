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
import domain.*; //clases importadas 
public class TestConversionObjetos {
    public static void main(String[] args) { 
        EmpleadoClasePadre empleado; // creacuion de objeto
        empleado= new Escritor("Rodolfo",5000,TipoEscritura.CLASICO); //asignacion de tipo escritor a un objeto de clase padre 
    //    System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles()); //LLamada al metdo obtenerDetalles
        //DOWNCASTING
        //((Escritor)empleado).getTipoEscritura();
        Escritor escritor=(Escritor)empleado;  //Asi se escribe para  convertir de un tipo de la clase  padre a un tipo de la clase hija 
        escritor.getTipoEscritura();
        //UPCASTING
        EmpleadoClasePadre empleado2= escritor;//Así se escribe para convertir un tipo de la clase hijo a un tipo de la clase padre 
        System.out.println(empleado2.obtenerDetalles()); 
    }
    
}
