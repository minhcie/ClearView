
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
 *         &lt;element name="ImportCustomDataResult" type="{http://ClearViewPortal.com/211SanDiego/}ArrayOfErrorNotifications" minOccurs="0"/>
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
    "importCustomDataResult"
})
@XmlRootElement(name = "ImportCustomDataResponse")
public class ImportCustomDataResponse {

    @XmlElement(name = "ImportCustomDataResult")
    protected ArrayOfErrorNotifications importCustomDataResult;

    /**
     * Gets the value of the importCustomDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfErrorNotifications }
     *     
     */
    public ArrayOfErrorNotifications getImportCustomDataResult() {
        return importCustomDataResult;
    }

    /**
     * Sets the value of the importCustomDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfErrorNotifications }
     *     
     */
    public void setImportCustomDataResult(ArrayOfErrorNotifications value) {
        this.importCustomDataResult = value;
    }

}
