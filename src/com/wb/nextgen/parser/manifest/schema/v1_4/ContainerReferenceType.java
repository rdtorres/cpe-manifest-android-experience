//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgen.parser.manifest.schema.v1_4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import com.wb.nextgen.parser.XmlAccessType;
import com.wb.nextgen.parser.XmlAccessorType;
import com.wb.nextgen.parser.XmlElement;
import com.wb.nextgen.parser.XmlSchemaType;
import com.wb.nextgen.parser.XmlSeeAlso;
import com.wb.nextgen.parser.XmlType;
import com.wb.nextgen.parser.md.schema.v2_3.ContentIdentifierType;
import com.wb.nextgen.parser.md.schema.v2_3.HashType;


/**
 * <p>Java class for ContainerReference-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerReference-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerLocation" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}Location-type" minOccurs="0"/&gt;
 *         &lt;element name="ParentContainer" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}ContainerReference-type" minOccurs="0"/&gt;
 *         &lt;element name="ContainerIdentifier" type="{http://www.movielabs.com/schema/md/v2.3/md}ContentIdentifier-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Hash" type="{http://www.movielabs.com/schema/md/v2.3/md}Hash-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerReference-type", propOrder = {
    "containerLocation",
    "parentContainer",
    "containerIdentifier",
    "length",
    "hash"
})
@XmlSeeAlso({
    com.wb.nextgen.parser.manifest.schema.v1_4.InventoryMetadataType.ContainerReference.class,
    com.wb.nextgen.parser.manifest.schema.v1_4.InventoryTextObjectType.ContainerReference.class
})
public class ContainerReferenceType {

    @XmlElement(name = "ContainerLocation")
    @XmlSchemaType(name = "anyURI")
    protected String containerLocation;
    @XmlElement(name = "ParentContainer")
    protected ContainerReferenceType parentContainer;
    @XmlElement(name = "ContainerIdentifier")
    protected List<ContentIdentifierType> containerIdentifier;
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger length;
    @XmlElement(name = "Hash")
    protected List<HashType> hash;

    /**
     * Gets the value of the containerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerLocation() {
        return containerLocation;
    }

    /**
     * Sets the value of the containerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerLocation(String value) {
        this.containerLocation = value;
    }

    /**
     * Gets the value of the parentContainer property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerReferenceType }
     *     
     */
    public ContainerReferenceType getParentContainer() {
        return parentContainer;
    }

    /**
     * Sets the value of the parentContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerReferenceType }
     *     
     */
    public void setParentContainer(ContainerReferenceType value) {
        this.parentContainer = value;
    }

    /**
     * Gets the value of the containerIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentIdentifierType }
     * 
     * 
     */
    public List<ContentIdentifierType> getContainerIdentifier() {
        if (containerIdentifier == null) {
            containerIdentifier = new ArrayList<ContentIdentifierType>();
        }
        return this.containerIdentifier;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hash property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHash().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HashType }
     * 
     * 
     */
    public List<HashType> getHash() {
        if (hash == null) {
            hash = new ArrayList<HashType>();
        }
        return this.hash;
    }

}
