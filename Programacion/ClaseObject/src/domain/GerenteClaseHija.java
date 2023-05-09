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
    private  String departamento;
    public GerenteClaseHija(String nombre, double sueldo, String departamento){
         super(nombre,sueldo);
        this.departamento=departamento;
        
    }
    @Override //con @Override- aqui hacemos una sobre escritura del metodo de la clase padre
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", departamento-"+this.departamento;
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
