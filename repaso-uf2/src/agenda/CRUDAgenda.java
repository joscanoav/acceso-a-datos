/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.sql.*;
/**
 *
 * @author josca
 */
public class CRUDAgenda {
    
    //crear tabla
    
    public void crearTabla(Connection conexion)throws SQLException{
       
        String query="""
                     CREATE TABLE IF NOT EXISTS Agenda(
                     id INT AUTO_INCREMENT PRIMARY KEY,
                     Nombre VARCHAR(20),
                     Edad INT
                     )
                     """;
        try(Statement stmt = conexion.createStatement()){
           
            stmt.executeUpdate(query);
            System.out.println("Tabla creada");
        }
    
    }
    
    public void añadirPersona(Connection conexion,String nombre,int edad)throws SQLException{
        String query = "INSERT INTO Agenda (Nombre,edad) VALUES(?,?)";
        
        try(PreparedStatement stmt = conexion.prepareStatement(query)){
            stmt.setString(1,nombre);
            stmt.setInt(2, edad);
            
            stmt.executeUpdate();
            System.out.println("Persona");
        }
    }
    
    public void verPersonas(Connection conexion) throws SQLException{
        String query = "SELECT * FROM Agenda";
        
        try(Statement stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery(query)){
            
            System.out.println("ID|Nombre|Edad");
            System.out.println("-----------------------");
            while(rs.next()){
                System.out.printf("%d|%s|%d%n",
                        rs.getInt("id"),
                        rs.getString("Nombre"),
                        rs.getInt("Edad"));
            
            }
        }
    }
    
    public void editarPersona(Connection conexion,int id,String nombre, int edad)
        throws SQLException {
        String query = "UPDATE Agenda SET Nombre=?,edad=? WHERE id=?";
        
        try(PreparedStatement stmt = conexion.prepareStatement(query)){
            stmt.setString(1,nombre);
            stmt.setInt(2,edad);
            stmt.setInt(3, id);
            stmt.executeUpdate();
            System.out.println("Persona Actualizada");
        
        }
    }
    
    public void borrarPersona(Connection conexion, int id) throws SQLException{
        String query = "DELETE FROM Agenda WHERE id=?";
        
        try(PreparedStatement stmt = conexion.prepareStatement(query)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("borrado correctamente");
        }
    }
    
    
    public void insertarClientes(Connection conexion,int id,String nombre,int telefono) throws SQLException {
        String query = "INSERT INTO CLIENTES (Id, Nombre, Telefono ) VALUES (?,?,?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)){
            stmt.setInt(1, id);
            stmt.setString(2,"Ana");
            stmt.setInt(3,456132);
            stmt.executeUpdate();
            
            stmt.setInt(2, id);
            stmt.setString(2,"Luis");
            stmt.setInt(3,456498);
            stmt.executeUpdate();   
        }
    }
    
    public void borrarClientes(Connection conexion,int id) throws SQLException{
        String query = "DELETE FROM Clientes Where ID=?";
        try(PreparedStatement stmt = conexion.prepareStatement(query)){
            stmt.setInt(1,2);
            stmt.executeUpdate();
        }
    }
    
    
}
