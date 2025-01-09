/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia.ficheros;
import java.io.*;
/**
 *
 * @author josca
 */
public class OptimizarBuffering {
    public static void main(String[] args){
    String rutaArchivo = "archivoGrande.txt";
    // Escritura con buffering
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))){
        for(int i = 0; i < 100000; i++){
            writer.write("Linea numero  " + i + "\n");
        }
    } catch (IOException e){
        System.out.println("Error " + e.getMessage());
    }
    
    // Lectura con buffering
    try (BufferedReader reader = new BufferedReader (new FileReader(rutaArchivo))){
        String linea;
        while ((linea = reader.readLine()) != null ){
            System.out.println(linea);
          }
        }catch (IOException e){
                System.out.println("Error" + e.getMessage());
      }
     } 
    }
   