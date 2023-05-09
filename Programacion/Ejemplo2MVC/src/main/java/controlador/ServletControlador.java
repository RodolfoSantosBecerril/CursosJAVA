
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    @Override
    protected void  doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        //1.- procesamos parametros
        String accion= request.getParameter("accion");
        
        //2.- Creamos los JavaBeans
        Rectangulo recRequest= new Rectangulo(2,10);
        Rectangulo recSesion= new Rectangulo(3,10);
        Rectangulo recAplication= new Rectangulo(4,10);
         
        //3.-Agregamos el JavaBean a algun alcance
        //request.setAttribute("mensaje", "Saludos desde el Servlet");
        
        if("agregarVariables".equals(accion)){ //revisamos la accion proporcionada
            //alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            //Alcance de ssesion
            HttpSession sesion =request.getSession();
            sesion.setAttribute("rectanguloSesion",recSesion);
            //Alcance aplicacion
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloApplication",recAplication);
            //Agregamos mensaje para saber que se ejecutró
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            
        } 
        else if ("listarVariables".equals(accion)){
            //4.Redireccionamos al jsp que despliegan las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp ").forward(request, response);
        }
        else{
            //4 Redireccionamos a la pagina de inicio
            request.setAttribute("mensaje","accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            //esta linea no agregaria informacion al jsp ya que no propaga los objetos de request y response 
            //response.sendRedirect("index.jsp");
            
            
        }
    }
}
