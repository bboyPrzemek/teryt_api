
package com.example.demo.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlacUlica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlacUlica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentyfikatorTERC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NazwaMiejscowosci" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RodzajMiejscowosci" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdentyfikatorSIMC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdentyfikatorPRNG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NazwaPelnaUlic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RodzajObiektu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nazwa1Ulic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Nazwa2Ulic" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdentyfikatorULIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumerUchwaly" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DataUchwaly" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OpisUchwaly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkDoDokumentu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeometriaObiektu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IIp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PoczatekWersjiObiektu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KoniecWersjiObiektu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacUlica", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", propOrder = {
    "identyfikatorTERC",
    "nazwaMiejscowosci",
    "rodzajMiejscowosci",
    "identyfikatorSIMC",
    "identyfikatorPRNG",
    "nazwaPelnaUlic",
    "rodzajObiektu",
    "nazwa1Ulic",
    "nazwa2Ulic",
    "identyfikatorULIC",
    "numerUchwaly",
    "dataUchwaly",
    "opisUchwaly",
    "linkDoDokumentu",
    "geometriaObiektu",
    "iIp",
    "poczatekWersjiObiektu",
    "koniecWersjiObiektu"
})
public class PlacUlica {

    @XmlElement(name = "IdentyfikatorTERC", required = true, nillable = true)
    protected String identyfikatorTERC;
    @XmlElement(name = "NazwaMiejscowosci", required = true, nillable = true)
    protected String nazwaMiejscowosci;
    @XmlElement(name = "RodzajMiejscowosci", required = true, nillable = true)
    protected String rodzajMiejscowosci;
    @XmlElement(name = "IdentyfikatorSIMC", required = true, nillable = true)
    protected String identyfikatorSIMC;
    @XmlElementRef(name = "IdentyfikatorPRNG", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identyfikatorPRNG;
    @XmlElement(name = "NazwaPelnaUlic", required = true, nillable = true)
    protected String nazwaPelnaUlic;
    @XmlElement(name = "RodzajObiektu", required = true, nillable = true)
    protected String rodzajObiektu;
    @XmlElement(name = "Nazwa1Ulic", required = true, nillable = true)
    protected String nazwa1Ulic;
    @XmlElement(name = "Nazwa2Ulic", required = true, nillable = true)
    protected String nazwa2Ulic;
    @XmlElementRef(name = "IdentyfikatorULIC", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identyfikatorULIC;
    @XmlElement(name = "NumerUchwaly", required = true, nillable = true)
    protected String numerUchwaly;
    @XmlElement(name = "DataUchwaly", required = true, nillable = true)
    protected String dataUchwaly;
    @XmlElementRef(name = "OpisUchwaly", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opisUchwaly;
    @XmlElementRef(name = "LinkDoDokumentu", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> linkDoDokumentu;
    @XmlElementRef(name = "GeometriaObiektu", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> geometriaObiektu;
    @XmlElementRef(name = "IIp", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> iIp;
    @XmlElementRef(name = "PoczatekWersjiObiektu", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> poczatekWersjiObiektu;
    @XmlElementRef(name = "KoniecWersjiObiektu", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> koniecWersjiObiektu;

    /**
     * Gets the value of the identyfikatorTERC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentyfikatorTERC() {
        return identyfikatorTERC;
    }

    /**
     * Sets the value of the identyfikatorTERC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentyfikatorTERC(String value) {
        this.identyfikatorTERC = value;
    }

    /**
     * Gets the value of the nazwaMiejscowosci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaMiejscowosci() {
        return nazwaMiejscowosci;
    }

    /**
     * Sets the value of the nazwaMiejscowosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaMiejscowosci(String value) {
        this.nazwaMiejscowosci = value;
    }

    /**
     * Gets the value of the rodzajMiejscowosci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodzajMiejscowosci() {
        return rodzajMiejscowosci;
    }

    /**
     * Sets the value of the rodzajMiejscowosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodzajMiejscowosci(String value) {
        this.rodzajMiejscowosci = value;
    }

    /**
     * Gets the value of the identyfikatorSIMC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentyfikatorSIMC() {
        return identyfikatorSIMC;
    }

    /**
     * Sets the value of the identyfikatorSIMC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentyfikatorSIMC(String value) {
        this.identyfikatorSIMC = value;
    }

    /**
     * Gets the value of the identyfikatorPRNG property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentyfikatorPRNG() {
        return identyfikatorPRNG;
    }

    /**
     * Sets the value of the identyfikatorPRNG property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentyfikatorPRNG(JAXBElement<String> value) {
        this.identyfikatorPRNG = value;
    }

    /**
     * Gets the value of the nazwaPelnaUlic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwaPelnaUlic() {
        return nazwaPelnaUlic;
    }

    /**
     * Sets the value of the nazwaPelnaUlic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwaPelnaUlic(String value) {
        this.nazwaPelnaUlic = value;
    }

    /**
     * Gets the value of the rodzajObiektu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodzajObiektu() {
        return rodzajObiektu;
    }

    /**
     * Sets the value of the rodzajObiektu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodzajObiektu(String value) {
        this.rodzajObiektu = value;
    }

    /**
     * Gets the value of the nazwa1Ulic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa1Ulic() {
        return nazwa1Ulic;
    }

    /**
     * Sets the value of the nazwa1Ulic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa1Ulic(String value) {
        this.nazwa1Ulic = value;
    }

    /**
     * Gets the value of the nazwa2Ulic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazwa2Ulic() {
        return nazwa2Ulic;
    }

    /**
     * Sets the value of the nazwa2Ulic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazwa2Ulic(String value) {
        this.nazwa2Ulic = value;
    }

    /**
     * Gets the value of the identyfikatorULIC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentyfikatorULIC() {
        return identyfikatorULIC;
    }

    /**
     * Sets the value of the identyfikatorULIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentyfikatorULIC(JAXBElement<String> value) {
        this.identyfikatorULIC = value;
    }

    /**
     * Gets the value of the numerUchwaly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumerUchwaly() {
        return numerUchwaly;
    }

    /**
     * Sets the value of the numerUchwaly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumerUchwaly(String value) {
        this.numerUchwaly = value;
    }

    /**
     * Gets the value of the dataUchwaly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataUchwaly() {
        return dataUchwaly;
    }

    /**
     * Sets the value of the dataUchwaly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataUchwaly(String value) {
        this.dataUchwaly = value;
    }

    /**
     * Gets the value of the opisUchwaly property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpisUchwaly() {
        return opisUchwaly;
    }

    /**
     * Sets the value of the opisUchwaly property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpisUchwaly(JAXBElement<String> value) {
        this.opisUchwaly = value;
    }

    /**
     * Gets the value of the linkDoDokumentu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLinkDoDokumentu() {
        return linkDoDokumentu;
    }

    /**
     * Sets the value of the linkDoDokumentu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLinkDoDokumentu(JAXBElement<String> value) {
        this.linkDoDokumentu = value;
    }

    /**
     * Gets the value of the geometriaObiektu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeometriaObiektu() {
        return geometriaObiektu;
    }

    /**
     * Sets the value of the geometriaObiektu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeometriaObiektu(JAXBElement<String> value) {
        this.geometriaObiektu = value;
    }

    /**
     * Gets the value of the iIp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIIp() {
        return iIp;
    }

    /**
     * Sets the value of the iIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIIp(JAXBElement<String> value) {
        this.iIp = value;
    }

    /**
     * Gets the value of the poczatekWersjiObiektu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPoczatekWersjiObiektu() {
        return poczatekWersjiObiektu;
    }

    /**
     * Sets the value of the poczatekWersjiObiektu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPoczatekWersjiObiektu(JAXBElement<String> value) {
        this.poczatekWersjiObiektu = value;
    }

    /**
     * Gets the value of the koniecWersjiObiektu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKoniecWersjiObiektu() {
        return koniecWersjiObiektu;
    }

    /**
     * Sets the value of the koniecWersjiObiektu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKoniecWersjiObiektu(JAXBElement<String> value) {
        this.koniecWersjiObiektu = value;
    }

}
