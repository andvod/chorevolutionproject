
package eu.chorevolution.prosumer.localhealthcarecompany;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmBusinessStartupResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmBusinessStartupResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="farmCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmBusinessStartupResponse", propOrder = {
    "farmCode"
})
public class FarmBusinessStartupResponse {

    @XmlElement(required = true)
    protected String farmCode;

    /**
     * Gets the value of the farmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFarmCode() {
        return farmCode;
    }

    /**
     * Sets the value of the farmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFarmCode(String value) {
        this.farmCode = value;
    }

}
