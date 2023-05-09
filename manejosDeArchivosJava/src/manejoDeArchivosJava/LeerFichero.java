/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoDeArchivosJava;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author black
 */
public class LeerFichero {
  
    public void leer(){
    try{
       FileReader entrada = new FileReader("C:\\Users\\black\\OneDrive\\Escritorio\\archivo.txt");
       int c=entrada.read();
       while(c!=-1){
           
           c=entrada.read();
           char letra =(char)c;
           System.out.print(letra);
           
       }
       
    }
    catch (IOException e){
        
        System.out.println("No se encuentra el archivo");
        
        
    }
    
}
}
