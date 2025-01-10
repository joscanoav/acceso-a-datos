/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.repaso;

import java.io.File;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author josca
 */
public class LeerXMLSAX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            // Craer una instancia de SAXParserFactory
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            
            // Crear el manejador personalizado
            DefaultHandler handler = new DefaultHandler(){
                boolean isNombre = false;
                boolean isEdad = false;
                
                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
                    System.out.println("Inicio de elemento: " + qName);
                    
                    //Comprobar el nombre del elemento
                    if (qName.equalsIgnoreCase("nombre")){
                        isNombre = true;
                    } else if (qName.equalsIgnoreCase("edad")){
                        isEdad=true;
                    }
                }
                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException{
                    System.out.println("Fin de elemento: " + qName);
                }
                @Override
                public void characters(char[] ch, int start, int length)throws SAXException{
                
                    //Procesar el contenido entre etiquetas
                    
                    if(isNombre){
                        System.out.println("Nombre: " + new String(ch, start, length ));
                        isNombre = false;
                    }else if (isEdad){
                        System.out.println("Edad " + new String(ch, start, length));
                        isEdad = false;
                        }
                    }
                };
                // Parsear el archivo XML
                File file = new File("persona.xml");
                saxParser.parse(file, handler);
        
            }catch(Exception e){
            e.printStackTrace();
        }
    }   
}
