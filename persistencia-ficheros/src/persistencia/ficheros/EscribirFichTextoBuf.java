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
public class EscribirFichTextoBuf {

    public static void main(String[] args) {
        try {
            BufferedWriter fichero = new BufferedWriter
                    (new FileWriter("FichTexto1.txt"));
            for(int i=1; i <11; i++){
                fichero.write("Fila numero : " +i);// escreibe una linea
                fichero.newLine();// escribe un salto de linea
            }
            fichero.close();
           
        } 
            catch (FileNotFoundException fn) {
                System.out.println("No se encuetra el fichero");
        }
            catch (IOException io){
                System.out.println("Error de E/S");
            }
        
    }
    
}
