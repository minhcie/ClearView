
package src.main.java;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfErrorNotifications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfErrorNotifications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorNotifications" type="{http://ClearViewPortal.com/211SanDiego/}ErrorNotifications" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfErrorNotifications", propOrder = {
    "errorNotifications"
})
public class ArrayOfErrorNotifications {

    @XmlElement(name = "ErrorNotifications", nillable = true)
    protected List<ErrorNotifications> errorNotifications;

    /**
     * Gets the value of the errorNotifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorNotifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorNotifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorNotifications }
     * 
     * 
     */
    public List<ErrorNotifications> getErrorNotifications() {
        if (errorNotifications == null) {
            errorNotifications = new ArrayList<ErrorNotifications>();
        }
        return this.errorNotifications;
    }

}
