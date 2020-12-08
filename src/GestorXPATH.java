
import java.io.File;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author igorr
 */
public class GestorXPATH {

    GestorDOM miGestorDOM = new GestorDOM();
    String salida = "";

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public int ejecutarXpath( String valorMarca) {
        try {

            miGestorDOM.abrirMiXml(new File("taller_coche.xml"));
            XPath xpath = XPathFactory.newInstance().newXPath();
            XPathExpression expresion = xpath.compile(dameExpresionDeBusqueda(valorMarca));
            Object result = expresion.evaluate(miGestorDOM.getDoc(), XPathConstants.NODESET);

            NodeList listaDeNodos = (NodeList) result;
            for (int i = 0; i < listaDeNodos.getLength(); i++) {
                Node node = listaDeNodos.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    String[] datos_coche = procesarCoche(node);
                    for (int j = 0; j < datos_coche.length; j++) {
                        salida = salida + "\n" + datos_coche[j];
                    }

                }

            }
            
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }

    private String[] procesarCoche(Node node) {
        String[] datos = new String[12];
        Node temporal = null;
        int contador = 1;
        datos[0] = node.getAttributes().item(0).getNodeValue();
        NodeList miListaNodos = node.getChildNodes();
        for (int i = 0; i < miListaNodos.getLength(); i++) {
            temporal = miListaNodos.item(i);
            if (temporal.getNodeType() == Node.ELEMENT_NODE) {
                datos[contador] = temporal.getFirstChild().getNodeValue();
                contador++;
            } else if (temporal.getNodeType() == Node.ATTRIBUTE_NODE) {
                datos[contador] = temporal.getAttributes().item(i).getNodeValue();
                contador++;
            }
            NodeList listaDeOrdenDos = temporal.getChildNodes();
            for (int j = 0; j < listaDeOrdenDos.getLength(); j++) {
                Node miTemporalNuevo = listaDeOrdenDos.item(j);
                if (miTemporalNuevo.getNodeType() == Node.ELEMENT_NODE) {
                    datos[contador] = miTemporalNuevo.getFirstChild().getNodeValue();
                    contador++;
                } 
                if (miTemporalNuevo.getNodeType() == Node.ATTRIBUTE_NODE) {
                    
                    datos[contador] = miTemporalNuevo.getAttributes().item(j).getNodeValue();
                    contador++;
                }

            }
        }

        return datos;
    }

    public String dameExpresionDeBusqueda(String marca) {
        String salidaVariable = "/taller/coche[./marca='"+marca+"']";
        System.out.println(salidaVariable);
        return salidaVariable;
    }

   

   

}
