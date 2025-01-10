/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.repaso;
import org.xml.sax.*;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class ProcesarConSAX {
    public static void main(String[] args) throws Exception {
        
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        DefaultHandler handler = new DefaultHandler() {
            boolean esNombre = false;
            boolean esEdad = false;

            public void startElement(String uri, String localName, String qName, Attributes attributes) {
                if (qName.equalsIgnoreCase("Nombre")) {
                    esNombre = true;
                } else if (qName.equalsIgnoreCase("Edad")) {
                    esEdad = true;
                }
            }

            public void characters(char[] ch, int start, int length) {
                if (esNombre) {
                    System.out.println("Nombre: " + new String(ch, start, length));
                    esNombre = false;
                } else if (esEdad) {
                    System.out.println("Edad: " + new String(ch, start, length));
                    esEdad = false;
                }
            }
        };

        parser.parse("alumnos.xml", handler);
    }
}
