/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso.datos.actividad.uf1;

/**
 * @author josca
 * La clase Main permite almacenar los datos de tres personas en un fichero de texto.
 * Solicita al usuario la ruta y nombre del fichero, y luego los datos de las personas.
 * Gestiona los casos en que el fichero ya exista o no, y permite añadir o sobrescribir.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class AlmacenarPersonaFichero {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la ruta del fichero y el nombre
        System.out.print("Introduce la ruta del fichero (incluyendo el nombre del fichero): ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        try {
            if (file.exists()) {
                // Si el fichero ya existe, preguntar si se desea sobrescribir o añadir datos
                System.out.println("El fichero ya existe.");
                System.out.print("Deseas sobrescribirlo (S) o agregar datos al final (A)? ");
                String opcion = scanner.nextLine().toUpperCase();

                if (opcion.equals("S")) {
                    escribirFichero(file, false);  // Sobrescribir
                } else if (opcion.equals("A")) {
                    escribirFichero(file, true);  // Añadir al final
                } else {
                    System.out.println("Opcion no valida.");
                }

            } else {
                // Si el fichero no existe, crearlo
                System.out.println("El fichero no existe. Se creara uno nuevo.");
                escribirFichero(file, false);  // Crear nuevo fichero
            }

        } catch (IOException e) {
            System.out.println("Error al gestionar el fichero: " + e.getMessage());
        }
    }

    /**
     * Escribe los datos de tres personas en un fichero de texto.
     *
     * @param file    El fichero en el que se guardarán los datos.
     * @param append  Si es true, añade los datos al final; si es false, sobrescribe el fichero.
     * @throws IOException Si ocurre algún error al escribir en el fichero.
     */
    public static void escribirFichero(File file, boolean append) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = new FileWriter(file, append);

        // Pedir datos de tres personas
        for (int i = 1; i <= 3; i++) {
            System.out.println("Introduce los datos de la persona " + i + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();

            System.out.print("Nacionalidad: ");
            String nacionalidad = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea después del número

            // Crear objeto Persona con los datos recogidos
            Persona persona = new Persona(nombre, apellido, ciudad, nacionalidad, edad);

            // Escribir los datos de la persona en el fichero
            writer.write(persona.getNombre() + ", " + persona.getApellido() + ", " +
                    persona.getCiudad() + ", " + persona.getNacionalidad() + ", " +
                    persona.getEdad() + "\n");
        }

        // Cerrar el FileWriter
        writer.close();
        System.out.println("Datos guardados correctamente en el fichero.");
    }
}
