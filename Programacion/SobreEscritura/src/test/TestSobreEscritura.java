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
public class TestSobreEscritura {

    public static void main(String[] args) {
//        GerenteClaseHija gerente1=new GerenteClaseHija("Rodolfo", 5000, "polanco");
//        System.out.println("gerente ="+gerente1.obtenerDetalles());
        EmpleadoClasePadre empleado = new EmpleadoClasePadre("Rodolfo", 5000);
        imprimir(empleado);

       // System.out.println("empleado = " + empleado.obtenerDetalles());
        GerenteClaseHija gerente = new GerenteClaseHija("Santos", 10000, "polanco");
        // System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);
    }

    //metodo polimorfismo 
    //polimorfismo es decir multiples comportamientos en los que se apuntan en memoria
    public static void imprimir(EmpleadoClasePadre empleado) {
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }

}
