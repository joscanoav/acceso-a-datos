/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso.datos.actividad.uf1;

/**
 *
 * @author josca
 * Clase principal que muestra las tres instancias de la clase Persona
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // Crear personas usando diferentes constructores
        Persona persona1 = new Persona("Luis", "Oscanoa", "Cueto", "Argentina", 25);
        Persona persona2 = new Persona("Cristian", "Ventura", "Masa", "Peruana", 43);
        Persona persona3 = new Persona("Matias", "Garcia", "Sevilla", "Espanola", 50);

        // Mostrar información de las personas
        System.out.println("Datos de Persona 1:");
        persona1.mostrarTodosCampos();

        System.out.println("\nDatos de Persona 2:");
        persona2.mostrarTodosCampos();

        System.out.println("\nDatos de Persona 3:");
        persona3.mostrarTodosCampos();
    }
}