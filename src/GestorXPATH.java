
import java.io.File;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
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
    AbreFile ab = new AbreFile();
    String salida = "";

    public int ejecutarXpath(String variableNodo,String valorNodoDeterminado) {
        try {

            miGestorDOM.abrirMiXml(new File(ab.getRutaAuxiliar()));
            XPath xpath = XPathFactory.newInstance().newXPath();
            XPathExpression expresion = xpath.compile(dameExpresionDeBusqueda(variableNodo, valorNodoDeterminado));
            Object result = expresion.evaluate(miGestorDOM.getDoc(), XPathConstants.NODESET);
            NodeList listaDeNodos = (NodeList) result;

            for (int i = 0; i < listaDeNodos.getLength(); i++) {
                 salida = salida + "\n" + listaDeNodos.item(i).getFirstChild().getNodeValue();
            }
            System.out.println(salida);
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }
    public String dameExpresionDeBusqueda(String parametro_1, String parametro_2){
        String salidaVariable="/taller/coche/"+parametro_1+"[.='"+parametro_2+"']";
        System.out.println(salidaVariable);
        return salidaVariable;
    }

}
