/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.repaso;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.Transformer;
import org.w3c.dom.Element;
import org.w3c.dom.Document;

/**
 *
 * @author josca
 */
public class CrearXMLDOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //crear instancia para construir el XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // crear documento vacio con raiz persona
            Document document = builder.newDocument();
            Element raiz = document.createElement("persona");
            document.appendChild(raiz);

            // Agregar los elementos
            CrearElemento("nombre", "Juan Perez", raiz, document);
            CrearElemento("edad", "30", raiz, document);

            //Guardar el XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new java.io.File("persona.xml"));
            transformer.transform(source, result);

            // Mostrar el XML generado por consola
            StreamResult console = new StreamResult(System.out);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Metodo auxilar para crear mas elementos
    static void CrearElemento(String tagName, String value, Element parent, Document document) {
        Element elem = document.createElement(tagName);
        elem.appendChild(document.createTextNode(value));
        parent.appendChild(elem);
    }

}


