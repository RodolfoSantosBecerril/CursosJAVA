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
public abstract class FiguraGeometrica { //si hay un metodo abstract, tambien la clase debe ser abstrac
    protected String tipoFigura;
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura=tipoFigura;
    }
    public abstract void dibujar(); // metodo abstract no debe contener llaves

    public String getTipoFigura() {
        return this.tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
   
}
