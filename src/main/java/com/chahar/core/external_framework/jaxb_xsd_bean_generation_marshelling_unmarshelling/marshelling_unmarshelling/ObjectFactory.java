//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.05.13 at 05:13:15 PM IST 
//


package com.chahar.core.external_framework.jaxb_xsd_bean_generation_marshelling_unmarshelling.marshelling_unmarshelling;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.chahar.core.jaxb.contact package. 
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

    private final static QName _FirstName_QNAME = new QName("", "FirstName");
    private final static QName _PhoneNumber_QNAME = new QName("", "PhoneNumber");
    private final static QName _LastName_QNAME = new QName("", "LastName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.chahar.core.jaxb.contact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public ContactsBean createContacts() {
        return new ContactsBean();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public ContactBean createContact() {
        return new ContactBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PhoneNumber")
    public JAXBElement<BigInteger> createPhoneNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_PhoneNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastName")
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

}
