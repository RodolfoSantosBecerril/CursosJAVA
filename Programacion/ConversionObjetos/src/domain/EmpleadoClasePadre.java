/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author black
 */
public class EmpleadoClasePadre {
    protected String nombre; //protected para usarlos directamente en la clase hija, para no utilizar get y set
    
    protected double sueldo;  
public EmpleadoClasePadre(String nombre, double sueldo){ //Constructor de dos argumentos
    this.nombre=nombre; //inicializacion de variables
    this.sueldo=sueldo;//inicializacion de variables
    
}
public String obtenerDetalles(){
    //metodo
    return "nombre="+this.nombre+", sueldo="+this.sueldo;
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "EmpleadoClasePadre{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

}

