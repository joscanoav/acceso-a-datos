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
public class BufferPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("alumnos.txt"))){
            writer.write("Nombre: Juan, Edad 18");
            writer.newLine();
            writer.write("Nombre: Dan, Edad 20");
        }catch(IOException e){
            System.out.println("Error al escribir" + e.getMessage());
        }
        
        try(BufferedReader reader = new BufferedReader (new FileReader("alumnos.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println("\n" + line );
            }
        }catch(IOException e){
            System.out.println("Error al leer  " + e.getMessage());
        }
    }
    
}
