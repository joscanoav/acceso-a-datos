/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia.ficheros;
import java.io.*;

public class VerInf {
    public static void main(String[] args) {
        System.out.println("INFORMACION SOBRE EL FICHERO: ");
        File f = new File("C:\\DAN\\PROGRAMACION\\acceso-a-datos\\persistencia-ficheros\\FichTexto.txt");
        if(f.exists()){
            System.out.println("Nombre del fichero  :   "+f.getName());
            System.out.println("Ruta                :   "+f.getPath());
            System.out.println("Ruta absoluta       :   "+f.getAbsolutePath());
            System.out.println("Se puede leer       :   "+f.canRead());
            System.out.println("Se puede escribir   :   "+f.canWrite());
            System.out.println("Tamaño              :   "+f.length());
            System.out.println("Es un directorio    :   "+f.isDirectory());
            System.out.println("Es un fichero       :   "+f.isFile());
            System.out.println("Nombre del directorio padre :   "+f.getParent());
        }
    }
    
}
