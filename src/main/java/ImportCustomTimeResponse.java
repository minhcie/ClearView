
package src.main.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImportCustomTimeResult" type="{http://ClearViewPortal.com/211SanDiego/}ArrayOfErrorNotifications" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importCustomTimeResult"
})
@XmlRootElement(name = "ImportCustomTimeResponse")
public class ImportCustomTimeResponse {

    @XmlElement(name = "ImportCustomTimeResult")
    protected ArrayOfErrorNotifications importCustomTimeResult;

    /**
     * Gets the value of the importCustomTimeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorNotifications }
     *     
     */
    public ArrayOfErrorNotifications getImportCustomTimeResult() {
        return importCustomTimeResult;
    }

    /**
     * Sets the value of the importCustomTimeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorNotifications }
     *     
     */
    public void setImportCustomTimeResult(ArrayOfErrorNotifications value) {
        this.importCustomTimeResult = value;
    }

}
