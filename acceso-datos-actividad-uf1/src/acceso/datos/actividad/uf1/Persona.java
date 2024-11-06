/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso.datos.actividad.uf1;

import java.io.Serializable;

/**
 *
 * @author josca
 * La clase Persona representa a una persona con nombre, apellido, ciudad,
 * nacionalidad y edad
 */
public class Persona implements Serializable{
    /**
     * Propiedades de la clase (nombre, apellido,ciudad, nacionalidad y edad)
     */
    public String nombre;
    public String apellido;
    public String ciudad;
    public String nacionalidad;
    public int edad;
    
    /**
     * Constructor vacio que crea una persona sin inicializar campos
     */
    public Persona(){
    }
    
    /**
     * Constructor vacio que crea una persona e inicializa solo el nombre
     * @param nombre Nombre de la persona.
     */
    public Persona (String nombre){
        this.nombre = nombre;
    }
    /**
     * Cosntructor que inicializa todos los campos de la persona
     * @param nombre        Nombre de la persona.
     * @param apellido      Apellido de la persona.
     * @param ciudad        Ciudad de residencia de la persona.
     * @param nacionalidad  Nacionalidad de la persona.
     * @param edad          Edad de la persona.
     */
    public Persona(String nombre, String apellido, String ciudad, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }
    
        
    /**
     * Se generan getters y Setters de cada campo
     */
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Muestra la información de todos los campos de la persona.
     */
    public void mostrarTodosCampos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Edad: " + edad);
    }
    
    /**
     * Devuelve una representación en forma de cadena de los atributos de la persona.
     * @return Una cadena con los datos de la persona (nombre, apellido, ciudad, nacionalidad y edad).
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Ciudad: " + ciudad +
               ", Nacionalidad: " + nacionalidad + ", Edad: " + edad;
    }
  
}
