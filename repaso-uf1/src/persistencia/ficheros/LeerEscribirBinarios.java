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
public class LeerEscribirBinarios {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try( FileOutputStream fos = new FileOutputStream("misDatosBinarios.bin")){
            for(int i=0; i < 5; i++){
            fos.write(i);
            }
        }catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
        
        try(FileInputStream fis = new FileInputStream("misDatosBinarios.bin")){
            int character;
            while((character= fis.read())!= -1){
                System.out.println(character);
            }
            
        }catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
        
    }
    
}


