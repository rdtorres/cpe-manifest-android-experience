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
import com.wb.nextgen.parser.XmlSchemaType;
import com.wb.nextgen.parser.XmlType;
import com.wb.nextgen.parser.XmlValue;
import com.wb.nextgen.parser.md.schema.v2_3.ContentRatingType;


/**
 * <p>Java class for ExperienceApp-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExperienceApp-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AppGroupID" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}AppGroupID-type"/&gt;
 *         &lt;element name="AppName" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rating" type="{http://www.movielabs.com/schema/md/v2.3/md}ContentRating-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContentID" type="{http://www.movielabs.com/schema/md/v2.3/md}ContentID-type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AppID" type="{http://www.movielabs.com/schema/md/v2.3/md}id-type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExperienceApp-type", propOrder = {
    "type",
    "subType",
    "appGroupID",
    "appName",
    "rating",
    "contentID"
})
public class ExperienceAppType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "SubType")
    protected List<String> subType;
    @XmlElement(name = "AppGroupID", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String appGroupID;
    @XmlElement(name = "AppName")
    protected List<AppName> appName;
    @XmlElement(name = "Rating")
    protected List<ContentRatingType> rating;
    @XmlElement(name = "ContentID")
    @XmlSchemaType(name = "anyURI")
    protected String contentID;
    @XmlAttribute(name = "AppID")
    protected String appID;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubType() {
        if (subType == null) {
            subType = new ArrayList<String>();
        }
        return this.subType;
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

    /**
     * Gets the value of the appName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppName }
     * 
     * 
     */
    public List<AppName> getAppName() {
        if (appName == null) {
            appName = new ArrayList<AppName>();
        }
        return this.appName;
    }

    /**
     * Gets the value of the rating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentRatingType }
     * 
     * 
     */
    public List<ContentRatingType> getRating() {
        if (rating == null) {
            rating = new ArrayList<ContentRatingType>();
        }
        return this.rating;
    }

    /**
     * Gets the value of the contentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentID() {
        return contentID;
    }

    /**
     * Sets the value of the contentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentID(String value) {
        this.contentID = value;
    }

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AppName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "language")
        protected Boolean language;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the language property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isLanguage() {
            return language;
        }

        /**
         * Sets the value of the language property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setLanguage(Boolean value) {
            this.language = value;
        }

    }

}
