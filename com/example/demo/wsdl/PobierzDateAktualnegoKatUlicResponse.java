
package com.example.demo.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="PobierzDateAktualnegoKatUlicResult" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
    "pobierzDateAktualnegoKatUlicResult"
})
@XmlRootElement(name = "PobierzDateAktualnegoKatUlicResponse")
public class PobierzDateAktualnegoKatUlicResponse {

    @XmlElement(name = "PobierzDateAktualnegoKatUlicResult")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pobierzDateAktualnegoKatUlicResult;

    /**
     * Gets the value of the pobierzDateAktualnegoKatUlicResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPobierzDateAktualnegoKatUlicResult() {
        return pobierzDateAktualnegoKatUlicResult;
    }

    /**
     * Sets the value of the pobierzDateAktualnegoKatUlicResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPobierzDateAktualnegoKatUlicResult(XMLGregorianCalendar value) {
        this.pobierzDateAktualnegoKatUlicResult = value;
    }

}
