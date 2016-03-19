//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgen.parser.manifest.schema.v1_4;

import java.util.ArrayList;
import java.util.List;
import com.wb.nextgen.parser.XmlAccessType;
import com.wb.nextgen.parser.XmlAccessorType;
import com.wb.nextgen.parser.XmlAttribute;
import com.wb.nextgen.parser.XmlElement;
import com.wb.nextgen.parser.XmlType;


/**
 * <p>Java class for AppGroup-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppGroup-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InteractiveTrackReference" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}InteractiveTrackReference-type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AppGroupID" use="required" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}AppGroupID-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppGroup-type", propOrder = {
    "interactiveTrackReference"
})
public class AppGroupType {

    @XmlElement(name = "InteractiveTrackReference", required = true)
    protected List<InteractiveTrackReferenceType> interactiveTrackReference;
    @XmlAttribute(name = "AppGroupID", required = true)
    protected String appGroupID;

    /**
     * Gets the value of the interactiveTrackReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactiveTrackReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractiveTrackReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractiveTrackReferenceType }
     * 
     * 
     */
    public List<InteractiveTrackReferenceType> getInteractiveTrackReference() {
        if (interactiveTrackReference == null) {
            interactiveTrackReference = new ArrayList<InteractiveTrackReferenceType>();
        }
        return this.interactiveTrackReference;
    }

    /**
     * Gets the value of the appGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppGroupID() {
        return appGroupID;
    }

    /**
     * Sets the value of the appGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppGroupID(String value) {
        this.appGroupID = value;
    }

}
