package com.chahar.core.external_framework.jaxb_xsd_bean_generation_marshelling_unmarshelling.marshelling_unmarshelling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MarshallerApp {

	public static void main(String[] args) throws JAXBException, FileNotFoundException, UnsupportedEncodingException {
		PrintWriter out = new PrintWriter("./src/main/resources/generatedOutput/marshall/contacts.xml", "UTF-8");

		JAXBContext jaxbContext = JAXBContext.newInstance("com.chahar.core.jaxb.marshelling");
		
		//Note: ContactBean,ContactsBean,ObjectBean will generated from wsdl by xjc tool.
		//for Bravity , these beans are copied into this package.
		//Always use factory methods to initialise XML classes
		ObjectFactory factory = new ObjectFactory();
		ContactsBean contacts = factory.createContacts();
		
		//ContactsBean contacts = new ContactsBean();
		createTestData(contacts);

		// Now Create JAXB XML Marshallar
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		// Write the XML File
		marshaller.marshal(contacts, out);
		out.close();
	}

	private static void createTestData(ContactsBean contacts) {
		// Now create some sample contacts
		ContactBean c = new ContactBean();
		c.setId(new BigInteger("101"));
		c.setFirstName("yash1");
		c.setLastName("chahar1");
		c.setPhoneNumber(new BigInteger("1234567890"));

		contacts.getContact().add(c);

		c = new ContactBean();
		c.setId(new BigInteger("201"));
		c.setFirstName("yash2");
		c.setLastName("chahar2");
		c.setPhoneNumber(new BigInteger("1234512345"));

		contacts.getContact().add(c);

	}

}
