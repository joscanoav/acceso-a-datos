/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.sql.*;
        
public class ConexionDB {
    
    public static final String URL = "jdbc:mysql://localhost:3306/bd_repaso ";
    public static final String USUARIO = "root";
    public static final String CONTRASEÑA = "";

    public static Connection getConnetion(){
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
            System.out.println("conectado!");
            
        }catch(SQLException e){
            System.out.println("Error " + e.getMessage());
        }
        return conexion;
    }
    
}
