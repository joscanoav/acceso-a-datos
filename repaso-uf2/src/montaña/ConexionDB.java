/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montaña;

/**
 *
 * @author josca
 */
    import java.sql.*;

public class ConexionDB {
    
    private static final String URL = "jdbc:mysql://localhost:3306/bd_repaso";
    private static final String USUARIO ="root";
    private static final String CONTRASEÑA ="";
    
    public static Connection getConnection(){
        Connection conexion = null;
        
        try{
            conexion = DriverManager.getConnection(URL,USUARIO,CONTRASEÑA);
            System.out.println("Conexion exitosa");
            
        }catch(SQLException e){
            System.out.println("Error conexion " + e.getMessage());
        }
        return conexion;
        
    }
    
}
