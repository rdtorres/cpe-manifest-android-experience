//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.08 at 03:02:05 PM PST 
//


package com.wb.nextgenlibrary.parser.manifest.schema.v1_4;


import java.util.ArrayList;
import java.util.List;

import com.wb.nextgenlibrary.parser.XmlAccessType;
import com.wb.nextgenlibrary.parser.XmlAccessorType;
import com.wb.nextgenlibrary.parser.XmlElement;
import com.wb.nextgenlibrary.parser.XmlType;


/**
 * <p>Java class for ALIDExperienceMapList-type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ALIDExperienceMapList-type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ALIDExperienceMap" type="{http://www.movielabs.com/schema/manifest/v1.4/manifest}ALIDExperienceMap-type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALIDExperienceMapList-type", propOrder = {
    "alidExperienceMap"
})
public class ALIDExperienceMapListType {

    @XmlElement(name = "ALIDExperienceMap", required = true)
    protected List<ALIDExperienceMapType> alidExperienceMap;

    /**
     * Gets the value of the alidExperienceMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alidExperienceMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getALIDExperienceMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ALIDExperienceMapType }
     * 
     * 
     */
    public List<ALIDExperienceMapType> getALIDExperienceMap() {
        if (alidExperienceMap == null) {
            alidExperienceMap = new ArrayList<ALIDExperienceMapType>();
        }
        return this.alidExperienceMap;
    }

}
