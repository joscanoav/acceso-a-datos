/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia.ficheros;

import java.io.*;

/**
 *
 * @author josca
 */
public class FlujoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String ruta = "miArchivo.txt";
       
       //Escritura
       
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))){
           writer.write("Primera linea\n");
           writer.write("Segunda linea\n");
       }catch (IOException e){
           System.out.println("Erro al escribir: " + e.getMessage());
       }
       
       // Lectura
       
       try (BufferedReader reader = new BufferedReader(new FileReader(ruta))){
           String linea;
           while((linea = reader.readLine())!= null){
               System.out.println(linea);
           }
       } catch (IOException e){
           System.out.println("Error al leer: " + e.getMessage());
       }
    }
    
}
