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
public class GestionArchivoTexto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rutaArchivo = "texto.txt";
        // Contadores
        
        int lineas = 0, palabras = 0, caracteres = 0;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))){
           String linea;
           while ((linea = reader.readLine())!= null){
            lineas++;
            caracteres += linea.length();
            palabras += linea.split("\\s+").length;
        }
           
            System.out.println("Lineas: " + lineas);                   
            System.out.println("Palabras: " + palabras);
            System.out.println("Caracteres: " + caracteres);
       
        
        } catch (IOException e){
            System.out.println("Error " +  e.getMessage());
        
        }
        
        
    }
    
}
