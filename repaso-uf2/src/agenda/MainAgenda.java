/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;

/**
 *
 * @author josca
 */

import java.awt.BorderLayout;
import java.sql.*;
import java.util.*;

public class MainAgenda {

    /**
     * @param args the command line arguments
     */
    
    private static final Scanner scanner = new Scanner(System.in);
    private static final CRUDAgenda crud = new CRUDAgenda();
    
    public static void main(String[] args) {
        // TODO code application logic here
        try(Connection conexion = ConexionDB.getConnetion()){
            int opcion;
            do{
                mostrarMenu();
                opcion=scanner.nextInt();
                scanner.nextLine();
                
                switch(opcion){
                    case 1 ->crud.crearTabla(conexion);
                    case 2 ->añadirPersona(conexion);
                    case 3 ->crud.verPersonas(conexion);
                    case 4 ->editarPersona(conexion);
                    case 5 ->borrarPersona(conexion);
                    case 6 ->System.out.println("Saliendo");
                   default -> System.out.println("Opción no válida, intente nuevamente.");
                            
                }
                
            }while(opcion != 6);
        }catch(SQLException e){
            System.out.println("Error" + e.getMessage());
        }
    }
    
        private static void mostrarMenu(){
            System.out.println("\nMenu de Opciones");
            System.out.println("1. Crear la tabla 'Agenda");
            System.out.println("2. Anadir una Persona");
            System.out.println("3. Consultar todas las Personas");
            System.out.println("4. Editar una Persona");
            System.out.println("5. Borrar una Persona");
            System.out.println("5. Salir");


        }
        
        private static void añadirPersona(Connection conexion) throws SQLException {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        crud.añadirPersona(conexion, nombre, edad);
    }
        
        private static void borrarPersona(Connection conexion) throws SQLException{
            System.out.println("Ingrese el ID de la persona a borrar");
            int id=scanner.nextInt();
            scanner.nextLine();
            crud.borrarPersona(conexion, id);
        }
        
        private static void editarPersona(Connection conexion)throws SQLException{
            System.out.println("Ingrese el Id de la persona a editar");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nuevo nombre");
            String nombre = scanner.nextLine();
            System.out.print("Nueva edad");
            int edad = scanner.nextInt();
            crud.editarPersona(conexion, id, nombre, edad);
        }

        
        
 }
   
