/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.repaso;

import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;


/**
 *
 * @author josca
 */
public class Conectar {
        static String url="jdbc:mysql://localhost:3306/bd_repaso";
        static String user = "root";
        static String pass="";
        
        public static Connection conectar()
        {
            Connection con=null;
            try {
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("Connection successful");
        }catch(SQLException e)
        {
        e.printStackTrace();
        }
        return con;
        }
    public static void main(String[] args) {
        // Test the connection
        Connection testConnection = conectar();
        if (testConnection != null) {
            System.out.println("Database is connected!");
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }
}