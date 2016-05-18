
package src.main.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorNotifications complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorNotifications">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FailureReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorNotifications", propOrder = {
    "dataID",
    "failureReason"
})
public class ErrorNotifications {

    @XmlElement(name = "DataID")
    protected long dataID;
    @XmlElement(name = "FailureReason")
    protected String failureReason;

    /**
     * Gets the value of the dataID property.
     * 
     */
    public long getDataID() {
        return dataID;
    }

    /**
     * Sets the value of the dataID property.
     * 
     */
    public void setDataID(long value) {
        this.dataID = value;
    }

    /**
     * Gets the value of the failureReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureReason() {
        return failureReason;
    }

    /**
     * Sets the value of the failureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureReason(String value) {
        this.failureReason = value;
    }

}
