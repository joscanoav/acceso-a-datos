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
public class EscribirLeerBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try( FileOutputStream fos = new FileOutputStream("numeros.bin")){
            for (int i = 0; i < 5; i++) {
                fos.write(i);
            }
            System.out.println("Se escribieron correctamente");
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        try(FileInputStream fis = new FileInputStream ("numeros.bin")){
            int line;
            while((line = fis.read()) != -1){
                System.out.println(line + "\n");
            }
        }catch (IOException e){
            System.out.println("error" + e.getMessage());
        }
        
    }
    
}
