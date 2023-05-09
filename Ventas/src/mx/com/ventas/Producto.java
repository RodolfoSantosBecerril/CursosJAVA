/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ventas;

/**
 *
 * @author black
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;
    private Producto(){
        this.idProducto=++Producto.contadorProductos;
        
    }
    public Producto(String nombre, double precio){
        this();
        this.nombre=nombre;
        this.precio=precio;
 }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}