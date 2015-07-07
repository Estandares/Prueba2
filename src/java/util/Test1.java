/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dataModelObject.ModeloObjetoComprador;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List; 
import model.Comprador;

/**
 *
 * @author 
 */
public class Test1 {
    
    public static void main(String[] args){
        Connection conection = DbUtil.getConection();
        ModeloObjetoComprador modeloComprador = new ModeloObjetoComprador();
        Comprador comprador = new Comprador();
        
        comprador.setIdcomprador(1);
        comprador.setNombre("jorge");
        comprador.setTelefono("5834256");
        comprador.setCelular("3106071557");
        comprador.setEmail("jorgeocampo@gmail.com");
        comprador.setCiudad("medellin");
        
        
        modeloComprador.insertarComprador(comprador);
        
       
        
        modeloComprador.eliminarComprador("3");
        
        
        Comprador comprador1 = new Comprador();
        
        comprador1.setIdcomprador(2);
        comprador1.setNombre("lukas");
        comprador1.setTelefono("55555");
        comprador1.setCelular("3103101010"); 
        comprador1.setEmail("xxxxxx@gmail.com");
        comprador1.setCiudad("nicaragua");
        
        modeloComprador.actualizarComprador(comprador1);
        
        Comprador comp = null;
        comp = modeloComprador.consultarComprador(2);
        if (comp != null){
            System.out.println("El Comprador " + comp.getNombre() + " " + comp.getEmail());
        }else{
            System.out.println("no existe o no consulto");
        }
        
       
        
       
    }
    
}
