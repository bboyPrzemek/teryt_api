
package com.example.demo.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WyszukajMiejscowoscWebCountResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "wyszukajMiejscowoscWebCountResult"
})
@XmlRootElement(name = "WyszukajMiejscowoscWebCountResponse")
public class WyszukajMiejscowoscWebCountResponse {

    @XmlElement(name = "WyszukajMiejscowoscWebCountResult")
    protected Integer wyszukajMiejscowoscWebCountResult;

    /**
     * Gets the value of the wyszukajMiejscowoscWebCountResult property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWyszukajMiejscowoscWebCountResult() {
        return wyszukajMiejscowoscWebCountResult;
    }

    /**
     * Sets the value of the wyszukajMiejscowoscWebCountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWyszukajMiejscowoscWebCountResult(Integer value) {
        this.wyszukajMiejscowoscWebCountResult = value;
    }

}
