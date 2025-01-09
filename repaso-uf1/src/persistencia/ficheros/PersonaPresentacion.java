/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia.ficheros;

/**
 *
 * @author josca
 */
public class PersonaPresentacion {
    private String nombre;
    private int edad;

public PersonaPresentacion (){
    this.nombre = nombre;
    this.edad = edad;
}

public void Presentacion(){
    System.out.println("Mi nombre es " + nombre + " Mi edad es " + edad);
}

public static void main(String args[]){
    
    PersonaPresentacion persona1 = new PersonaPresentacion();
    PersonaPresentacion persona2 = new PersonaPresentacion();
    
    persona1.nombre="Daniel";
    persona1.edad =28;
    persona1.Presentacion();
    
    persona2.nombre="Jorge";
    persona2.edad=38;
    persona2.Presentacion();
    
}


    
    
    
}
