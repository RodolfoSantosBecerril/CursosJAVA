/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author black
 */
public class PruebasPersona {

    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "Rodolfo";
        persona1.apellido = "Santos";
        persona1.desplegarInf();

        Persona persona2 = new Persona();
        System.out.println("persona1" + persona1);
        System.out.println("persona2" + persona2);
        persona2.desplegarInf();
        persona2.nombre = "otro";
        persona2.apellido = "otroejemplo";
        persona2.desplegarInf();
    }

}
