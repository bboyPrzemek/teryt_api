
package com.example.demo.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfRZmianyTerc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRZmianyTerc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RZmianyTerc" type="{http://schemas.datacontract.org/2004/07/TerytUslugaWs1}RZmianyTerc" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRZmianyTerc", namespace = "http://schemas.datacontract.org/2004/07/TerytUslugaWs1", propOrder = {
    "rZmianyTerc"
})
public class ArrayOfRZmianyTerc {

    @XmlElement(name = "RZmianyTerc", nillable = true)
    protected List<RZmianyTerc> rZmianyTerc;

    /**
     * Gets the value of the rZmianyTerc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rZmianyTerc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRZmianyTerc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RZmianyTerc }
     * 
     * 
     */
    public List<RZmianyTerc> getRZmianyTerc() {
        if (rZmianyTerc == null) {
            rZmianyTerc = new ArrayList<RZmianyTerc>();
        }
        return this.rZmianyTerc;
    }

}
