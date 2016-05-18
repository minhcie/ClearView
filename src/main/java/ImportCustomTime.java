
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
 *         &lt;element name="CustomTimeCollection" type="{http://ClearViewPortal.com/211SanDiego/}ArrayOfCustomTime" minOccurs="0"/>
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
    "customTimeCollection"
})
@XmlRootElement(name = "ImportCustomTime")
public class ImportCustomTime {

    @XmlElement(name = "CustomTimeCollection")
    protected ArrayOfCustomTime customTimeCollection;

    /**
     * Gets the value of the customTimeCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomTime }
     *     
     */
    public ArrayOfCustomTime getCustomTimeCollection() {
        return customTimeCollection;
    }

    /**
     * Sets the value of the customTimeCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomTime }
     *     
     */
    public void setCustomTimeCollection(ArrayOfCustomTime value) {
        this.customTimeCollection = value;
    }

}
