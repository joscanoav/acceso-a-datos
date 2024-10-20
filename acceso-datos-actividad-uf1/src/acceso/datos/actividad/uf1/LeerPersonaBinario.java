/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso.datos.actividad.uf1;

/**
 *
 * @author josca
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LeerPersonaBinario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menu principal
            System.out.println("Menu de opciones:");
            System.out.println("1. Escribir personas en fichero de texto");
            System.out.println("2. Leer personas desde fichero de texto");
            System.out.println("3. Guardar personas en fichero binario");
            System.out.println("4. Leer personas desde fichero binario");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de linea

            switch (opcion) {
                case 1:
                    escribirPersonas();
                    break;
                case 2:
                    leerPersonas();
                    break;
                case 3:
                    guardarPersonasEnBinario();
                    break;
                case 4:
                    leerPersonasDesdeBinario();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida. Intentalo de nuevo.");
            }
        }
    }

    /**
     * Método para escribir personas en un fichero de texto.
     */
    public static void escribirPersonas() {
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
     * Método que permite escribir datos de tres personas en el fichero.
     *
     * @param file   El fichero donde se guardarán los datos.
     * @param append Si es true, añade los datos al final; si es false, sobrescribe el fichero.
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
    

    /**
     * Método para leer personas desde un fichero de texto.
     */
    public static void leerPersonas() {
 Scanner scanner = new Scanner(System.in);

        // Pedir la ruta del fichero y el nombre
        System.out.print("Introduce la ruta del fichero (incluyendo el nombre del fichero): ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("Error: El fichero no existe.");
            return;
        }

        // Submenú de opciones
        System.out.println("Opciones de lectura:");
        System.out.println("1. Leer todo el fichero");
        System.out.println("2. Leer datos de una persona por nombre");
        System.out.print("Elige una opcion: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea

        try {
            switch (opcion) {
                case 1:
                    leerTodoElFichero(file);
                    break;
                case 2:
                    leerPersonaPorNombre(file);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    /**
     * Método para leer todo el contenido de un fichero de texto.
     *
     * @param file El fichero que se va a leer.
     * @throws IOException Si ocurre algún error al leer el fichero.
     */
    public static void leerTodoElFichero(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String linea;

        System.out.println("Contenido del fichero:");
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }

        reader.close();
    }

    /**
     * Método para buscar y leer datos de una persona por su nombre en un fichero de texto.
     *
     * @param file El fichero que se va a leer.
     * @throws IOException Si ocurre algún error al leer el fichero.
     */
    public static void leerPersonaPorNombre(File file) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre de la persona a buscar
        System.out.print("Introduce el nombre de la persona que deseas buscar: ");
        String nombreBuscado = scanner.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String linea;
        boolean encontrado = false;

        System.out.println("Resultados de la busqueda:");
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(", ");
            String nombre = datos[0];

            if (nombre.equalsIgnoreCase(nombreBuscado)) {
                System.out.println(linea);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron personas con el nombre: " + nombreBuscado);
        }

        reader.close();
    }

    public static void guardarPersonasEnBinario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta del fichero binario (incluyendo el nombre del fichero): ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        System.out.println("El numero maximo de personas a insertar es 3.");
        int numPersonas;
        do {
            System.out.print(" Cuantas personas deseas insertar? (Maximo 3): ");
            numPersonas = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de linea
            if (numPersonas < 1 || numPersonas > 3) {
                System.out.println("Por favor, introduce un numero entre 1 y 3.");
            }
        } while (numPersonas < 1 || numPersonas > 3);

        List<Persona> personas = new ArrayList<>();

        // Pedimos los datos de las personas
        for (int i = 1; i <= numPersonas; i++) {
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
            scanner.nextLine();  // Consumir el salto de linea

            personas.add(new Persona(nombre, apellido, ciudad, nacionalidad, edad));
        }

        // Guardar las personas en un fichero binario
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(personas);
            System.out.println("Datos guardados correctamente en el fichero binario.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el fichero binario: " + e.getMessage());
        }
    }

    // Nueva opcion para leer desde un fichero binario
    public static void leerPersonasDesdeBinario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la ruta del fichero binario (incluyendo el nombre del fichero): ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("El fichero no existe. Asegurate de introducir la ruta correcta.");
            return;
        }

        // Intentamos leer las personas desde el fichero binario
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Persona> personas = (List<Persona>) ois.readObject();

            // Submenu para leer todo el archivo o una persona especifica
            System.out.println("Que deseas hacer?");
            System.out.println("1. Leer todo el archivo");
            System.out.println("2. Leer una persona especifica");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de linea

            switch (opcion) {
                case 1:
                    // Leer todo el archivo
                    System.out.println("Personas en el fichero:");
                    for (Persona persona : personas) {
                        System.out.println(persona);
                    }
                    break;
                case 2:
                    // Leer una persona especifica por nombre
                    System.out.print("Introduce el nombre de la persona que deseas buscar: ");
                    String nombreBuscado = scanner.nextLine();

                    boolean personaEncontrada = false;
                    for (Persona persona : personas) {
                        if (persona.getNombre().equalsIgnoreCase(nombreBuscado)) {
                            System.out.println(persona);
                            personaEncontrada = true;
                        }
                    }

                    if (!personaEncontrada) {
                        System.out.println("No se encontro ninguna persona con el nombre indicado.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el fichero binario: " + e.getMessage());
        }
    }
}