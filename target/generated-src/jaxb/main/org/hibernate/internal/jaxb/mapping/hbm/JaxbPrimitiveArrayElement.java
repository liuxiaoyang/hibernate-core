//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-520 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.02 at 11:21:08 ���� EST 
//


package org.hibernate.internal.jaxb.mapping.hbm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for primitive-array-element complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="primitive-array-element">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meta" type="{http://www.hibernate.org/xsd/hibernate-mapping}meta-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subselect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cache" type="{http://www.hibernate.org/xsd/hibernate-mapping}cache-element" minOccurs="0"/>
 *         &lt;element name="synchronize" type="{http://www.hibernate.org/xsd/hibernate-mapping}synchronize-element" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="key" type="{http://www.hibernate.org/xsd/hibernate-mapping}key-element"/>
 *         &lt;choice>
 *           &lt;element name="index" type="{http://www.hibernate.org/xsd/hibernate-mapping}index-element"/>
 *           &lt;element name="list-index" type="{http://www.hibernate.org/xsd/hibernate-mapping}list-index-element"/>
 *         &lt;/choice>
 *         &lt;element name="element" type="{http://www.hibernate.org/xsd/hibernate-mapping}element-element"/>
 *         &lt;element name="loader" type="{http://www.hibernate.org/xsd/hibernate-mapping}loader-element" minOccurs="0"/>
 *         &lt;element name="sql-insert" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-insert-element" minOccurs="0"/>
 *         &lt;element name="sql-update" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-update-element" minOccurs="0"/>
 *         &lt;element name="sql-delete" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-delete-element" minOccurs="0"/>
 *         &lt;element name="sql-delete-all" type="{http://www.hibernate.org/xsd/hibernate-mapping}sql-delete-all-element" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="access" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="batch-size" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="catalog" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="check" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="collection-type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="embed-xml" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="fetch" type="{http://www.hibernate.org/xsd/hibernate-mapping}fetch-attribute-with-subselect" />
 *       &lt;attribute name="mutable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="node" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="optimistic-lock" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="outer-join" type="{http://www.hibernate.org/xsd/hibernate-mapping}outer-join-attribute" />
 *       &lt;attribute name="persister" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="schema" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subselect" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="table" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="where" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "primitive-array-element", propOrder = {
    "meta",
    "subselect",
    "cache",
    "synchronize",
    "comment",
    "key",
    "index",
    "listIndex",
    "element",
    "loader",
    "sqlInsert",
    "sqlUpdate",
    "sqlDelete",
    "sqlDeleteAll"
})
public class JaxbPrimitiveArrayElement {

    protected List<JaxbMetaElement> meta;
    protected String subselect;
    protected JaxbCacheElement cache;
    protected List<JaxbSynchronizeElement> synchronize;
    protected String comment;
    @XmlElement(required = true)
    protected JaxbKeyElement key;
    protected JaxbIndexElement index;
    @XmlElement(name = "list-index")
    protected JaxbListIndexElement listIndex;
    @XmlElement(required = true)
    protected JaxbElementElement element;
    protected JaxbLoaderElement loader;
    @XmlElement(name = "sql-insert")
    protected JaxbSqlInsertElement sqlInsert;
    @XmlElement(name = "sql-update")
    protected JaxbSqlUpdateElement sqlUpdate;
    @XmlElement(name = "sql-delete")
    protected JaxbSqlDeleteElement sqlDelete;
    @XmlElement(name = "sql-delete-all")
    protected JaxbSqlDeleteAllElement sqlDeleteAll;
    @XmlAttribute
    protected String access;
    @XmlAttribute(name = "batch-size")
    protected String batchSize;
    @XmlAttribute
    protected String catalog;
    @XmlAttribute
    protected String check;
    @XmlAttribute(name = "collection-type")
    protected String collectionType;
    @XmlAttribute(name = "embed-xml")
    protected Boolean embedXml;
    @XmlAttribute
    protected JaxbFetchAttributeWithSubselect fetch;
    @XmlAttribute
    protected Boolean mutable;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected String node;
    @XmlAttribute(name = "optimistic-lock")
    protected Boolean optimisticLock;
    @XmlAttribute(name = "outer-join")
    protected JaxbOuterJoinAttribute outerJoin;
    @XmlAttribute
    protected String persister;
    @XmlAttribute
    protected String schema;
    @XmlAttribute(name = "subselect")
    protected String subselectAttribute;
    @XmlAttribute
    protected String table;
    @XmlAttribute
    protected String where;

    /**
     * Gets the value of the meta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbMetaElement }
     * 
     * 
     */
    public List<JaxbMetaElement> getMeta() {
        if (meta == null) {
            meta = new ArrayList<JaxbMetaElement>();
        }
        return this.meta;
    }

    /**
     * Gets the value of the subselect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselect() {
        return subselect;
    }

    /**
     * Sets the value of the subselect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselect(String value) {
        this.subselect = value;
    }

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbCacheElement }
     *     
     */
    public JaxbCacheElement getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbCacheElement }
     *     
     */
    public void setCache(JaxbCacheElement value) {
        this.cache = value;
    }

    /**
     * Gets the value of the synchronize property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchronize property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronize().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbSynchronizeElement }
     * 
     * 
     */
    public List<JaxbSynchronizeElement> getSynchronize() {
        if (synchronize == null) {
            synchronize = new ArrayList<JaxbSynchronizeElement>();
        }
        return this.synchronize;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbKeyElement }
     *     
     */
    public JaxbKeyElement getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbKeyElement }
     *     
     */
    public void setKey(JaxbKeyElement value) {
        this.key = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbIndexElement }
     *     
     */
    public JaxbIndexElement getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbIndexElement }
     *     
     */
    public void setIndex(JaxbIndexElement value) {
        this.index = value;
    }

    /**
     * Gets the value of the listIndex property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbListIndexElement }
     *     
     */
    public JaxbListIndexElement getListIndex() {
        return listIndex;
    }

    /**
     * Sets the value of the listIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbListIndexElement }
     *     
     */
    public void setListIndex(JaxbListIndexElement value) {
        this.listIndex = value;
    }

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbElementElement }
     *     
     */
    public JaxbElementElement getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbElementElement }
     *     
     */
    public void setElement(JaxbElementElement value) {
        this.element = value;
    }

    /**
     * Gets the value of the loader property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbLoaderElement }
     *     
     */
    public JaxbLoaderElement getLoader() {
        return loader;
    }

    /**
     * Sets the value of the loader property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbLoaderElement }
     *     
     */
    public void setLoader(JaxbLoaderElement value) {
        this.loader = value;
    }

    /**
     * Gets the value of the sqlInsert property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbSqlInsertElement }
     *     
     */
    public JaxbSqlInsertElement getSqlInsert() {
        return sqlInsert;
    }

    /**
     * Sets the value of the sqlInsert property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbSqlInsertElement }
     *     
     */
    public void setSqlInsert(JaxbSqlInsertElement value) {
        this.sqlInsert = value;
    }

    /**
     * Gets the value of the sqlUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbSqlUpdateElement }
     *     
     */
    public JaxbSqlUpdateElement getSqlUpdate() {
        return sqlUpdate;
    }

    /**
     * Sets the value of the sqlUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbSqlUpdateElement }
     *     
     */
    public void setSqlUpdate(JaxbSqlUpdateElement value) {
        this.sqlUpdate = value;
    }

    /**
     * Gets the value of the sqlDelete property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbSqlDeleteElement }
     *     
     */
    public JaxbSqlDeleteElement getSqlDelete() {
        return sqlDelete;
    }

    /**
     * Sets the value of the sqlDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbSqlDeleteElement }
     *     
     */
    public void setSqlDelete(JaxbSqlDeleteElement value) {
        this.sqlDelete = value;
    }

    /**
     * Gets the value of the sqlDeleteAll property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbSqlDeleteAllElement }
     *     
     */
    public JaxbSqlDeleteAllElement getSqlDeleteAll() {
        return sqlDeleteAll;
    }

    /**
     * Sets the value of the sqlDeleteAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbSqlDeleteAllElement }
     *     
     */
    public void setSqlDeleteAll(JaxbSqlDeleteAllElement value) {
        this.sqlDeleteAll = value;
    }

    /**
     * Gets the value of the access property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccess() {
        return access;
    }

    /**
     * Sets the value of the access property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccess(String value) {
        this.access = value;
    }

    /**
     * Gets the value of the batchSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchSize(String value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the catalog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalog() {
        return catalog;
    }

    /**
     * Sets the value of the catalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalog(String value) {
        this.catalog = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheck(String value) {
        this.check = value;
    }

    /**
     * Gets the value of the collectionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionType() {
        return collectionType;
    }

    /**
     * Sets the value of the collectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionType(String value) {
        this.collectionType = value;
    }

    /**
     * Gets the value of the embedXml property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEmbedXml() {
        if (embedXml == null) {
            return true;
        } else {
            return embedXml;
        }
    }

    /**
     * Sets the value of the embedXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmbedXml(Boolean value) {
        this.embedXml = value;
    }

    /**
     * Gets the value of the fetch property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbFetchAttributeWithSubselect }
     *     
     */
    public JaxbFetchAttributeWithSubselect getFetch() {
        return fetch;
    }

    /**
     * Sets the value of the fetch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbFetchAttributeWithSubselect }
     *     
     */
    public void setFetch(JaxbFetchAttributeWithSubselect value) {
        this.fetch = value;
    }

    /**
     * Gets the value of the mutable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMutable() {
        if (mutable == null) {
            return true;
        } else {
            return mutable;
        }
    }

    /**
     * Sets the value of the mutable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMutable(Boolean value) {
        this.mutable = value;
    }

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
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNode(String value) {
        this.node = value;
    }

    /**
     * Gets the value of the optimisticLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOptimisticLock() {
        if (optimisticLock == null) {
            return true;
        } else {
            return optimisticLock;
        }
    }

    /**
     * Sets the value of the optimisticLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptimisticLock(Boolean value) {
        this.optimisticLock = value;
    }

    /**
     * Gets the value of the outerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JaxbOuterJoinAttribute }
     *     
     */
    public JaxbOuterJoinAttribute getOuterJoin() {
        return outerJoin;
    }

    /**
     * Sets the value of the outerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JaxbOuterJoinAttribute }
     *     
     */
    public void setOuterJoin(JaxbOuterJoinAttribute value) {
        this.outerJoin = value;
    }

    /**
     * Gets the value of the persister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersister() {
        return persister;
    }

    /**
     * Sets the value of the persister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersister(String value) {
        this.persister = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchema(String value) {
        this.schema = value;
    }

    /**
     * Gets the value of the subselectAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubselectAttribute() {
        return subselectAttribute;
    }

    /**
     * Sets the value of the subselectAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubselectAttribute(String value) {
        this.subselectAttribute = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTable(String value) {
        this.table = value;
    }

    /**
     * Gets the value of the where property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhere() {
        return where;
    }

    /**
     * Sets the value of the where property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhere(String value) {
        this.where = value;
    }

}
