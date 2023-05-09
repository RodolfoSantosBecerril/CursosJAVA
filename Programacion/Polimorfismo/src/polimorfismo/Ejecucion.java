/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author black
 */
public class Ejecucion {
    public static void main(String[] args) {
        Operaciones mensajero= new Suma();
        mensajero.PedirDatos();
        mensajero.Operaciones();
        mensajero.MostrarResultado();
        Operaciones mensajero1= new Resta();
        
        mensajero1.PedirDatos();
        mensajero1.Operaciones();
        mensajero1.MostrarResultado();
    }
    
}
