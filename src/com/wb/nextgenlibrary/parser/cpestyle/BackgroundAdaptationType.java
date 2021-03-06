//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.16 at 03:29:52 PM PDT 
//


package com.wb.nextgenlibrary.parser.cpestyle;

import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for BackgroundAdaptation-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BackgroundAdaptation-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScaleMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PositioningMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FillColor" type="{http://www.movielabs.com/schema/md/cpestyle/v1.0/cpestyle}ColorHex-type" minOccurs="0"/&gt;
 *         &lt;element name="SafeArea" type="{http://www.movielabs.com/schema/md/cpestyle/v1.0/cpestyle}ImageSubArea-type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackgroundAdaptation-type", propOrder = {
    "scaleMethod",
    "positioningMethod",
    "fillColor",
    "safeArea"
})
public class BackgroundAdaptationType {

    @XmlElement(name = "ScaleMethod")
    protected String scaleMethod;
    @XmlElement(name = "PositioningMethod")
    protected String positioningMethod;
    @XmlElement(name = "FillColor")
    protected String fillColor;
    @XmlElement(name = "SafeArea")
    protected ImageSubAreaType safeArea;

    /**
     * Gets the value of the scaleMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleMethod() {
        return scaleMethod;
    }

    /**
     * Sets the value of the scaleMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleMethod(String value) {
        this.scaleMethod = value;
    }

    /**
     * Gets the value of the positioningMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositioningMethod() {
        return positioningMethod;
    }

    /**
     * Sets the value of the positioningMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositioningMethod(String value) {
        this.positioningMethod = value;
    }

    /**
     * Gets the value of the fillColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillColor() {
        return fillColor;
    }

    /**
     * Sets the value of the fillColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillColor(String value) {
        this.fillColor = value;
    }

    /**
     * Gets the value of the safeArea property.
     * 
     * @return
     *     possible object is
     *     {@link ImageSubAreaType }
     *     
     */
    public ImageSubAreaType getSafeArea() {
        return safeArea;
    }

    /**
     * Sets the value of the safeArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageSubAreaType }
     *     
     */
    public void setSafeArea(ImageSubAreaType value) {
        this.safeArea = value;
    }

}
