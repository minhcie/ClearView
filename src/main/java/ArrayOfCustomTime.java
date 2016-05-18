
package src.main.java;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCustomTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCustomTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomTime" type="{http://ClearViewPortal.com/211SanDiego/}CustomTime" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCustomTime", propOrder = {
    "customTime"
})
public class ArrayOfCustomTime {

    @XmlElement(name = "CustomTime", nillable = true)
    protected List<CustomTime> customTime;

    /**
     * Gets the value of the customTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomTime }
     * 
     * 
     */
    public List<CustomTime> getCustomTime() {
        if (customTime == null) {
            customTime = new ArrayList<CustomTime>();
        }
        return this.customTime;
    }

}
