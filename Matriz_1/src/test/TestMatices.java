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
public class TestMatices {

    public static void main(String[] args) {
        int edades[][] = new int[2][3];
        System.out.println("edades" + edades);
        edades[0][0] = 1;
        edades[0][1] = 2;
        edades[1][0] = 3;
        edades[1][1] = 4;
        System.out.println(":" + edades[0][0]);
        System.out.println(":" + edades[1][0]);
        System.out.println(":" + edades[0][1]);
        System.out.println(":" + edades[1][1]);
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades " + ren + "-" + col + ":" + edades[ren][col]);
            }
        }

        String frutas[][] = {{"naranja", "limon"}, {"fresa", "zarzamora", "manzana"}};
        imprimir(frutas);
        Personas personas1[][] = new Personas[2][3];
        personas1[0][0] = new Personas("Rodolfo");
        personas1[0][1] = new Personas("santos");
        imprimir(personas1);

    }

    public static void imprimir(Object matriz[][]) {
        for (int reng = 0; reng < matriz.length; reng++) {
            for (int colu = 0; colu < matriz[reng].length; colu++) {
                System.out.println("matriz" + reng + "-" + colu + ":" + matriz[reng][colu]);
            }
        }
    }
}
