<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.sql.Connection"
        import="java.sql.DriverManager"
        import="java.sql.ResultSet"
        import="java.sql.SQLException"
        %>

<%
    Connection conex=null;
    Statement sql=null;
    try{
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
                String username = "COMPUMEDBD";
                String password = "123";
                String url = "jdbc:oracle:thin:@localhost:1521:XE";
                conex = (Connection)DriverManager.getConnection(url, username, password);
                sql = conex.createStatement();
                out.print("Conectado");
    }catch(Exception e){
        out.print("error en la conexion" + e);
    
    }
    
    
                
       
    




%>
