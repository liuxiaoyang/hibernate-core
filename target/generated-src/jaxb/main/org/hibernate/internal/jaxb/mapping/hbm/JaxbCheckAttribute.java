//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.02 at 11:21:08 ���� EST 
//


package org.hibernate.internal.jaxb.mapping.hbm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for check-attribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="check-attribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="param"/>
 *     &lt;enumeration value="rowcount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "check-attribute")
@XmlEnum
public enum JaxbCheckAttribute {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("param")
    PARAM("param"),
    @XmlEnumValue("rowcount")
    ROWCOUNT("rowcount");
    private final String value;

    JaxbCheckAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbCheckAttribute fromValue(String v) {
        for (JaxbCheckAttribute c: JaxbCheckAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}