
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
 *         &lt;element name="GetLastCustomDataImportDateResult" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "getLastCustomDataImportDateResult"
})
@XmlRootElement(name = "GetLastCustomDataImportDateResponse")
public class GetLastCustomDataImportDateResponse {

    @XmlElement(name = "GetLastCustomDataImportDateResult", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar getLastCustomDataImportDateResult;

    /**
     * Gets the value of the getLastCustomDataImportDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGetLastCustomDataImportDateResult() {
        return getLastCustomDataImportDateResult;
    }

    /**
     * Sets the value of the getLastCustomDataImportDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGetLastCustomDataImportDateResult(XMLGregorianCalendar value) {
        this.getLastCustomDataImportDateResult = value;
    }

}
