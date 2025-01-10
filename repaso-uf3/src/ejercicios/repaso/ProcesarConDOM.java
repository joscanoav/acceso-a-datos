/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.repaso;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.File;

public class ProcesarConDOM {
    public static void main(String[] args) throws Exception {
       
        File archivo = new File("alumnos.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(archivo);

        NodeList listaAlumnos = doc.getElementsByTagName("Alumno");
        for (int i = 0; i < listaAlumnos.getLength(); i++) {
            Element alumno = (Element) listaAlumnos.item(i);
            String nombre = alumno.getElementsByTagName("Nombre").item(0).getTextContent();
            String edad = alumno.getElementsByTagName("Edad").item(0).getTextContent();
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        }
    }
}