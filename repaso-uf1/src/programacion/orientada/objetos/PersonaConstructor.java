/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.objetos;

/**
 *
 * @author josca
 */
public class PersonaConstructor {
    private String nombre;
    private int edad;
    //Constructor por defecto
    public PersonaConstructor(){
        this.nombre = "Si nombre";
        this.edad = 0;
    }
    
    //Constructor con parametros
    public PersonaConstructor(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // metodo para mostrar datos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
