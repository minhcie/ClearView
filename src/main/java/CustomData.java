
package src.main.java;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ACDName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DataID" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
 *         &lt;element name="DataType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataClass2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataClass3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomData", propOrder = {
    "acdName",
    "callDate",
    "dataID",
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
    "dataType",
    "dataCategory",
    "dataClass",
    "dataClass2",
    "dataClass3",
    "dataValue"
})
public class CustomData {

    @XmlElement(name = "ACDName")
    protected String acdName;
    @XmlElement(name = "CallDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar callDate;
    @XmlElement(name = "DataID")
    protected long dataID;
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
    @XmlElement(name = "DataType")
    protected String dataType;
    @XmlElement(name = "DataCategory")
    protected String dataCategory;
    @XmlElement(name = "DataClass")
    protected String dataClass;
    @XmlElement(name = "DataClass2")
    protected String dataClass2;
    @XmlElement(name = "DataClass3")
    protected String dataClass3;
    @XmlElement(name = "DataValue")
    protected float dataValue;

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
     * Gets the value of the callDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallDate() {
        return callDate;
    }

    /**
     * Sets the value of the callDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallDate(XMLGregorianCalendar value) {
        this.callDate = value;
    }

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
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the dataCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataCategory() {
        return dataCategory;
    }

    /**
     * Sets the value of the dataCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCategory(String value) {
        this.dataCategory = value;
    }

    /**
     * Gets the value of the dataClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataClass() {
        return dataClass;
    }

    /**
     * Sets the value of the dataClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataClass(String value) {
        this.dataClass = value;
    }

    /**
     * Gets the value of the dataClass2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataClass2() {
        return dataClass2;
    }

    /**
     * Sets the value of the dataClass2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataClass2(String value) {
        this.dataClass2 = value;
    }

    /**
     * Gets the value of the dataClass3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataClass3() {
        return dataClass3;
    }

    /**
     * Sets the value of the dataClass3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataClass3(String value) {
        this.dataClass3 = value;
    }

    /**
     * Gets the value of the dataValue property.
     * 
     */
    public float getDataValue() {
        return dataValue;
    }

    /**
     * Sets the value of the dataValue property.
     * 
     */
    public void setDataValue(float value) {
        this.dataValue = value;
    }

}
