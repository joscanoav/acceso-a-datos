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
public class ActualizarRandomAccessFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rutaArchivo = "randomAccess.bin";
        // escritura inicial
        
        try (java.io.RandomAccessFile raf = new java.io.RandomAccessFile(rutaArchivo, "rw")){
            for (int i=0; i<5;i++){
                raf.writeInt(i*10);
            }
        }catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
        
        // Actualizacion
        
        try (java.io.RandomAccessFile raf = new java.io.RandomAccessFile(rutaArchivo, "rw")){
            raf.seek(8);// mover a la posicion
            raf.writeInt(88);//sobreescribe
            // Leer todos los numeros
            raf.seek(0);
            while(raf.getFilePointer() < raf.length()){
                System.out.println(raf.readInt());
            }
            
        } catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
        
    }
    
}
