
package com.example.demo.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZweryfikowanyAdres complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZweryfikowanyAdres"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HistorycznyRodzajMiejscowosci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NazwaCechy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NazwaGmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NazwaMiejscowosci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NazwaPow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NazwaUlicyWPelnymBrzmieniu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NazwaWoj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nazwa_1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nazwa_2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RodzajGmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RodzajMiejscowosci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SymUl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SymbolGmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SymbolMiejscowosci" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SymbolPow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SymbolRodzajuGmi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SymbolWoj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZweryfikowanyAdres", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", propOrder = {
    "historycznyRodzajMiejscowosci",
    "nazwaCechy",
    "nazwaGmi",
    "nazwaMiejscowosci",
    "nazwaPow",
    "nazwaUlicyWPelnymBrzmieniu",
    "nazwaWoj",
    "nazwa1",
    "nazwa2",
    "rodzajGmi",
    "rodzajMiejscowosci",
    "symUl",
    "symbolGmi",
    "symbolMiejscowosci",
    "symbolPow",
    "symbolRodzajuGmi",
    "symbolWoj"
})
public class ZweryfikowanyAdres {

    @XmlElementRef(name = "HistorycznyRodzajMiejscowosci", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> historycznyRodzajMiejscowosci;
    @XmlElementRef(name = "NazwaCechy", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwaCechy;
    @XmlElementRef(name = "NazwaGmi", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwaGmi;
    @XmlElementRef(name = "NazwaMiejscowosci", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwaMiejscowosci;
    @XmlElementRef(name = "NazwaPow", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwaPow;
    @XmlElementRef(name = "NazwaUlicyWPelnymBrzmieniu", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwaUlicyWPelnymBrzmieniu;
    @XmlElementRef(name = "NazwaWoj", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwaWoj;
    @XmlElementRef(name = "Nazwa_1", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwa1;
    @XmlElementRef(name = "Nazwa_2", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nazwa2;
    @XmlElementRef(name = "RodzajGmi", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rodzajGmi;
    @XmlElementRef(name = "RodzajMiejscowosci", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rodzajMiejscowosci;
    @XmlElementRef(name = "SymUl", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> symUl;
    @XmlElementRef(name = "SymbolGmi", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> symbolGmi;
    @XmlElementRef(name = "SymbolMiejscowosci", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> symbolMiejscowosci;
    @XmlElementRef(name = "SymbolPow", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> symbolPow;
    @XmlElementRef(name = "SymbolRodzajuGmi", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> symbolRodzajuGmi;
    @XmlElementRef(name = "SymbolWoj", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> symbolWoj;

    /**
     * Gets the value of the historycznyRodzajMiejscowosci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHistorycznyRodzajMiejscowosci() {
        return historycznyRodzajMiejscowosci;
    }

    /**
     * Sets the value of the historycznyRodzajMiejscowosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHistorycznyRodzajMiejscowosci(JAXBElement<String> value) {
        this.historycznyRodzajMiejscowosci = value;
    }

    /**
     * Gets the value of the nazwaCechy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwaCechy() {
        return nazwaCechy;
    }

    /**
     * Sets the value of the nazwaCechy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwaCechy(JAXBElement<String> value) {
        this.nazwaCechy = value;
    }

    /**
     * Gets the value of the nazwaGmi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwaGmi() {
        return nazwaGmi;
    }

    /**
     * Sets the value of the nazwaGmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwaGmi(JAXBElement<String> value) {
        this.nazwaGmi = value;
    }

    /**
     * Gets the value of the nazwaMiejscowosci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwaMiejscowosci() {
        return nazwaMiejscowosci;
    }

    /**
     * Sets the value of the nazwaMiejscowosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwaMiejscowosci(JAXBElement<String> value) {
        this.nazwaMiejscowosci = value;
    }

    /**
     * Gets the value of the nazwaPow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwaPow() {
        return nazwaPow;
    }

    /**
     * Sets the value of the nazwaPow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwaPow(JAXBElement<String> value) {
        this.nazwaPow = value;
    }

    /**
     * Gets the value of the nazwaUlicyWPelnymBrzmieniu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwaUlicyWPelnymBrzmieniu() {
        return nazwaUlicyWPelnymBrzmieniu;
    }

    /**
     * Sets the value of the nazwaUlicyWPelnymBrzmieniu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwaUlicyWPelnymBrzmieniu(JAXBElement<String> value) {
        this.nazwaUlicyWPelnymBrzmieniu = value;
    }

    /**
     * Gets the value of the nazwaWoj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwaWoj() {
        return nazwaWoj;
    }

    /**
     * Sets the value of the nazwaWoj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwaWoj(JAXBElement<String> value) {
        this.nazwaWoj = value;
    }

    /**
     * Gets the value of the nazwa1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwa1() {
        return nazwa1;
    }

    /**
     * Sets the value of the nazwa1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwa1(JAXBElement<String> value) {
        this.nazwa1 = value;
    }

    /**
     * Gets the value of the nazwa2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNazwa2() {
        return nazwa2;
    }

    /**
     * Sets the value of the nazwa2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNazwa2(JAXBElement<String> value) {
        this.nazwa2 = value;
    }

    /**
     * Gets the value of the rodzajGmi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRodzajGmi() {
        return rodzajGmi;
    }

    /**
     * Sets the value of the rodzajGmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRodzajGmi(JAXBElement<String> value) {
        this.rodzajGmi = value;
    }

    /**
     * Gets the value of the rodzajMiejscowosci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRodzajMiejscowosci() {
        return rodzajMiejscowosci;
    }

    /**
     * Sets the value of the rodzajMiejscowosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRodzajMiejscowosci(JAXBElement<String> value) {
        this.rodzajMiejscowosci = value;
    }

    /**
     * Gets the value of the symUl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSymUl() {
        return symUl;
    }

    /**
     * Sets the value of the symUl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSymUl(JAXBElement<String> value) {
        this.symUl = value;
    }

    /**
     * Gets the value of the symbolGmi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSymbolGmi() {
        return symbolGmi;
    }

    /**
     * Sets the value of the symbolGmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSymbolGmi(JAXBElement<String> value) {
        this.symbolGmi = value;
    }

    /**
     * Gets the value of the symbolMiejscowosci property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSymbolMiejscowosci() {
        return symbolMiejscowosci;
    }

    /**
     * Sets the value of the symbolMiejscowosci property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSymbolMiejscowosci(JAXBElement<String> value) {
        this.symbolMiejscowosci = value;
    }

    /**
     * Gets the value of the symbolPow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSymbolPow() {
        return symbolPow;
    }

    /**
     * Sets the value of the symbolPow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSymbolPow(JAXBElement<String> value) {
        this.symbolPow = value;
    }

    /**
     * Gets the value of the symbolRodzajuGmi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSymbolRodzajuGmi() {
        return symbolRodzajuGmi;
    }

    /**
     * Sets the value of the symbolRodzajuGmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSymbolRodzajuGmi(JAXBElement<String> value) {
        this.symbolRodzajuGmi = value;
    }

    /**
     * Gets the value of the symbolWoj property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSymbolWoj() {
        return symbolWoj;
    }

    /**
     * Sets the value of the symbolWoj property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSymbolWoj(JAXBElement<String> value) {
        this.symbolWoj = value;
    }

}
