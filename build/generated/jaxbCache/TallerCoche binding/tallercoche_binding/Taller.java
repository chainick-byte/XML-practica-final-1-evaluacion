//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: AM.12.02 a las 12:43:44 AM GMT 
//


package tallercoche_binding;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="coche" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="fecha_entrada" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="propietario" maxOccurs="unbounded">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="dni" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="asunto">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="mecanico">
 *                                 &lt;complexType>
 *                                   &lt;simpleContent>
 *                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/extension>
 *                                   &lt;/simpleContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="fecha_salida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coche"
})
@XmlRootElement(name = "taller")
public class Taller {

    protected List<Taller.Coche> coche;

    /**
     * Gets the value of the coche property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coche property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoche().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Taller.Coche }
     * 
     * 
     */
    public List<Taller.Coche> getCoche() {
        if (coche == null) {
            coche = new ArrayList<Taller.Coche>();
        }
        return this.coche;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fecha_entrada" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="propietario" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="dni" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="asunto">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mecanico">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fecha_salida" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="matricula" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fechaEntrada",
        "marca",
        "propietario",
        "asunto",
        "precio",
        "fechaSalida"
    })
    public static class Coche {

        @XmlElement(name = "fecha_entrada", required = true)
        protected String fechaEntrada;
        @XmlElement(required = true)
        protected String marca;
        @XmlElement(required = true)
        protected List<Taller.Coche.Propietario> propietario;
        @XmlElement(required = true)
        protected Taller.Coche.Asunto asunto;
        @XmlElement(required = true)
        protected String precio;
        @XmlElement(name = "fecha_salida", required = true)
        protected String fechaSalida;
        @XmlAttribute(name = "matricula")
        protected String matricula;

        /**
         * Obtiene el valor de la propiedad fechaEntrada.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaEntrada() {
            return fechaEntrada;
        }

        /**
         * Define el valor de la propiedad fechaEntrada.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaEntrada(String value) {
            this.fechaEntrada = value;
        }

        /**
         * Obtiene el valor de la propiedad marca.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarca() {
            return marca;
        }

        /**
         * Define el valor de la propiedad marca.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarca(String value) {
            this.marca = value;
        }

        /**
         * Gets the value of the propietario property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the propietario property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPropietario().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Taller.Coche.Propietario }
         * 
         * 
         */
        public List<Taller.Coche.Propietario> getPropietario() {
            if (propietario == null) {
                propietario = new ArrayList<Taller.Coche.Propietario>();
            }
            return this.propietario;
        }

        /**
         * Obtiene el valor de la propiedad asunto.
         * 
         * @return
         *     possible object is
         *     {@link Taller.Coche.Asunto }
         *     
         */
        public Taller.Coche.Asunto getAsunto() {
            return asunto;
        }

        /**
         * Define el valor de la propiedad asunto.
         * 
         * @param value
         *     allowed object is
         *     {@link Taller.Coche.Asunto }
         *     
         */
        public void setAsunto(Taller.Coche.Asunto value) {
            this.asunto = value;
        }

        /**
         * Obtiene el valor de la propiedad precio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrecio() {
            return precio;
        }

        /**
         * Define el valor de la propiedad precio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrecio(String value) {
            this.precio = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaSalida.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaSalida() {
            return fechaSalida;
        }

        /**
         * Define el valor de la propiedad fechaSalida.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaSalida(String value) {
            this.fechaSalida = value;
        }

        /**
         * Obtiene el valor de la propiedad matricula.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMatricula() {
            return matricula;
        }

        /**
         * Define el valor de la propiedad matricula.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMatricula(String value) {
            this.matricula = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="mecanico">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "mecanico",
            "descripcion"
        })
        public static class Asunto {

            @XmlElement(required = true)
            protected Taller.Coche.Asunto.Mecanico mecanico;
            @XmlElement(required = true)
            protected String descripcion;

            /**
             * Obtiene el valor de la propiedad mecanico.
             * 
             * @return
             *     possible object is
             *     {@link Taller.Coche.Asunto.Mecanico }
             *     
             */
            public Taller.Coche.Asunto.Mecanico getMecanico() {
                return mecanico;
            }

            /**
             * Define el valor de la propiedad mecanico.
             * 
             * @param value
             *     allowed object is
             *     {@link Taller.Coche.Asunto.Mecanico }
             *     
             */
            public void setMecanico(Taller.Coche.Asunto.Mecanico value) {
                this.mecanico = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcion.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcion() {
                return descripcion;
            }

            /**
             * Define el valor de la propiedad descripcion.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcion(String value) {
                this.descripcion = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Mecanico {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "id")
                protected String id;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="primerApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="segundoApellido" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="dni" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nombre",
            "primerApellido",
            "segundoApellido"
        })
        public static class Propietario {

            @XmlElement(required = true)
            protected String nombre;
            @XmlElement(required = true)
            protected String primerApellido;
            @XmlElement(required = true)
            protected String segundoApellido;
            @XmlAttribute(name = "dni")
            protected String dni;

            /**
             * Obtiene el valor de la propiedad nombre.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombre() {
                return nombre;
            }

            /**
             * Define el valor de la propiedad nombre.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombre(String value) {
                this.nombre = value;
            }

            /**
             * Obtiene el valor de la propiedad primerApellido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimerApellido() {
                return primerApellido;
            }

            /**
             * Define el valor de la propiedad primerApellido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimerApellido(String value) {
                this.primerApellido = value;
            }

            /**
             * Obtiene el valor de la propiedad segundoApellido.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegundoApellido() {
                return segundoApellido;
            }

            /**
             * Define el valor de la propiedad segundoApellido.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegundoApellido(String value) {
                this.segundoApellido = value;
            }

            /**
             * Obtiene el valor de la propiedad dni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDni() {
                return dni;
            }

            /**
             * Define el valor de la propiedad dni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDni(String value) {
                this.dni = value;
            }

        }

    }

}
