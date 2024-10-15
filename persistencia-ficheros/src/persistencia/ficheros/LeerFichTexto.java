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
public class LeerFichTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File fichero = new File ("Fichero1.txt");// declarar fichero
        FileReader fic = new FileReader(fichero);//crear el flujo de entrada
        //FileReader fic = new FileReader ("C:\\DAN\\PROGRAMACION\\acceso-a-datos\\persistencia-ficheros\\Fichero1.txt");
        int i;
        while ((i = fic.read()) != - 1) // se va leyendo un caracter
            System.out.println((char)i + " ==>" + i);
       /* char b[] = new char[5];
        while ((i-fic.read(b)) != -1)
            System.out.println(b);
*/        
fic.close();
        
        
    }
    
}
