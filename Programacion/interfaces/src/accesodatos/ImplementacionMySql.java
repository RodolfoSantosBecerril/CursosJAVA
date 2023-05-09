/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

/**
 *
 * @author black
 */
public class ImplementacionMySql implements IAccesoDatos    { //obligar a clases que agregen el comportamiento definido en la interface,
// en el insertar codigo le damos implementar metodos de la interface
    @Override //no sobreescribe, se impleneta por primera vez
    public void insertar() {
        System.out.println("insertar desde MySQL");
        //el id agrega la excepcion}
    } 
    @Override
    public void listar() { 
        System.out.println("Listar desde MySQL");    
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL");
    }
    //agregamos  implements
    
}
