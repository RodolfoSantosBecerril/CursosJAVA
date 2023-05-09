
/*package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

 @WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
     
     //indicamos el tipo de respuesta al navegador    
     response.setContentType("application/vnd.ms-excel"); //vnd significa vendor Specific
     response.setHeader("Content-Disposition","attachment;filename=excelEjemplo.xls"); //con esta linea se descarga el excel dando clic
     //para un uso mas profecional de excel se puede utilizar poi.apache.org
     
     
     //no se genera cache, combinacion de 3 headres
     response.setHeader("Pragma","no-cache");//no genera un cache
     response.setHeader("Cache-Control","no-store");//no guarda caché
     response.setDateHeader("Expires",-1); //la informacion que genera expira de manera inmediata
     
     
     //desplegamos informacion al cliente
     PrintWriter out=response.getWriter();
     out.println("\tValores");
     out.println("\t1");
     out.println("\t1");     
     out.println("Total\t=SUMA(b2:b3)");
     out.close();
     }
    
}*/
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //indicamos el tipo de respuesta al navegador
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        //para un uso mas profesional de excel poi.apache.org
        
        //indicar al navegador que no guarde cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        
        //desplegamos la informacion al cliente
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(b2:b3)");
        out.close();
    }
}