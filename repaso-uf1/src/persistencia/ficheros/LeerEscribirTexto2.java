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
public class LeerEscribirTexto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(FileWriter writer = new FileWriter ("misDatos2.txt")){
           writer.write("Hola prueba" + "\n");
           writer.write("Saludos");
        }catch(Exception e){
            System.out.println("error " + e.getMessage());
        }
        
        try(FileReader reader = new FileReader("misDatos2.txt")){
            int character;
            while((character = reader.read())!= -1){
                System.out.println((char)character);
            }
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
