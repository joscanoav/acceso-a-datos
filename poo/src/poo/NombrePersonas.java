/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author josca
 */
public class NombrePersonas {

    public static void main(String[] args) {
        
        Persona p1 = new Persona(); // instanciamos el objeto 1
        Persona p2 = new Persona();
        p1.nombre = "Juan";
        p1.apellidos = "Gonzalez";
        p2.nombre = "Luis";
        p2.apellidos = "Gomez";
        
        p1.mostrarNombre();
        p2.mostrarNombre();

    }
    
}
