/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ivan
 */
public class DbUtil {
    private static Connection conection = null;
    
    public static Connection getConection(){
        if ( conection != null){
            return conection;
        }else{
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                String username = "COMPUMEDBD";
                String password = "123";
                String url = "jdbc:oracle:thin:@localhost:1521:XE";
                conection = DriverManager.getConnection(url, username, password);
                System.out.println("Conectado");
            } catch (Exception e) {
                System.out.println("Desconectado");
                System.out.println(e.getMessage());
            }
            return conection;
        }
    }
    
}
