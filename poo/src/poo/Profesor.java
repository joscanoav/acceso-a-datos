/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author josca
 */
public class Profesor extends Persona {
        //campos especificos de subclase.
    private String IdProfesor;
    // Constructor de la subclase: incluimos como parametros al menos los del constructor de la superclase
    public Profesor(String nombre, String apellidos, int edad){
        super(nombre,apellidos,edad);
        IdProfesor = "Unknown";} //Cierre de constructor
    // Metodos especificos de la subclase

    public void setIdProfesor(String IdProfesor) {
        this.IdProfesor = IdProfesor;
    }

    public String getIdProfesor() {
        return IdProfesor;
    }
    public void mostrarNombreApellidosYCarnet(){
    
        // nombre = "Paco"; Si tratamos de acceder directamente a un campo privado de la superclase, salta eror.
        // Si podemos acceder a variables de instancia a traves de los getters de acceso de la superclase
        System.out.println("Profesor nombre: " + getNombre() + "" + getApellidos()+ "con Id de profesor:" + getIdProfesor());}
    
    }
    
