/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivo;

import java.io.*;

/**
 *
 * @author black
 */
public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close(); //Se crea el archivo 
            System.out.println("Se ha creado el archvo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);

        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close(); //Se crea el archivo 
            System.out.println("Se ha escrito el archvo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);

        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true)); //clase intermedia
            salida.println(contenido);
            salida.close(); //Se crea el archivo 
            System.out.println("Se ha anexado informacion el archvo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while(lectura !=null){
            System.out.println("lectura = " + lectura);
            lectura=entrada.readLine();
        }
           entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }

}
