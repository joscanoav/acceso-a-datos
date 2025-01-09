/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo.examenes;
import java.io.*;
import java.RandomAccessFile.*;
/**
 *
 * @author josca
 */
public class CambioBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        try(RandomAccessFile raf = new RandomAccessFile ("datos.bin","rw")){
            for (int i = 1; i <= 5; i++) {
                raf.writeInt(i);
            }

        }catch(Exception e){
            System.out.println("error " + e.getMessage());
        }
        
            
        try(RandomAccessFile raf = new RandomAccessFile("datos.bin","rw")){
            raf.seek(8);
            raf.writeInt(100);
            
        }catch(Exception e){
            System.out.println("error " + e.getMessage());
        }
        
        
        try(RandomAccessFile raf = new RandomAccessFile("datos.bin","r")){
            while(raf.getFilePointer() < raf.length()){
             int numero = raf.readInt();
                System.out.println(numero);
            }
            
        }catch(Exception e){
            System.out.println("error " + e.getMessage());
        }
    
    }
    
}
