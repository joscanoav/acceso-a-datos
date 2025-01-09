/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.orientada.objetos;

/**
 *
 * @author josca
 */
public class MainAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalHerencia animal = new AnimalHerencia();
        PerroHerencia perro = new PerroHerencia();
        
        animal.sonido();
        perro.sonido();
    }
    
}
