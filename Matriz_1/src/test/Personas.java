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
public class Personas {
    
  private String nombre;
  public Personas(String nombre){
      this.nombre=nombre;
      
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + '}';
    }
    
}