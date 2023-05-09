/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas.datos;

import java.util.List;
import peliculas.domain.Peliculas;
import peliculas.excepciones.*;

/**
 *
 * @author black
 */
public interface IAccesoDatos {
    boolean existe(String nombreRecurso)throws AccesoDatosEx; //doolean existe o no existe
       List<Peliculas> listar(String nombreRecurso) throws LecturasDatosEx;// Este objeto regresa una lista de tipo peliculas, importat util 
      
       void escribir(Peliculas pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
       //este  es metodo
       String buscar(String nombreRecurso,String buscar) throws  LecturasDatosEx;
       void crear (String nombreRecurso) throws AccesoDatosEx;
       void borrar(String nombreRecurso) throws AccesoDatosEx;
}
