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
public class ControlPunteroEscrituraBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String archivo = "FichTexto1.txt";
        int posicionDeseada = 100;// La posicion en bytes a la que deseamos escribir
        try {
            // Abre el archivo en modo lectura y escritura
            RandomAccessFile archivoBinario = new RandomAccessFile(archivo,"rw");
            // Mueve el puntero de escritura a la posicion deseada
            archivoBinario.seek(posicionDeseada);
            // Escribe datos en la posicion deseada
            archivoBinario.writeInt(42);//Escribe un entero en la posicion deseada
            archivoBinario.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
