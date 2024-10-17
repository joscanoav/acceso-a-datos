/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia.ficheros;
import java.io.*;

public class EscribirFichBytes {

    public static void main(String[] args) throws IOException {
        File fichero = new File("FichBytes.dat");// declara fichero
        // Crea flujo de salida hacia el fichero
        FileOutputStream fileout = new FileOutputStream(fichero,true);
        // crea flujo de entrada
        FileInputStream filein = new FileInputStream(fichero);
        int i;
        for (i = 1; i < 100; i++) 
            fileout.write(i);// escribe datosen el fluho de salida
        fileout.close();// cerrar stream de salida
        while ((i=filein.read())!= -1)// lee datos del flujo de entrada
            System.out.println(i);
        filein.close();// cerrar stream de entrada
        
    }
    
}
