
package com.example.demo.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="PobierzListeStanowSimcResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
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
    "pobierzListeStanowSimcResult"
})
@XmlRootElement(name = "PobierzListeStanowSimcResponse")
public class PobierzListeStanowSimcResponse {

    @XmlElementRef(name = "PobierzListeStanowSimcResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> pobierzListeStanowSimcResult;

    /**
     * Gets the value of the pobierzListeStanowSimcResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getPobierzListeStanowSimcResult() {
        return pobierzListeStanowSimcResult;
    }

    /**
     * Sets the value of the pobierzListeStanowSimcResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setPobierzListeStanowSimcResult(JAXBElement<ArrayOfstring> value) {
        this.pobierzListeStanowSimcResult = value;
    }

}
