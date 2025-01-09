/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.orientada.objetos;

/**
 *
 * @author josca
 */
public class PersonaCapsulaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaCapsula persona = new PersonaCapsula();
        // Usar setters para establecer valores
        persona.setNombre("Ana");
        persona.setEdad(-1);
        
        //Usar getters para obtener valores
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
    }
    
}
