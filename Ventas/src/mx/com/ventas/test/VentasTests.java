/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ventas.test;

import mx.com.ventas.*;

/**
 *
 * @author black
 */
public class VentasTests {
    public static void main(String[] args) {
        Producto producto1= new Producto("camisa",50.00);
        Producto producto2= new Producto("pantalon",100.00);
        
    Orden orden1=new Orden();
    orden1.agregarProductos(producto1);
    orden1.agregarProductos(producto2);
    orden1.mostrarOrden();
}
}