/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.orientada.objetos;

/**
 *
 * @author josca
 */
public class PersonaCapsula {
    // atributos privados
    private String nombre;
    private int edad;
    
    //Getter para obtener el valor de nombre
    
    public String getNombre(){
        return nombre;
    
    }
    
    // Setter para modificar el valor de nombre
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    // Getter para obtener el valor de edad
    
    public int getEdad(){
        return edad;
    }
    
    // Setter para modificar el valor de edad
    
    public void setEdad(int edad){
        if(edad > 0){ // validacion 
            this.edad=edad;
        }
    }
}
