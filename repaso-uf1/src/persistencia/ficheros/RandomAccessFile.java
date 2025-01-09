/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia.ficheros;
import java.io.*;

public class RandomAccessFile {
    public static void main(String[] args) {
        String ruta = "archivoRandom.bin";

        try (java.io.RandomAccessFile raf = new java.io.RandomAccessFile(ruta, "rw")) {
            raf.writeInt(100); // Escribe en posición 0
            raf.writeInt(200); // Escribe en posición 4

            // Modificar el primer número
            raf.seek(0); // Moverse a la posición 0
            raf.writeInt(300);

            // Leer números
            raf.seek(0);
            System.out.println(raf.readInt()); // 300
            System.out.println(raf.readInt()); // 200
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    RandomAccessFile(String rutaArchivo, String rw) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


