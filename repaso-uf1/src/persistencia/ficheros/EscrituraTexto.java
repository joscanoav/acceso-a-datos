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
public class EscrituraTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rutaFichero = "miArchivo.txt";
        try (FileWriter escritor = new FileWriter(rutaFichero)){
               escritor.write("Hello World");
              //for(int i=0; i<5;i++){
              //  escritor.write(i + "\n");
              System.out.println("Se ha escrito correctamente...");
            
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
}
}

        
 

    
    
