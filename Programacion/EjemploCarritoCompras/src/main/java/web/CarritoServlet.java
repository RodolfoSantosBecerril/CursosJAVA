package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //creamos o recuperamos el objeto http session
        HttpSession sesion = request.getSession();

        //recuperamos la lista de articulos agregados previamente si existen
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //verificamos si la lista de articulos existe
        if (articulos == null) {
            //inicializamos la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //procesamos el nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        //revisamos y agregamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try (
            //imprimimos la lista de articulos
            PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de Articulos</h1>");
            out.print("<br>");
            //iteramos todos los articulos
            for (String articulo : articulos) {
                out.print("<li>" + articulo + "</li>");
            }
            //agregamos un link para regresar al inicio
            out.print("<br/>");
            out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
        }
    }
}














/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 
 
@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet { 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //mandar respuesta
        response.setContentType("text/html;charset=UTF-8");
        
        //Creamos o recuperamos el objeto http session
        HttpSession sesion=request.getSession();
        //agregamos la lista de articulos agregados previamente su existen
        List<String> articulos=(List<String>) sesion.getAttribute("articulos");//java.util y cast
   
        //verificamos si la lista de articulos existe
        if(articulos==null){
            articulos=new ArrayList<>(); //Inicializamos la lista de articulos
            sesion.setAttribute("articulos", articulos);//cualquier objeto agregado se verá de forma automatica
            
        }
        //procesar el parametro del nuevo articulo
        String articuloNuevo=request.getParameter("articulo");//se obtiene el valor del nuevo articulo en el formulario
        
        //revisamos y agregamos el articulo nuevo
        //Comparamos si el articulo nuevo es diferente de nul y si NO es igual a la cadena vacia
        
        if(articuloNuevo != null && !articuloNuevo.trim().equals("")){
            articulos.add(articuloNuevo);
            
        }
        //imprimir la lista de articulos
        PrintWriter out=response.getWriter();
        out.print("<h1>Lista de Articulos</h1>");
        out.print("<br>");
        //iteramos la lista de los articulos
        for(String articulo:articulos){
            out.print("<li>"+articulo+"</li>");
         //agregamos un link para regresar al inicio
         out.print("br>");
         out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
         out.close();
         
        }
        
    }
}

 
*/
