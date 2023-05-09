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
public EmpleadoClasePadre(String nombre, double sueldo){
    this.nombre=nombre;
    this.sueldo=sueldo;
    
}
public String obtenerDetalles(){
    //metodo
    return "nombre"+this.nombre+", sueldo"+this.sueldo;
    
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

}

