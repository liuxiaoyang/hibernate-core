//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.02 at 11:21:09 ���� EST 
//


package org.hibernate.internal.jaxb.mapping.orm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 This element contains the entity field or property mappings. It may be sparsely populated to include
 *                 only a
 *                 subset of the fields or properties. If metadata-complete for the entity is true then the remainder of
 *                 the
 *                 attributes will be defaulted according to the default rules.
 *             
 * 
 * <p>Java class for attributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="id" type="{http://java.sun.com/xml/ns/persistence/orm}id" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="embedded-id" type="{http://java.sun.com/xml/ns/persistence/orm}embedded-id" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="basic" type="{http://java.sun.com/xml/ns/persistence/orm}basic" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="version" type="{http://java.sun.com/xml/ns/persistence/orm}version" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="many-to-one" type="{http://java.sun.com/xml/ns/persistence/orm}many-to-one" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="one-to-many" type="{http://java.sun.com/xml/ns/persistence/orm}one-to-many" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="one-to-one" type="{http://java.sun.com/xml/ns/persistence/orm}one-to-one" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="many-to-many" type="{http://java.sun.com/xml/ns/persistence/orm}many-to-many" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="element-collection" type="{http://java.sun.com/xml/ns/persistence/orm}element-collection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="embedded" type="{http://java.sun.com/xml/ns/persistence/orm}embedded" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transient" type="{http://java.sun.com/xml/ns/persistence/orm}transient" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributes", propOrder = {
    "description",
    "id",
    "embeddedId",
    "basic",
    "version",
    "manyToOne",
    "oneToMany",
    "oneToOne",
    "manyToMany",
    "elementCollection",
    "embedded",
    "_transient"
})
public class JaxbAttributes {

    protected String description;
    protected List<JaxbId> id;
    @XmlElement(name = "embedded-id")
    protected JaxbEmbeddedId embeddedId;
    protected List<JaxbBasic> basic;
    protected List<JaxbVersion> version;
    @XmlElement(name = "many-to-one")
    protected List<JaxbManyToOne> manyToOne;
    @XmlElement(name = "one-to-many")
    protected List<JaxbOneToMany> oneToMany;
    @XmlElement(name = "one-to-one")
    protected List<JaxbOneToOne> oneToOne;
    @XmlElement(name = "many-to-many")
    protected List<JaxbManyToMany> manyToMany;
    @XmlElement(name = "element-collection")
    protected List<JaxbElementCollection> elementCollection;
    protected List<JaxbEmbedded> embedded;
    @XmlElement(name = "transient")
    protected List<JaxbTransient> _transient;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbId }
     * 
     * 
     */
    public List<JaxbId> getId() {
        if (id == null) {
            id = new ArrayList<JaxbId>();
        }
        return this.id;
    }

    /**
     * Gets the value of the embeddedId property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbEmbeddedId }
     *     
     */
    public JaxbEmbeddedId getEmbeddedId() {
        return embeddedId;
    }

    /**
     * Sets the value of the embeddedId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbEmbeddedId }
     *     
     */
    public void setEmbeddedId(JaxbEmbeddedId value) {
        this.embeddedId = value;
    }

    /**
     * Gets the value of the basic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbBasic }
     * 
     * 
     */
    public List<JaxbBasic> getBasic() {
        if (basic == null) {
            basic = new ArrayList<JaxbBasic>();
        }
        return this.basic;
    }

    /**
     * Gets the value of the version property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the version property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbVersion }
     * 
     * 
     */
    public List<JaxbVersion> getVersion() {
        if (version == null) {
            version = new ArrayList<JaxbVersion>();
        }
        return this.version;
    }

    /**
     * Gets the value of the manyToOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manyToOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManyToOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbManyToOne }
     * 
     * 
     */
    public List<JaxbManyToOne> getManyToOne() {
        if (manyToOne == null) {
            manyToOne = new ArrayList<JaxbManyToOne>();
        }
        return this.manyToOne;
    }

    /**
     * Gets the value of the oneToMany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneToMany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneToMany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbOneToMany }
     * 
     * 
     */
    public List<JaxbOneToMany> getOneToMany() {
        if (oneToMany == null) {
            oneToMany = new ArrayList<JaxbOneToMany>();
        }
        return this.oneToMany;
    }

    /**
     * Gets the value of the oneToOne property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oneToOne property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOneToOne().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbOneToOne }
     * 
     * 
     */
    public List<JaxbOneToOne> getOneToOne() {
        if (oneToOne == null) {
            oneToOne = new ArrayList<JaxbOneToOne>();
        }
        return this.oneToOne;
    }

    /**
     * Gets the value of the manyToMany property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manyToMany property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManyToMany().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbManyToMany }
     * 
     * 
     */
    public List<JaxbManyToMany> getManyToMany() {
        if (manyToMany == null) {
            manyToMany = new ArrayList<JaxbManyToMany>();
        }
        return this.manyToMany;
    }

    /**
     * Gets the value of the elementCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbElementCollection }
     * 
     * 
     */
    public List<JaxbElementCollection> getElementCollection() {
        if (elementCollection == null) {
            elementCollection = new ArrayList<JaxbElementCollection>();
        }
        return this.elementCollection;
    }

    /**
     * Gets the value of the embedded property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the embedded property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmbedded().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbEmbedded }
     * 
     * 
     */
    public List<JaxbEmbedded> getEmbedded() {
        if (embedded == null) {
            embedded = new ArrayList<JaxbEmbedded>();
        }
        return this.embedded;
    }

    /**
     * Gets the value of the transient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbTransient }
     * 
     * 
     */
    public List<JaxbTransient> getTransient() {
        if (_transient == null) {
            _transient = new ArrayList<JaxbTransient>();
        }
        return this._transient;
    }

}
