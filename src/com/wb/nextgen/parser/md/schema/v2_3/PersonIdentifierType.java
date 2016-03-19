//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgen.parser.md.schema.v2_3;

import com.wb.nextgen.parser.XmlAccessType;
import com.wb.nextgen.parser.XmlAccessorType;
import com.wb.nextgen.parser.XmlElement;
import com.wb.nextgen.parser.XmlSchemaType;
import com.wb.nextgen.parser.XmlType;


/**
 * <p>Java class for PersonIdentifier-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentifier-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Namespace" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Idenifier_Namespace"/&gt;
 *         &lt;element name="ReferenceLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentifier-type", propOrder = {
    "identifier",
    "namespace",
    "referenceLocation"
})
public class PersonIdentifierType {

    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "Namespace", required = true)
    protected String namespace;
    @XmlElement(name = "ReferenceLocation")
    @XmlSchemaType(name = "anyURI")
    protected String referenceLocation;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamespace(String value) {
        this.namespace = value;
    }

    /**
     * Gets the value of the referenceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceLocation() {
        return referenceLocation;
    }

    /**
     * Sets the value of the referenceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceLocation(String value) {
        this.referenceLocation = value;
    }

}
