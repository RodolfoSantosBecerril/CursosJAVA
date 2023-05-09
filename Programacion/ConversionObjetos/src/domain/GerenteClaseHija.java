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
public class GerenteClaseHija extends EmpleadoClasePadre {
    private  String departamento; //Variables
    public GerenteClaseHija(String nombre, double sueldo, String departamento){ //constructor de tres argumentos,dos de la clase padre
         super(nombre,sueldo); // LLamada las variables de clase  (Primer linea)
        this.departamento=departamento; //This para inicializar la variable de departamento
        
    }
    @Override //con @Override- aqui hacemos una sobre escritura del metodo de la clase padre
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", departamento-"+this.departamento; //super.obtenerDetalles() llamada al metodo obtener detalles y retornamos el valor de departamento
        
    }
    //get y set para variable de departamento 
    public String getDepartamento() { 
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
