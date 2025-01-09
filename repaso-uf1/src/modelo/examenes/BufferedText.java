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
public class BufferedText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("BufferText.txt"))){
         writer.write("hola");
        
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        
        try(BufferedReader reader = new BufferedReader(new FileReader("BufferText.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println("el texto es " + line);
            }
        }catch(IOException e){
            System.out.println("error" + e.getMessage());
        }
    
    }
    }

