<%-- 
    Document   : insertar
    Created on : 30-jun-2015, 17:45:57
    Author     : Frederick
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%@ page import="java.sql.*" %>
 <%@ page import="java.util.*" %>
 <%@ page import="java.io.*"%>
 <%@include  file="conexion.jsp" %>
<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>insertar</title>
    </head> 
    <body>
         
        <h1>ingresar</h1>
        <%
            
            
            String idcomprador=request.getParameter("idcomprador");
            String nombre=request.getParameter("nombre");
            String telefono=request.getParameter("telefono");
            String celular=request.getParameter("celular");
            String email=request.getParameter("email");
            String ciudad=request.getParameter("ciudad");
            
            if(idcomprador != null && nombre != null){
                String qry="insert into COMPRADOR (IDCOMPRADOR, NOMBRE, TELEFONO, CELULAR, EMAIL, CIUDAD) values('"+idcomprador+"','"+nombre+"','"+telefono+"','"+celular+"','"+email+"','"+ciudad+"')";
                sql.executeUpdate(qry);
                out.print("agregado ");
            }else{
        
        %>
    <center> 
        <form name="frmcompradores" action="insertar.jsp"  method="POST">
           
            Idcomprador : <input type="text" name="idcomprador" /> <br/><br/>
            Nombre : <input type="text" name="nombre" /> <br/><br/>
            Tefelfono : <input type="text" name="telefono" /> <br/><br/>
            Celular : <input type="text" name="celular" /> <br/><br/>
            Email : <input type="text" name="email" /> <br/><br/>
            Ciudad : <input type="text" name="ciudad" /> <br/><br/>
            <input type="submit" value="guardar"/>
            
        </form>
        
        <%} // cerrar el else%>
    </center> 
        
    </body>
</html>
