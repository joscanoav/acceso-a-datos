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
public class ControlPunteroLecturaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreArchivo = "archivo.bin";// Cambia esto al nombre de tu archivo
        int posicionDeseada = 50; // Numero de bytes que deseamos leer
        int bytesALeer = 5;// Numero de bytes que desamos leer
        try {
            FileInputStream archivoBinario = new FileInputStream(nombreArchivo);
            // Mueve el puntero de lectura a la posicion deseada
            archivoBinario.skip(posicionDeseada);
            
            // Lee datos en bloques de bytes
            byte[] buffer = new byte[bytesALeer];
            int bytesRead = archivoBinario.read(buffer);
            
            if(bytesRead>0){
                //Procesa los datos leidos, que estan en buffer
                System.out.println("Datos en la posicion " + posicionDeseada + ":");
                for (int i = 0; i < bytesRead; i++) {
                    System.out.print(buffer[i]+"");
                    
                }
                System.out.println();
            }else {
                System.out.println("No se encontraron datos en la posicion"+ posicionDeseada );
            }
            archivoBinario.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
