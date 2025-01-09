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
public class FlujoBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "datos.bin";
        // Escritura binaria
        try (FileOutputStream fos = new FileOutputStream(ruta)){
            for (int i = 1; i <= 5; i++){
                fos.write(i);
            }
        } catch(IOException e){
            System.out.println("Error al escribir: " + e.getMessage());
        }
        // Lectura binaria
        try (FileInputStream fis = new FileInputStream(ruta)){
            int dato;
            while ((dato = fis.read()) != -1){
                System.out.print(dato + " ");
            }
        } catch (IOException e){
            System.out.println("Error al leer: " + e.getMessage());
        } 
        
    }
    
}
