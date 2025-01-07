/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.orientada.objetos;

/**
 *
 * @author josca
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        // Asignar valores a los atributos
        persona.nombre = "Juan";
        persona.edad = 30;
        // Llamar al metodo saludar
        persona.saludar();
    }
    
}
