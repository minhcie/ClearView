
package src.main.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="GetLastCustomTimeImportDateResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "getLastCustomTimeImportDateResult"
})
@XmlRootElement(name = "GetLastCustomTimeImportDateResponse")
public class GetLastCustomTimeImportDateResponse {

    @XmlElement(name = "GetLastCustomTimeImportDateResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getLastCustomTimeImportDateResult;

    /**
     * Gets the value of the getLastCustomTimeImportDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGetLastCustomTimeImportDateResult() {
        return getLastCustomTimeImportDateResult;
    }

    /**
     * Sets the value of the getLastCustomTimeImportDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGetLastCustomTimeImportDateResult(XMLGregorianCalendar value) {
        this.getLastCustomTimeImportDateResult = value;
    }

}
