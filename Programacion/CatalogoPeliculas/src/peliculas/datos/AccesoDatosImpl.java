/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peliculas.datos;

import java.io.File;
import java.io.*;
import java.util.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import peliculas.domain.Peliculas;
import peliculas.excepciones.*; 

/**
 *
 * @author black
 */
public class AccesoDatosImpl implements IAccesoDatos  { //cumpir contrato con la interface 
//usar ayuda del id en implementar all 
    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo= new File(nombreRecurso); 
        return  archivo.exists();
        
         
    }

    @Override
    public List<Peliculas> listar(String nombreRecurso) throws LecturasDatosEx {
         var archivo =new File(nombreRecurso);
         List<Peliculas>peliculas=new ArrayList<>();
        try {
            var entrada =new BufferedReader(new FileReader(archivo));
            String linea=null;
            linea=entrada.readLine();
            while (linea !=null){
               var peliculas1= new Peliculas(linea);
               peliculas.add(peliculas1);
               linea=entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
          ex.printStackTrace();
          throw new LecturasDatosEx("Excepcion al listar peliculas"+ex.getMessage());
        } catch (IOException ex) {
        ex.printStackTrace();
          throw new LecturasDatosEx("Excepcion al listar peliculas"+ex.getMessage());
        }
         return peliculas;
    }

    @Override
    public void escribir(Peliculas pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturasDatosEx {
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
    }
    
    
}
