/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas.domain;

/**
 *
 * @author black    ESTO SE CONOCE COMO UN JAVA BEAN 
 *                  LA CLASE PELICULAS SE LE CONOCE COMO CLASES DE ENTIDAD
 *                  LA CLASE EN CONECION A BASE DATOS ES UNA TABLA DE BASE DATOS
 *                  AQUI FALTA SERIALIZABLE PARA QUE SEA UN BEAN COMPLETO
 */
public class Peliculas {
   private String nombre;

    public Peliculas() {
    }
     public Peliculas(String nombre ) {
         this.nombre =nombre ;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "nombre=" + nombre + '}';
    }
    
    
}

