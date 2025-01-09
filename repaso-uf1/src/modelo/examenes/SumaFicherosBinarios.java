/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelo.examenes;
    import java.io.*;
/**
 *
 * @author josca
 */
public class SumaFicherosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(FileOutputStream writer = new FileOutputStream ("datos.bin")){
            for (int i = 0; i < 5; i++) {
                writer.write(i);
            }
        }catch(IOException e){
            System.out.println("error " + e.getMessage());
        }
        
        int suma = 0;
        
        try(FileInputStream reader = new FileInputStream("datos.bin")){
            int number;
            while((number = reader.read()) !=  -1){
                suma += number;
            }
        System.out.println("suma calculada " + suma);

        }catch(IOException e ){
            System.out.println("Error " + e.getMessage());
        }
        
        try(FileOutputStream writer = new FileOutputStream ("suma.bin")){
         writer.write(suma);
            System.out.println(suma);
        }catch(IOException e ){
       System.out.println("Error " + e.getMessage());
    }
    
}
}

