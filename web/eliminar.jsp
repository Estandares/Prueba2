<%-- 
    Document   : eliminar
    Created on : 30-jun-2015, 19:34:29
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
        <title>eliminar</title>
    </head>
    <body>
        <h1>eliminar compradores</h1>
        <%
            
            
            String idcomprador=request.getParameter("idcomprador");
           
            
            if(idcomprador != null ){
                ///String qry = "delete from COMPRADOR where IDCOMPRADOR="+idcomprador+")";
                
                String qry = "delete from COMPRADOR where IDCOMPRADOR = "+idcomprador;
                sql.executeUpdate(qry);
                out.print("eliminado ");
            }else{
        
        %>
    <center>
        <form name="frmcompradoreseliminar" action="eliminar.jsp"  method="POST">
            
            Idcomprador : <input type="text" name="idcomprador" /> <br/><br/>
            
            <input type="submit" value="eliminar"/>
            
        </form>
         <%} // cerrar el else%>
    </center>    
    </body>
</html>
