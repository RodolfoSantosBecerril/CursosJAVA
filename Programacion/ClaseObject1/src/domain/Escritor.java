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
public class Escritor extends EmpleadoClasePadre { //Clase que hereda de EmpleadoClasePadre
    final TipoEscritura tipoEscritura; // 
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {//  constructor de tres argumentos 
        super(nombre, sueldo);  //llamada a la clase padre  para el caso de Escritor o sea  hacia el 
        this.tipoEscritura=tipoEscritura;
        
    }
    @Override  //sobre escritura del metodo 
    public String obtenerDetalles(){
    return super.obtenerDetalles() +", Tipo Escritura: "+ tipoEscritura.getDescripcion();
    }

    @Override //sobre escritura del metodo 
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}'+super.toString();
    }
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
}
