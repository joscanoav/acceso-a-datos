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
public class GestionArchivosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rutaArchivo = "numeros.bin";
        
        //Escribir numeros entreos
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(rutaArchivo))){
            for (int i = 1; i <=5; i++){
                dos.writeInt(i);
                }// escribimos del 1 al 5
            } catch (IOException e){
                    System.out.println("Error : " + e.getMessage());
                    }
        // Lee numeros y calcular el promedio
        try (DataInputStream dis = new DataInputStream (new FileInputStream(rutaArchivo))){
            int suma = 0, contador = 0;
            while (dis.available()>0){
                int numero = dis.readInt();
                suma += numero;
                contador++;
            }
            
            double promedio = (double) suma / contador;
            System.out.println("Promedio: " + promedio);
        }catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
