<!-- Agregamos una declaracion de JSP -->
<%! 
//Declaramos variable con metodo get
private String usuario= "Rodolfo";
public String getUsuario(){
return this.usuario;

} 
// Declaramos un contador visitas
private int contadorVisitas = 1;

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones con JSPs</title>
    </head>
    <body>
        <h1>Uso de Declaraciones con JSPs</h1>
        Valor Usuario por medio del atributo: <%= this.usuario%>
        <br>
        Valor Usuario por medio del metodo : <%=this.getUsuario() %>
        <br><!-- comment -->
        Contador visitas: <%= this.contadorVisitas++ %>
</html>
