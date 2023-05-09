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
import domain.EmpleadoClasePadre;
public class TestClaseObject {
    public static void main(String[] args) {
        EmpleadoClasePadre empleado1 = new EmpleadoClasePadre("rodolfo", 5000);
        EmpleadoClasePadre empleado2 = new EmpleadoClasePadre("Rodolfo",5000);
    
        if (empleado1==empleado2){
            System.out.println("Tienen la misma referecnia en memoria");
        }
        else {
            System.out.println("No tienen la misma referencia en memoria");
        }
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son inguales en contenido");
        }
        else{
            System.out.println("Los objetos son diferentes en contenido");
        }
        if(empleado1.hashCode()==empleado2.hashCode()){
            System.out.println("el valor hascode es igual");
        }
        else{
            System.out.println("El valor hascode es distinto");
            
        }
           
    }
    
}
