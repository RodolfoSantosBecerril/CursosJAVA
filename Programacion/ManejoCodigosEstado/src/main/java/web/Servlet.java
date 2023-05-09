/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.*;

/**
 *
 * @author black
 */

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //simulando Valores Correctos
        String usuarioOK="Rodolfo";
        String passwordOK="123";
        
        String usuario=request.getParameter("usuario");
        String password=request.getParameter("password");
        PrintWriter out=response.getWriter();
        if(usuarioOK.equals(usuario)&&passwordOK.equals(password)){
            out.print("<h1>");
            out.print("Datos Correctos");
            out.print("<br>Usuario"+usuario);
            out.print("<br>password"+password);
            out.print("</h1>"); 
        }
        else{
            response.sendError(response.SC_UNAUTHORIZED,"las credenciales son incorrectas");
        }
        out.close();
    }
    
}
