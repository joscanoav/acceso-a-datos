/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia.ficheros;

import java.io.RandomAccessFile;
import java.io.*;
/**
 *
 * @author josca
 */
public class RandomFicherosBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(RandomAccessFile raf = new RandomAccessFile("numeros_random.bin,","rw")){
            // Escribir
            for (int i = 0; i < 10; i++) {
                raf.writeInt(i);
            }
            System.out.println("Numeros iniciales escritos en Random.bin");
            //Cambiar
            raf.seek(8);
            //raf.seek(2 * Integer.BYTES);
            raf.writeInt(100);
            System.out.println("Tercer numero cambiado a 99");
            //Leer el contenido
            raf.seek(0); //volver al inicio
            System.out.println("Contenido del archivo");
            for (int i = 0; i < 10; i++) {
                System.out.println("Numero " + (i + 1)+ ": " + raf.readInt());
                
            }
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    
}
