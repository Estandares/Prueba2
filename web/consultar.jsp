<%-- 
    Document   : consultar
    Created on : 30-jun-2015, 19:50:26
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
        <h1>consultar</h1>
        <%


String idcomprador=request.getParameter("idcomprador");
Statement Estamento = conex.createStatement();
ResultSet rs = Estamento.executeQuery("select * from COMPRADOR where IDCOMPRADOR="+ idcomprador);


 

out.println("<table border=1>");
out.println("<tr><th>idcomprador</th><th>nombre</th><th>telefono</th><th>celular</th><th>email</th><th>ciudad</th></tr>");

while (rs.next()) {

out.println("<tr>");
out.println("<td>");    
out.println(rs.getInt("idcomprador"));
out.println("</td><td>");
out.println(rs.getString("nombre"));
out.println("</td><td>");
out.println(rs.getString("telefono"));
out.println("</td><td>");
out.println(rs.getString("celular"));
out.println("</td><td>");
out.println(rs.getString("email"));
out.println("</td><td>");
out.println(rs.getString("ciudad"));
out.println("</td>");
out.println("</tr>");

}

out.println("</table>");

rs.close();
 Estamento.close();
 
%>

        
   <center>
        
        <form name="frmcompradoresconsultar" action="consultar.jsp"  method="POST">
            
            Idcomprador : <input type="text" name="idcomprador" /> <br/><br/>
            
            <input type="submit" value="consultar"/>
            
        </form>
    </center>
    </body>
</html>

