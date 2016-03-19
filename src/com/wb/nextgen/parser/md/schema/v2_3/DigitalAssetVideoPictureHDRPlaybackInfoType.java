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
import com.wb.nextgen.parser.XmlAnyElement;
import com.wb.nextgen.parser.XmlElement;
import com.wb.nextgen.parser.XmlType;


/**
 * <p>Java class for DigitalAssetVideoPictureHDRPlaybackInfo-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigitalAssetVideoPictureHDRPlaybackInfo-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SDRDownconversion" type="{http://www.movielabs.com/schema/md/v2.3/md}string-Video-Pic-SDRDownconversion" minOccurs="0"/&gt;
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalAssetVideoPictureHDRPlaybackInfo-type", propOrder = {
    "sdrDownconversion",
    "any"
})
public class DigitalAssetVideoPictureHDRPlaybackInfoType {

    @XmlElement(name = "SDRDownconversion")
    protected String sdrDownconversion;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the sdrDownconversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDRDownconversion() {
        return sdrDownconversion;
    }

    /**
     * Sets the value of the sdrDownconversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDRDownconversion(String value) {
        this.sdrDownconversion = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
