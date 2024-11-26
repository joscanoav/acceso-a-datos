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
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

// Creamos la clase DomWrite donde se creara el archivo XML
public class DomWrite {


    public static void main(String[] args) {
        try {
            // Crear el DocumentBuilder y el DOMImplementation
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            
            // Crear el documento con la raíz "personas"
            Document documento = implementation.createDocument(null, "personas", null);
            documento.setXmlVersion("1.0");
            
            // Persona 1
            Element persona1 = documento.createElement("persona");
            Element nombre1 = documento.createElement("nombre");
            Text textNombre1 = documento.createTextNode("Jorge Oscanoa");
            nombre1.appendChild(textNombre1);
            persona1.appendChild(nombre1);

            Element edad1 = documento.createElement("edad");
            Text textEdad1 = documento.createTextNode("38");
            edad1.appendChild(textEdad1);
            persona1.appendChild(edad1);

            Element nacionalidad1 = documento.createElement("nacionalidad");
            Text textNacionalidad1 = documento.createTextNode("Peruana");
            nacionalidad1.appendChild(textNacionalidad1);
            persona1.appendChild(nacionalidad1);
            
            // Persona 2
            Element persona2 = documento.createElement("persona");
            Element nombre2 = documento.createElement("nombre");
            Text textNombre2 = documento.createTextNode("Ana Gomez");
            nombre2.appendChild(textNombre2);
            persona2.appendChild(nombre2);

            Element edad2 = documento.createElement("edad");
            Text textEdad2 = documento.createTextNode("25");
            edad2.appendChild(textEdad2);
            persona2.appendChild(edad2);

            Element nacionalidad2 = documento.createElement("nacionalidad");
            Text textNacionalidad2 = documento.createTextNode("Argentina");
            nacionalidad2.appendChild(textNacionalidad2);
            persona2.appendChild(nacionalidad2);
            
            // Persona 3
            Element persona3 = documento.createElement("persona");
            Element nombre3 = documento.createElement("nombre");
            Text textNombre3 = documento.createTextNode("Luis Martinez");
            nombre3.appendChild(textNombre3);
            persona3.appendChild(nombre3);

            Element edad3 = documento.createElement("edad");
            Text textEdad3 = documento.createTextNode("40");
            edad3.appendChild(textEdad3);
            persona3.appendChild(edad3);

            Element nacionalidad3 = documento.createElement("nacionalidad");
            Text textNacionalidad3 = documento.createTextNode("Española");
            nacionalidad3.appendChild(textNacionalidad3);
            persona3.appendChild(nacionalidad3);
            
            // Añadir personas al documento
            documento.getDocumentElement().appendChild(persona1);
            documento.getDocumentElement().appendChild(persona2);
            documento.getDocumentElement().appendChild(persona3);
            
            // Guardar el documento en un archivo XML
            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("personas.xml"));
            
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            
            System.out.println("Fichero XML creado");
            
        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
