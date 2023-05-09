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
public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    public static final int MAX_PRODUCTOS=10; 
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.productos=new Producto[Orden.MAX_PRODUCTOS];
        
    }
   public void agregarProductos(Producto producto){
       if(this.contadorProductos< Orden.MAX_PRODUCTOS){
           this.productos[this.contadorProductos++]=producto;
           
           
       }
       else{
           System.out.println("se superó el maximo de productos"+ Orden.MAX_PRODUCTOS);
       }
   }
   public double calcularTotal(){
       double total=0;
       for (int i = 0; i <this.contadorProductos; i++) {
           Producto producto=this.productos[i];
           total += producto.getPrecio();//total = total+producto.getPrecio()
           total+=this.productos[i].getPrecio();
       }
       return total;
   }
   public void mostrarOrden(){
       System.out.println("id orden"+this.idOrden);
       double totalOrden=this.calcularTotal();
       System.out.println("total de la orden: $"+totalOrden);
       System.out.println("produtos de la orden");
       for (int i = 0; i <this.contadorProductos; i++) {
           System.out.println(this.productos[i]);
       }
   }
}

