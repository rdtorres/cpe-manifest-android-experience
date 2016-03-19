//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgen.parser.md.schema.v2_3;

import java.util.ArrayList;
import java.util.List;
import com.wb.nextgen.parser.XmlAccessType;
import com.wb.nextgen.parser.XmlAccessorType;
import com.wb.nextgen.parser.XmlElement;
import com.wb.nextgen.parser.XmlType;


/**
 * <p>Java class for BasicMetadataPeople-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicMetadataPeople-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Job" type="{http://www.movielabs.com/schema/md/v2.3/md}BasicMetadataJob-type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Name" type="{http://www.movielabs.com/schema/md/v2.3/md}PersonName-type"/&gt;
 *         &lt;element name="Identifier" type="{http://www.movielabs.com/schema/md/v2.3/md}PersonIdentifier-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Gender" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="male"/&gt;
 *               &lt;enumeration value="female"/&gt;
 *               &lt;enumeration value="neutral"/&gt;
 *               &lt;enumeration value="plural"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicMetadataPeople-type", propOrder = {
    "job",
    "name",
    "identifier",
    "gender"
})
public class BasicMetadataPeopleType {

    @XmlElement(name = "Job", required = true)
    protected List<BasicMetadataJobType> job;
    @XmlElement(name = "Name", required = true)
    protected PersonNameType name;
    @XmlElement(name = "Identifier")
    protected List<PersonIdentifierType> identifier;
    @XmlElement(name = "Gender")
    protected String gender;

    /**
     * Gets the value of the job property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the job property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasicMetadataJobType }
     * 
     * 
     */
    public List<BasicMetadataJobType> getJob() {
        if (job == null) {
            job = new ArrayList<BasicMetadataJobType>();
        }
        return this.job;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setName(PersonNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIdentifierType }
     * 
     * 
     */
    public List<PersonIdentifierType> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<PersonIdentifierType>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

}
