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
 * <p>Java class for cache-mode-attribute.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="cache-mode-attribute">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="get"/>
 *     &lt;enumeration value="ignore"/>
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="put"/>
 *     &lt;enumeration value="refresh"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "cache-mode-attribute")
@XmlEnum
public enum JaxbCacheModeAttribute {

    @XmlEnumValue("get")
    GET("get"),
    @XmlEnumValue("ignore")
    IGNORE("ignore"),
    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("put")
    PUT("put"),
    @XmlEnumValue("refresh")
    REFRESH("refresh");
    private final String value;

    JaxbCacheModeAttribute(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static JaxbCacheModeAttribute fromValue(String v) {
        for (JaxbCacheModeAttribute c: JaxbCacheModeAttribute.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
