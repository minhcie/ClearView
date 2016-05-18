
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
 *         &lt;element name="GetLastCustomTimeIDResult" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "getLastCustomTimeIDResult"
})
@XmlRootElement(name = "GetLastCustomTimeIDResponse")
public class GetLastCustomTimeIDResponse {

    @XmlElement(name = "GetLastCustomTimeIDResult")
    protected long getLastCustomTimeIDResult;

    /**
     * Gets the value of the getLastCustomTimeIDResult property.
     * 
     */
    public long getGetLastCustomTimeIDResult() {
        return getLastCustomTimeIDResult;
    }

    /**
     * Sets the value of the getLastCustomTimeIDResult property.
     * 
     */
    public void setGetLastCustomTimeIDResult(long value) {
        this.getLastCustomTimeIDResult = value;
    }

}
