/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator

 */
public class F1 {
    
       
    public boolean ejecutarQuery(String query){
    
        
        try{
            PreparedStatement st;
            ResultSet rs;
            
            conexion con = new conexion();
            con.abrir_conexion();
            
            st = (PreparedStatement) con.conexionBD.prepareStatement(query);
            st.executeUpdate();
            con.cerrar_conexion();
            JOptionPane.showMessageDialog(null, "Operacion realizada con éxito");
            return true; 
             
            
        } catch(SQLException ex){
        
            System.out.println(ex.toString());
            return false;
        }
    }
      public  ResultSet ejecutarQuery2(String query){
    
         ResultSet rs = null;
        try{
            PreparedStatement st;
            conexion con = new conexion();
            con.abrir_conexion();
            
            st = (PreparedStatement) con.conexionBD.prepareStatement(query);
            rs= st.executeQuery();
            // JOptionPane.showMessageDialog(null, "Operacion realizada con éxito");
            return rs;
         
            
        } catch(SQLException ex){
        
            System.out.println(ex.toString());
              
            
            }
        
        return rs;
        
        
    }
}