<%-- 
    Document   : actualizar
    Created on : 30-jun-2015, 20:02:29
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>buscar para actualizacion</h1>
        
        <%
            
            
            String idcomprador=request.getParameter("idcomprador");
            String nombre=request.getParameter("nombre");
            
            if(idcomprador != null ){
                ///String qry = "delete from COMPRADOR where IDCOMPRADOR="+idcomprador+")";
                
                String qry = "update COMPRADOR set NOMBRE='"+nombre+"' where idcomprador ="+idcomprador;
                sql.executeUpdate(qry);
                out.print("actualizado ");
            }else{
        
        %> 
    <center>
        
        <form name="frmcompradoreseliminar" action="actualizar.jsp"  method="POST">
            
            Idcomprador : <input type="text" name="idcomprador" /> <br/><br/>
            nuevo nombre : <input type="text" name="nombre" /> <br/><br/>
            
            <input type="submit" value="buscar y actualizar"/>
            
        </form> 
  
         <%} // cerrar el else%> 
    </center>
    </body>
</html>
