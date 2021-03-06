//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.manifest.schema.v1_4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlAttribute;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlSchemaType;
import com.wb.nextgenlibrary.parser.XmlType;
import com.wb.nextgenlibrary.parser.XmlValue;


/**
 * <p>Java class for VideoTrackReference-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoTrackReference-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VideoTrackID" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}VideoTrackID-type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AdaptationSetID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.movielabs.com/schema/md/v2.3/md&gt;id-type"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TrackProfile" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}MediaProfile-type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoTrackReference-type", propOrder = {
    "videoTrackID",
    "adaptationSetID",
    "trackProfile"
})
public class VideoTrackReferenceType {

    @XmlElement(name = "VideoTrackID", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> videoTrackID;
    @XmlElement(name = "AdaptationSetID")
    protected VideoTrackReferenceType.AdaptationSetID adaptationSetID;
    @XmlElement(name = "TrackProfile")
    protected List<MediaProfileType> trackProfile;
    @XmlAttribute(name = "priority")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger priority;

    /**
     * Gets the value of the videoTrackID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoTrackID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoTrackID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVideoTrackID() {
        if (videoTrackID == null) {
            videoTrackID = new ArrayList<String>();
        }
        return this.videoTrackID;
    }

    /**
     * Gets the value of the adaptationSetID property.
     * 
     * @return
     *     possible object is
     *     {@link AdaptationSetID }
     *     
     */
    public AdaptationSetID getAdaptationSetID() {
        return adaptationSetID;
    }

    /**
     * Sets the value of the adaptationSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdaptationSetID }
     *     
     */
    public void setAdaptationSetID(AdaptationSetID value) {
        this.adaptationSetID = value;
    }

    /**
     * Gets the value of the trackProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MediaProfileType }
     * 
     * 
     */
    public List<MediaProfileType> getTrackProfile() {
        if (trackProfile == null) {
            trackProfile = new ArrayList<MediaProfileType>();
        }
        return this.trackProfile;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.movielabs.com/schema/md/v2.3/md&gt;id-type"&gt;
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
    public static class AdaptationSetID {

        @XmlValue
        protected String value;

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

    }

}
