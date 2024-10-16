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
public class LeerFichTextoBuf {

    public static void main(String[] args) {
        try {
            File fic = new File("FichTexto.txt");// declara fichero
            BufferedReader fichero = new BufferedReader(new FileReader(fic));
            String linea;
            while ((linea = fichero.readLine())!= null)
                System.out.println(linea);
            fichero.close();
         
       } catch (FileNotFoundException fn) {
            System.out.println("No se encuentra fichero");}
        
        catch (IOException io){
            System.out.println("Error de E/S");
                }
        
        }


    }
