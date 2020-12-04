//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.12.02 a las 12:43:44 AM GMT 
//


package tallercoche_binding;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tallercoche_binding package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tallercoche_binding
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Taller }
     * 
     */
    public Taller createTaller() {
        return new Taller();
    }

    /**
     * Create an instance of {@link Taller.Coche }
     * 
     */
    public Taller.Coche createTallerCoche() {
        return new Taller.Coche();
    }

    /**
     * Create an instance of {@link Taller.Coche.Asunto }
     * 
     */
    public Taller.Coche.Asunto createTallerCocheAsunto() {
        return new Taller.Coche.Asunto();
    }

    /**
     * Create an instance of {@link Taller.Coche.Propietario }
     * 
     */
    public Taller.Coche.Propietario createTallerCochePropietario() {
        return new Taller.Coche.Propietario();
    }

    /**
     * Create an instance of {@link Taller.Coche.Asunto.Mecanico }
     * 
     */
    public Taller.Coche.Asunto.Mecanico createTallerCocheAsuntoMecanico() {
        return new Taller.Coche.Asunto.Mecanico();
    }

}
