
package src.main.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACDName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RelatedCallID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EmpGroup1ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EmpGroup2ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EmpGroup3ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EmpGroup4ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EmpGroup5ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RecGroup1ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RecGroup2ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RecGroup3ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RecGroup4ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RecGroup5ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeClass2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TimeClass3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTime", propOrder = {
    "acdName",
    "startDate",
    "endDate",
    "sessionID",
    "relatedCallID",
    "empGroup1ID",
    "empGroup2ID",
    "empGroup3ID",
    "empGroup4ID",
    "empGroup5ID",
    "recGroup1ID",
    "recGroup2ID",
    "recGroup3ID",
    "recGroup4ID",
    "recGroup5ID",
    "timeType",
    "timeCategory",
    "timeClass",
    "timeClass2",
    "timeClass3"
})
public class CustomTime {

    @XmlElement(name = "ACDName")
    protected String acdName;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "SessionID")
    protected long sessionID;
    @XmlElement(name = "RelatedCallID")
    protected long relatedCallID;
    @XmlElement(name = "EmpGroup1ID")
    protected int empGroup1ID;
    @XmlElement(name = "EmpGroup2ID")
    protected int empGroup2ID;
    @XmlElement(name = "EmpGroup3ID")
    protected int empGroup3ID;
    @XmlElement(name = "EmpGroup4ID")
    protected int empGroup4ID;
    @XmlElement(name = "EmpGroup5ID")
    protected int empGroup5ID;
    @XmlElement(name = "RecGroup1ID")
    protected int recGroup1ID;
    @XmlElement(name = "RecGroup2ID")
    protected int recGroup2ID;
    @XmlElement(name = "RecGroup3ID")
    protected int recGroup3ID;
    @XmlElement(name = "RecGroup4ID")
    protected int recGroup4ID;
    @XmlElement(name = "RecGroup5ID")
    protected int recGroup5ID;
    @XmlElement(name = "TimeType")
    protected String timeType;
    @XmlElement(name = "TimeCategory")
    protected String timeCategory;
    @XmlElement(name = "TimeClass")
    protected String timeClass;
    @XmlElement(name = "TimeClass2")
    protected String timeClass2;
    @XmlElement(name = "TimeClass3")
    protected String timeClass3;

    /**
     * Gets the value of the acdName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACDName() {
        return acdName;
    }

    /**
     * Sets the value of the acdName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACDName(String value) {
        this.acdName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the sessionID property.
     * 
     */
    public long getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     */
    public void setSessionID(long value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the relatedCallID property.
     * 
     */
    public long getRelatedCallID() {
        return relatedCallID;
    }

    /**
     * Sets the value of the relatedCallID property.
     * 
     */
    public void setRelatedCallID(long value) {
        this.relatedCallID = value;
    }

    /**
     * Gets the value of the empGroup1ID property.
     * 
     */
    public int getEmpGroup1ID() {
        return empGroup1ID;
    }

    /**
     * Sets the value of the empGroup1ID property.
     * 
     */
    public void setEmpGroup1ID(int value) {
        this.empGroup1ID = value;
    }

    /**
     * Gets the value of the empGroup2ID property.
     * 
     */
    public int getEmpGroup2ID() {
        return empGroup2ID;
    }

    /**
     * Sets the value of the empGroup2ID property.
     * 
     */
    public void setEmpGroup2ID(int value) {
        this.empGroup2ID = value;
    }

    /**
     * Gets the value of the empGroup3ID property.
     * 
     */
    public int getEmpGroup3ID() {
        return empGroup3ID;
    }

    /**
     * Sets the value of the empGroup3ID property.
     * 
     */
    public void setEmpGroup3ID(int value) {
        this.empGroup3ID = value;
    }

    /**
     * Gets the value of the empGroup4ID property.
     * 
     */
    public int getEmpGroup4ID() {
        return empGroup4ID;
    }

    /**
     * Sets the value of the empGroup4ID property.
     * 
     */
    public void setEmpGroup4ID(int value) {
        this.empGroup4ID = value;
    }

    /**
     * Gets the value of the empGroup5ID property.
     * 
     */
    public int getEmpGroup5ID() {
        return empGroup5ID;
    }

    /**
     * Sets the value of the empGroup5ID property.
     * 
     */
    public void setEmpGroup5ID(int value) {
        this.empGroup5ID = value;
    }

    /**
     * Gets the value of the recGroup1ID property.
     * 
     */
    public int getRecGroup1ID() {
        return recGroup1ID;
    }

    /**
     * Sets the value of the recGroup1ID property.
     * 
     */
    public void setRecGroup1ID(int value) {
        this.recGroup1ID = value;
    }

    /**
     * Gets the value of the recGroup2ID property.
     * 
     */
    public int getRecGroup2ID() {
        return recGroup2ID;
    }

    /**
     * Sets the value of the recGroup2ID property.
     * 
     */
    public void setRecGroup2ID(int value) {
        this.recGroup2ID = value;
    }

    /**
     * Gets the value of the recGroup3ID property.
     * 
     */
    public int getRecGroup3ID() {
        return recGroup3ID;
    }

    /**
     * Sets the value of the recGroup3ID property.
     * 
     */
    public void setRecGroup3ID(int value) {
        this.recGroup3ID = value;
    }

    /**
     * Gets the value of the recGroup4ID property.
     * 
     */
    public int getRecGroup4ID() {
        return recGroup4ID;
    }

    /**
     * Sets the value of the recGroup4ID property.
     * 
     */
    public void setRecGroup4ID(int value) {
        this.recGroup4ID = value;
    }

    /**
     * Gets the value of the recGroup5ID property.
     * 
     */
    public int getRecGroup5ID() {
        return recGroup5ID;
    }

    /**
     * Sets the value of the recGroup5ID property.
     * 
     */
    public void setRecGroup5ID(int value) {
        this.recGroup5ID = value;
    }

    /**
     * Gets the value of the timeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeType() {
        return timeType;
    }

    /**
     * Sets the value of the timeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeType(String value) {
        this.timeType = value;
    }

    /**
     * Gets the value of the timeCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeCategory() {
        return timeCategory;
    }

    /**
     * Sets the value of the timeCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeCategory(String value) {
        this.timeCategory = value;
    }

    /**
     * Gets the value of the timeClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeClass() {
        return timeClass;
    }

    /**
     * Sets the value of the timeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeClass(String value) {
        this.timeClass = value;
    }

    /**
     * Gets the value of the timeClass2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeClass2() {
        return timeClass2;
    }

    /**
     * Sets the value of the timeClass2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeClass2(String value) {
        this.timeClass2 = value;
    }

    /**
     * Gets the value of the timeClass3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeClass3() {
        return timeClass3;
    }

    /**
     * Sets the value of the timeClass3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeClass3(String value) {
        this.timeClass3 = value;
    }

}
