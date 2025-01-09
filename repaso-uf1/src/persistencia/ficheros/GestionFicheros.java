/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia.ficheros;

import java.io.File;

/**
 *
 * @author josca
 */
public class GestionFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File archivo = new File("miArchivo.txt");
        
        try{
            if (archivo.createNewFile()){
            System.out.println("Archivo creado: " + archivo.getName());
            } else {
            System.out.println("Archivo existe");
            }
        } catch(Exception e){
            System.out.println("Erro al crear el archivo: " + e.getMessage());
        }
        }
        
    }
    
