/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModelObject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Comprador;
import util.DbUtil;

/**
 *
 * @author Frederick
 */
public class guardar extends HttpServlet {

        
    private Connection conection;

        public guardar(){
        conection = DbUtil.getConection();
    }
    
   
    public void insertarComprador(Comprador comprador){
        
        try {
            PreparedStatement insertarSql = 
              conection.prepareStatement("insert into COMPRADOR  (IDCOMPRADOR, NOMBRE, TELEFONO, CELULAR, EMAIL, CIUDAD)"
                      + "values(?, ?, ?, ?, ?, ? )");
;
            insertarSql.setInt(1, comprador.getIdcomprador());
            insertarSql.setString(2, comprador.getNombre());
            insertarSql.setString(3, comprador.getTelefono());
            insertarSql.setString(4, comprador.getCelular());
            insertarSql.setString(5, comprador.getCelular());
            insertarSql.setString(6, comprador.getCiudad());
            insertarSql.executeUpdate();
            System.out.println("comprador  Insertado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

}
