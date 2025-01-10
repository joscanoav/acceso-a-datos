/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.repaso;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author josca
 */
public class LeerXMLDOM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            // Ruta del archivo
            File file = new File("persona.xml");
            
            // Crear instancia de document builderfactory y document builder
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Parsear el archivo XML y obtener el documento
            
            Document document = builder.parse(file);
            
            // Normalizar el documento XML
            document.getDocumentElement().normalize();
            
            //Obtener el elemento raiz
            Element root = document.getDocumentElement();
            System.out.println("Raiz : " + root.getNodeName());
            
            //Obtener todos los elementos hijos del elemento raiz
            
            NodeList nodeList = root.getChildNodes();
            
            // Recorrer los nodos hijos
            for (int i = 0; i < nodeList.getLength();i++){
                Node node = nodeList.item(i);
                // Verificar si el nodo es un elemento
                if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                    System.out.println("Etiqueta: " + element.getNodeName()+ ", Valor: " + element.getTextContent());
                }
            }
           
           
        }catch(Exception e){
            e.printStackTrace();
        }
    
    
    }
    
}
