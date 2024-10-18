/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import java.io.*;

public class EscribirFichObject {

    public static void main(String[] args) throws IOException {
        // Crear algunas personas para escribir en el archivo
        Persona persona1 = new Persona("Juan", "Pérez", 25); // ahora con apellidos
        Persona persona2 = new Persona("María", "González", 30); // ahora con apellidos

        // Crear el archivo y escribir los objetos
        File fichero = new File("FichPersona.dat");
        try (ObjectOutputStream dataOS = new ObjectOutputStream(new FileOutputStream(fichero))) {
            dataOS.writeObject(persona1);
            dataOS.writeObject(persona2);
            System.out.println("Archivo creado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}