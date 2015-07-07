/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModelObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Comprador;
import util.DbUtil;

/**
 *
 * @author Frederick
 */
public class ModeloObjetoComprador {


        private Connection conection;

        public ModeloObjetoComprador(){
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
    
    
    
    public void eliminarComprador(String Idcomprador){
        try {
           PreparedStatement eliminarComprador = conection.prepareStatement("delete from COMPRADOR where IDCOMPRADOR=?");
           eliminarComprador.setString(1, Idcomprador);
           eliminarComprador.executeUpdate();
            System.out.println("Comprador Eliminado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     
    
    
    
    public void actualizarComprador(Comprador comprador){
        try {
            PreparedStatement actualizarSql = 
                 conection.prepareStatement("update COMPRADOR set \n" +
                                                "IDCOMPRADOR =?, \n" +
                                                "NOMBRE =?, \n" +
                                                "TELEFONO =?, \n" +
                                                "CELULAR =?, \n" +
                                                "EMAIL =?, \n" +   
                                                "CIUDAD =? \n" +
                                            "where idcomprador =?");
            actualizarSql.setInt(1, comprador.getIdcomprador());
            actualizarSql.setString(2, comprador.getNombre());
            actualizarSql.setString(3, comprador.getTelefono());
            actualizarSql.setString(4, comprador.getCelular());
            actualizarSql.setString(5, comprador.getEmail());
            actualizarSql.setString(6, comprador.getCiudad());
            actualizarSql.setInt(7, 1);
            actualizarSql.executeUpdate();
            System.out.println("comprador actualizado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    public Comprador consultarComprador(int Idcomprador) {
        Comprador comprador = new Comprador();
        try {
            PreparedStatement consultaSql = conection.
                    prepareStatement("select * from COMPRADOR where IDCOMPRADOR=?");
            consultaSql.setInt(1, Idcomprador);
            ResultSet rs = consultaSql.executeQuery();

            if (rs.next()) {
                
                comprador.setIdcomprador(rs.getInt("IDCOMPRADOR"));
                comprador.setNombre(rs.getString("NOMBRE"));
                comprador.setTelefono(rs.getString("TELEFONO"));
                comprador.setCelular(rs.getString("CELULAR"));
                comprador.setEmail(rs.getString("EMAIL"));
                comprador.setCiudad(rs.getString("CIUDAD"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return comprador;
    }
    
    
    
    
        
}