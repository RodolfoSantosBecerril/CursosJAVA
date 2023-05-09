 <!-- Insertamos la directiva de la libreria -->
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <!--Ruta donde se encuentra la libreria se encuentra definida en el jar, no en internet -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core (Jsp Standard Tag Library)</h1>
         <!-- manipulacion de variables -->
         <!-- Definicion de variable -->
         <c:set var="nombre" value="Rodolfo" />
         <!-- desplegamos el valor de la variable -->
         Variable nombre: <c:out value="${nombre}"/>
        <br/>  
        <br/>
        Variable con codigo HTML:
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br/>  
        <br/>
        <!-- codigo condicionado -->
        <c:set var="bandera" value="true" />
        
        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>
        <!-- codigo condicionado con switch -->
        <c:if test="${param.opcion != null}">
            <c:choose>
                
                <c:when test="${param.opcion ==1}">
                    <br/>
                    opcion 1 Seleccionada
                </c:when>
                <c:when test="${param.opcion ==2}">
                    <br/>
                    Opcion 2 Seleccionada
                </c:when>
                     
                        <c:otherwise>
                         <br/>        
                         Opcion Proporcionada desconocida: ${param.opcion}
                        </c:otherwise>  
                    
            </c:choose>
        </c:if>
                         
                         <!--  iteracion de un arrglo -->
                         <% 
                           String nombres[]={"Rodolfo", "Santos", "Becerril"};
                           request.setAttribute("nombres", nombres);
              
                         %>
                         <br/>
                         Lista de Nombre:
                         <br/>           
                         <ul>
                             <c:forEach var="persona" items="${nombres}">
                                 <li>nombre: ${persona}</li>
                             </c:forEach>
                         </ul>
                         <br/>
                         <a href="index.jsp">Link para regresar al inicio</a>
    </body>
</html>
