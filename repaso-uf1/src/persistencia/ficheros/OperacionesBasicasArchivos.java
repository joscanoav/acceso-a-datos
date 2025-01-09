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
public class OperacionesBasicasArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            File archivo = new File("prueba.txt");
            if (!archivo.exists()){
                archivo.createNewFile();
                System.out.println("Archivo creado " + archivo.getAbsolutePath());
            }else {
                System.out.println("El archivo ya existe");
                
            }
            
                            if (archivo.delete()) {
                    System.out.println("El archivo ha sido eliminado.");
                } else {
                    System.out.println("No se pudo eliminar el archivo.");
                }
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
}
