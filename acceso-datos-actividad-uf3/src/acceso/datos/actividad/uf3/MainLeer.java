/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso.datos.actividad.uf3;

/**
 *
 * @author josca
 */
import java.io.*;
import org.xml.sax.*;
import javax.xml.parsers.*;

public class MainLeer {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, SAXException {
        try {
            // Crear una instancia de SAXParserFactory
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            // Obtener un XMLReader desde el SAXParser
            XMLReader procesadorXML = saxParser.getXMLReader();

            // Establecer el manejador de contenido
            GestionContenido gestor = new GestionContenido();
            procesadorXML.setContentHandler(gestor);

            // Procesar el archivo XML
            InputSource fileXML = new InputSource("personas.xml");
            procesadorXML.parse(fileXML);
        } catch (ParserConfigurationException e) {
            System.err.println("Error de configuración del parser: " + e.getMessage());
        }
    }
}
