
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igorr
 */
public class ManejadorSAX extends DefaultHandler{
    String salida="";

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        for(int i = start;i<length+start;i++){
            salida=salida+ch[i];
        }
        salida=salida.trim()+"\n";
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equals("coche")){
            salida=salida+"-|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|--|-";
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equals("coche")){
            salida=salida+"Cliente nuevo\n"+"Matricula: "+attributes.getValue(attributes.getQName(0).trim());
        }else if(qName.equals("fecha_entrada")){
            salida=salida+"\n"+"Vehiculo entro al garaje: ".trim();
        }else if(qName.equals("marca")){
            salida=salida+"Modelo de coche: ".trim();
        }else if(qName.equals("propietario")){
            salida=salida+"Propietario:";
            salida=salida+"\t"+("\nDNI: "+ attributes.getValue(attributes.getQName(0)).trim());
        }else if(qName.equals("nombre")){
            salida=salida+"\n"+"\t"+("Nombre: ").trim();
        }else if(qName.equals("primerApellido")){
            salida=salida+"\t"+("Primer Apellido: ").trim();
        }else if(qName.equals("segundoApellido")){
            salida=salida+"\t"+("Segundo Apellido: ").trim();
        }else if(qName.equals("asunto")){
            salida=salida+"El asunto de visita: \n ";
        }else if(qName.equals("id")){
            salida=salida+"Identificador del mecanico: "+attributes.getValue(attributes.getQName(0).trim());
        }else if(qName.equals("mecanico")){
            salida=salida+"Mecanico: ".trim();
        }else if(qName.equals("descripcion")){
            salida=salida+"Descripcion de la operación realizada: ".trim();
        }else if(qName.equals("precio")){
            salida=salida+"Total a pagar: ".trim();
        }else if(qName.equals("fecha_salida")){
            salida=salida+"Vehiculo fue recogido: ".trim();
        }
    }
    
}
