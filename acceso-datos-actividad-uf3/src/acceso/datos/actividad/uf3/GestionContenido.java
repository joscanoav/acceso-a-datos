/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso.datos.actividad.uf3;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author josca
 */
public class GestionContenido extends DefaultHandler{
    public GestionContenido() {
        super();
    }
    public void startDocument() {
        System.out.println("Comienzo del Documento XML");
    }
    public void endDocument() {
        System.out.println("Final del Documento XML");
    }
    public void startElement(String uri, String nombre,
                             String nombreC, Attributes atts) {
        System.out.printf("\t Principio Elemento: %s %n", nombre);
    }
    public void endElement(String uri, String nombre,
                           String nombreC) {
        System.out.printf("\tFin Elemento: %s %n", nombre);
    }
    public void characters(char[] ch, int inicio, int longitud)
                          throws SAXException {
        String car = new String(ch, inicio, longitud);
        //quitar saltos de línea
        car = car.replaceAll("[\\t\\n]","");
        System.out.printf("\t Caracteres: %s %n", car);
    }
} 