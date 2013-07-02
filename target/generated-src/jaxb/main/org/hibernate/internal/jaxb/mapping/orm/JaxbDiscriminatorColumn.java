//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.02 at 11:21:09 ���� EST 
//


package org.hibernate.internal.jaxb.mapping.orm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 @Target({TYPE}) @Retention(RUNTIME) public @interface DiscriminatorColumn {
 *                 String name() default "DTYPE"; DiscriminatorType discriminatorType() default STRING; String
 *                 columnDefinition()
 *                 default ""; int length() default 31;
 *                 }
 *             
 * 
 * <p>Java class for discriminator-column complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="discriminator-column">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="discriminator-type" type="{http://java.sun.com/xml/ns/persistence/orm}discriminator-type" />
 *       &lt;attribute name="column-definition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discriminator-column")
public class JaxbDiscriminatorColumn {

    @XmlAttribute
    protected String name;
    @XmlAttribute(name = "discriminator-type")
    protected JaxbDiscriminatorType discriminatorType;
    @XmlAttribute(name = "column-definition")
    protected String columnDefinition;
    @XmlAttribute
    protected Integer length;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the discriminatorType property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbDiscriminatorType }
     *     
     */
    public JaxbDiscriminatorType getDiscriminatorType() {
        return discriminatorType;
    }

    /**
     * Sets the value of the discriminatorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbDiscriminatorType }
     *     
     */
    public void setDiscriminatorType(JaxbDiscriminatorType value) {
        this.discriminatorType = value;
    }

    /**
     * Gets the value of the columnDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnDefinition() {
        return columnDefinition;
    }

    /**
     * Sets the value of the columnDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnDefinition(String value) {
        this.columnDefinition = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

}