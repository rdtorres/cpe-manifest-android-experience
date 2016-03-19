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
import com.wb.nextgen.parser.XmlSchemaType;
import com.wb.nextgen.parser.XmlSeeAlso;
import com.wb.nextgen.parser.XmlType;
import com.wb.nextgen.parser.manifest.schema.v1_4.InventoryAncillaryType;


/**
 * <p>Java class for DigitalAssetAncillaryData-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalAssetAncillaryData-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Anc-Type"/&gt;
 *         &lt;element name="SubType" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Anc-SubType" minOccurs="0"/&gt;
 *         &lt;element name="BaseTrackID" type="{http://www.movielabs.com/schema/md/v2.3/md}id-type" minOccurs="0"/&gt;
 *         &lt;element name="BaseTrackReference" type="{http://www.movielabs.com/schema/md/v2.3/md}string-TrackReference" minOccurs="0"/&gt;
 *         &lt;element name="BaseTrackIdentifier" type="{http://www.movielabs.com/schema/md/v2.3/md}ContentIdentifier-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TrackMetadata" type="{http://www.movielabs.com/schema/md/v2.3/md}DigitalAssetMetadata-type" minOccurs="0"/&gt;
 *         &lt;element name="CombinedMetadata" type="{http://www.movielabs.com/schema/md/v2.3/md}DigitalAssetMetadata-type" minOccurs="0"/&gt;
 *         &lt;element name="Private" type="{http://www.movielabs.com/schema/md/v2.3/md}PrivateData-type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalAssetAncillaryData-type", propOrder = {
    "type",
    "subType",
    "baseTrackID",
    "baseTrackReference",
    "baseTrackIdentifier",
    "trackMetadata",
    "combinedMetadata",
    "_private"
})
@XmlSeeAlso({
    InventoryAncillaryType.class
})
public class DigitalAssetAncillaryDataType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "SubType")
    protected String subType;
    @XmlElement(name = "BaseTrackID")
    @XmlSchemaType(name = "anyURI")
    protected String baseTrackID;
    @XmlElement(name = "BaseTrackReference")
    protected String baseTrackReference;
    @XmlElement(name = "BaseTrackIdentifier")
    protected List<ContentIdentifierType> baseTrackIdentifier;
    @XmlElement(name = "TrackMetadata")
    protected DigitalAssetMetadataType trackMetadata;
    @XmlElement(name = "CombinedMetadata")
    protected DigitalAssetMetadataType combinedMetadata;
    @XmlElement(name = "Private")
    protected PrivateDataType _private;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * Gets the value of the baseTrackID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTrackID() {
        return baseTrackID;
    }

    /**
     * Sets the value of the baseTrackID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTrackID(String value) {
        this.baseTrackID = value;
    }

    /**
     * Gets the value of the baseTrackReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseTrackReference() {
        return baseTrackReference;
    }

    /**
     * Sets the value of the baseTrackReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseTrackReference(String value) {
        this.baseTrackReference = value;
    }

    /**
     * Gets the value of the baseTrackIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseTrackIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseTrackIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentIdentifierType }
     * 
     * 
     */
    public List<ContentIdentifierType> getBaseTrackIdentifier() {
        if (baseTrackIdentifier == null) {
            baseTrackIdentifier = new ArrayList<ContentIdentifierType>();
        }
        return this.baseTrackIdentifier;
    }

    /**
     * Gets the value of the trackMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalAssetMetadataType }
     *     
     */
    public DigitalAssetMetadataType getTrackMetadata() {
        return trackMetadata;
    }

    /**
     * Sets the value of the trackMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalAssetMetadataType }
     *     
     */
    public void setTrackMetadata(DigitalAssetMetadataType value) {
        this.trackMetadata = value;
    }

    /**
     * Gets the value of the combinedMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link DigitalAssetMetadataType }
     *     
     */
    public DigitalAssetMetadataType getCombinedMetadata() {
        return combinedMetadata;
    }

    /**
     * Sets the value of the combinedMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigitalAssetMetadataType }
     *     
     */
    public void setCombinedMetadata(DigitalAssetMetadataType value) {
        this.combinedMetadata = value;
    }

    /**
     * Gets the value of the private property.
     * 
     * @return
     *     possible object is
     *     {@link PrivateDataType }
     *     
     */
    public PrivateDataType getPrivate() {
        return _private;
    }

    /**
     * Sets the value of the private property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivateDataType }
     *     
     */
    public void setPrivate(PrivateDataType value) {
        this._private = value;
    }

}
