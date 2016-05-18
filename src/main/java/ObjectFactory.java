
package src.main.java;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the src.main.java package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Long_QNAME = new QName("http://ClearViewPortal.com/211SanDiego/", "long");
    private final static QName _AuthHeader_QNAME = new QName("http://ClearViewPortal.com/211SanDiego/", "AuthHeader");
    private final static QName _Boolean_QNAME = new QName("http://ClearViewPortal.com/211SanDiego/", "boolean");
    private final static QName _DateTime_QNAME = new QName("http://ClearViewPortal.com/211SanDiego/", "dateTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: src.main.java
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLastCustomTimeImportDateResponse }
     * 
     */
    public GetLastCustomTimeImportDateResponse createGetLastCustomTimeImportDateResponse() {
        return new GetLastCustomTimeImportDateResponse();
    }

    /**
     * Create an instance of {@link ImportCustomDataResponse }
     * 
     */
    public ImportCustomDataResponse createImportCustomDataResponse() {
        return new ImportCustomDataResponse();
    }

    /**
     * Create an instance of {@link ArrayOfErrorNotifications }
     * 
     */
    public ArrayOfErrorNotifications createArrayOfErrorNotifications() {
        return new ArrayOfErrorNotifications();
    }

    /**
     * Create an instance of {@link GetLastCustomDataImportDate }
     * 
     */
    public GetLastCustomDataImportDate createGetLastCustomDataImportDate() {
        return new GetLastCustomDataImportDate();
    }

    /**
     * Create an instance of {@link GetLastCustomTimeImportDate }
     * 
     */
    public GetLastCustomTimeImportDate createGetLastCustomTimeImportDate() {
        return new GetLastCustomTimeImportDate();
    }

    /**
     * Create an instance of {@link GetLastCustomDataImportDateResponse }
     * 
     */
    public GetLastCustomDataImportDateResponse createGetLastCustomDataImportDateResponse() {
        return new GetLastCustomDataImportDateResponse();
    }

    /**
     * Create an instance of {@link GetLastCustomTimeID }
     * 
     */
    public GetLastCustomTimeID createGetLastCustomTimeID() {
        return new GetLastCustomTimeID();
    }

    /**
     * Create an instance of {@link ImportCustomTimeResponse }
     * 
     */
    public ImportCustomTimeResponse createImportCustomTimeResponse() {
        return new ImportCustomTimeResponse();
    }

    /**
     * Create an instance of {@link GetLastCustomDataIDResponse }
     * 
     */
    public GetLastCustomDataIDResponse createGetLastCustomDataIDResponse() {
        return new GetLastCustomDataIDResponse();
    }

    /**
     * Create an instance of {@link GetLastCustomDataID }
     * 
     */
    public GetLastCustomDataID createGetLastCustomDataID() {
        return new GetLastCustomDataID();
    }

    /**
     * Create an instance of {@link ImportCustomData }
     * 
     */
    public ImportCustomData createImportCustomData() {
        return new ImportCustomData();
    }

    /**
     * Create an instance of {@link ArrayOfCustomData }
     * 
     */
    public ArrayOfCustomData createArrayOfCustomData() {
        return new ArrayOfCustomData();
    }

    /**
     * Create an instance of {@link GetLastCustomTimeIDResponse }
     * 
     */
    public GetLastCustomTimeIDResponse createGetLastCustomTimeIDResponse() {
        return new GetLastCustomTimeIDResponse();
    }

    /**
     * Create an instance of {@link TestConnectionResponse }
     * 
     */
    public TestConnectionResponse createTestConnectionResponse() {
        return new TestConnectionResponse();
    }

    /**
     * Create an instance of {@link AuthHeader }
     * 
     */
    public AuthHeader createAuthHeader() {
        return new AuthHeader();
    }

    /**
     * Create an instance of {@link ImportCustomTime }
     * 
     */
    public ImportCustomTime createImportCustomTime() {
        return new ImportCustomTime();
    }

    /**
     * Create an instance of {@link ArrayOfCustomTime }
     * 
     */
    public ArrayOfCustomTime createArrayOfCustomTime() {
        return new ArrayOfCustomTime();
    }

    /**
     * Create an instance of {@link TestConnection }
     * 
     */
    public TestConnection createTestConnection() {
        return new TestConnection();
    }

    /**
     * Create an instance of {@link CustomTime }
     * 
     */
    public CustomTime createCustomTime() {
        return new CustomTime();
    }

    /**
     * Create an instance of {@link ErrorNotifications }
     * 
     */
    public ErrorNotifications createErrorNotifications() {
        return new ErrorNotifications();
    }

    /**
     * Create an instance of {@link CustomData }
     * 
     */
    public CustomData createCustomData() {
        return new CustomData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ClearViewPortal.com/211SanDiego/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ClearViewPortal.com/211SanDiego/", name = "AuthHeader")
    public JAXBElement<AuthHeader> createAuthHeader(AuthHeader value) {
        return new JAXBElement<AuthHeader>(_AuthHeader_QNAME, AuthHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ClearViewPortal.com/211SanDiego/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ClearViewPortal.com/211SanDiego/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

}
