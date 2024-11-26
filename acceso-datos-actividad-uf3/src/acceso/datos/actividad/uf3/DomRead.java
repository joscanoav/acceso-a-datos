/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso.datos.actividad.uf3;

/**
 *
 * @author josca
 * Importamos las librerias para desarrollar el programa
 */
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DomRead {

    // El programa utiliza un parser DOM para procesar un archivo XML.
    // Usar throws simplifica el código del main al delegar el manejo de excepciones a un nivel superior.

    public static void main(String[] args)throws ParserConfigurationException {
     try {
        // Crear una instancia de DocumentBuilderFactory para configurar el parser DOM
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        // Crear un parser DOM a partir de la fábrica
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Leer y parsear el archivo XML "personas.xml" generando un árbol DOM
        Document documento = builder.parse(new File("personas.xml"));

        // Normalizar el documento XML para combinar nodos de texto
        documento.getDocumentElement().normalize();

        // Obtener una lista de todos los nodos <persona> en el archivo XML
        NodeList listaPersonas = documento.getElementsByTagName("persona");

        // Iterar sobre cada nodo <persona> encontrado
        for (int i = 0; i < listaPersonas.getLength(); i++) {
            // Obtener el nodo actual de la lista
            Node nodo = listaPersonas.item(i);

            // Verificar si el nodo es de tipo ELEMENT_NODE (es decir, un nodo válido de XML)
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                // Convertir el nodo a un elemento para trabajar con sus atributos e hijos
                Element elementoPersona = (Element) nodo;

                // Obtener todos los nodos hijos del nodo <persona> (como <nombre>, <edad>, etc.)
                NodeList hijos = elementoPersona.getChildNodes();

                // Imprimir el número de la persona (por índice en la lista)
                System.out.println("Persona " + (i + 1) + ":");

                // Iterar sobre los hijos del nodo <persona>
                for (int j = 0; j < hijos.getLength(); j++) {
                    // Obtener cada hijo del nodo <persona>
                    Node hijo = hijos.item(j);

                    // Verificar si el hijo es de tipo ELEMENT_NODE
                    if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                        // Imprimir el nombre del nodo hijo (etiqueta) y su contenido de texto
                        System.out.println("  Nodo: " + hijo.getNodeName() + ", Texto: " + hijo.getTextContent());
                    }
                }
                System.out.println();
            }
        }
    } catch (SAXException | IOException ex) {
        System.out.println("Error al leer el archivo XML: " + ex.getMessage());
    }
  }
}