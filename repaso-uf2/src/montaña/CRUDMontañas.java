/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montaña;

import java.sql.*;
/**
 *
 * @author josca
 */
public class CRUDMontañas {
  
    // Crear Tabla
    
    public void crearTabla(Connection conexion) throws SQLException{
        String query = """
        CREATE TABLE IF NOT EXISTS Mountain(
            id INT AUTO_INCREMENT PRIMARY KEY,
            Nombre VARCHAR (50),
            Altura INT,
            PrimeraAscension INT,
            Region VARCHAR(50),
            Pais VARCHAR(50)
            )
            """;
        try(Statement stmt = conexion.createStatement()){
            stmt.executeUpdate(query);
            System.out.println("Tabla 'Mountain' creada correctamente.");
        }
    }
    
    // Añadir
    
    public void añadirMontaña(Connection conexion,String nombre, int altura, int primeraAscension, String region, String pais)throws SQLException{
    
        String query = "INSERT INTO Mountain (Nombre,Altura,PrimeraAscension,Region,Pais) VALUES(?,?,?,?,?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)){
            stmt.setString(1,nombre);
            stmt.setInt(2, altura);
            stmt.setInt(3, primeraAscension);
            stmt.setString(4, region);
            stmt.setString(5, pais);
            stmt.executeUpdate();
            System.out.println("Mountain creado correctamente");
        }
    }
    
    // consultar
    
    public void consultarTabla(Connection conexion) throws SQLException{
        String query = "SELECT * FROM Mountain";
        try(Statement stmt = conexion.createStatement();
                ResultSet rs = stmt.executeQuery(query)){
                System.out.println("ID|NOMBRE|ALTURA|PrimeraAscension|Region|Pais");
                System.out.println("-------------------------------");
                while(rs.next()){
                    System.out.printf("%d|%s|%d|%d|%s|%s%n",
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getInt("Altura"),
                            rs.getInt("PrimeraAscension"),
                            rs.getString("Region"),
                            rs.getString("Pais"));
                }
            
        
        }
    }
    
    //consultar montaña
        public void consultarMontaña(Connection conexion, int id) throws SQLException {
        String query = "SELECT * FROM Montañas WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.printf("Nombre: %s, Altura: %d, Primera Ascensión: %d, Región: %s, País: %s%n",
                            rs.getString("Nombre"),
                            rs.getInt("Altura"),
                            rs.getInt("PrimeraAscensión"),
                            rs.getString("Región"),
                            rs.getString("País"));
                } else {
                    System.out.println("Montana no encontrada.");
                }
            }
        }
    }

    
    // Editar
    
    public void editarMontaña(Connection conexion, int id, String nombre, int altura, int primeraAscension, String region, String pais) throws SQLException{
        
        String query = "UPDATE Mountain SET Nombre=?,Altura=?,PrimeraAscension=?,"
                + "Region=?, Pais=?, Where id=?";
                try (PreparedStatement stmt = conexion.prepareStatement(query)){
                    
                    stmt.setString(1,nombre);
                    stmt.setInt(2,altura);
                    stmt.setInt(3, primeraAscension);
                    stmt.setString(4, region);
                    stmt.setString(5,pais);
                    stmt.setInt(6, id);
                    stmt.executeUpdate();
                    
                    System.out.println("Mountain actulizada");
                }
    }
    
    // Borrar
    
    public void borrarMontaña(Connection conexion, int id)throws SQLException{
        String query = "DELETE FROM Mountain WHERE id =?";
        
        try(PreparedStatement stmt = conexion.prepareStatement(query)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Montaña eliminada");
        }
    }
    
    public void borrarTabla(Connection conexion) throws SQLException{
        String query = "DROP TABLE IF EXISTS Mountain";
        try(Statement stmt = conexion.createStatement()){
           stmt.execute(query);
            System.out.println("Tabla mountain borrada");
        }
    }
    
    
    
    
    
    
}
