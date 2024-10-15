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
public class EscribirFichTexto {

    public static void main(String[] args) throws IOException {
        File fichero = new File ("FichTexto.txt"); // declara fichero
        FileWriter fic = new FileWriter(fichero);// crear flujo de salida
        String cadena = "Esto es una prueba con FileWriter";
        char[] cad = cadena.toCharArray();// convierte un String en array de caracteres
        
        for (int i = 0; i < cad.length; i++)
            fic.write(cad[i]);// se va escribiendo un caracter
        fic.append("*"); // añado al final un *
        fic.write(cad);// escribir un array de caracteres
        String c="\n*esto es lo ultimo*";
        fic.write(c);// escribir un String
        
        String prov[] = {"Albacete","Avila","Badajoz",
                         "Caceres", "Huelva", "Jaen",
                        "Madrid", "Segovia", "Soria","Toledo",
                        "Valladolid","Zamora"};
        fic.write("\n");
            for (int i = 0; i < prov.length; i++) {
                fic.write(prov[i]);
                fic.write("\n");
            }
            fic.close(); // cerrar fichero
            
        }
        
    }
    
