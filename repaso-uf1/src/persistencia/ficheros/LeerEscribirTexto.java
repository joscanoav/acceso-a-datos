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
public class LeerEscribirTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("misDatos.txt"))){
            writer.write("Hola amigo " + "\n");
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        
        try(BufferedReader reader = new BufferedReader (new FileReader("misDatos.txt"))){
            String linea;
            while((linea = reader.readLine())!= null){
                System.out.println(linea);
            }
        }catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
        
    }
    
}
