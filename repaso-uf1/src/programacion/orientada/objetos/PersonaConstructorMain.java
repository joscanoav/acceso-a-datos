/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.orientada.objetos;

/**
 *
 * @author josca
 */
public class PersonaConstructorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaConstructor p1 = new PersonaConstructor();// Usa el constructor por defecto
        PersonaConstructor p2 = new PersonaConstructor("Carlos", 28); // Usa el constructor con parametros
        
        p1.mostrarDatos();
        p2.mostrarDatos();
    }
    
}
