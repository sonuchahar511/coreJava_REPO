package com.chahar.core.external_framework.jaxb_xsd_bean_generation_marshelling_unmarshelling.marshelling_unmarshelling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class UnmarshallerApp {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		InputStream inputStream = new FileInputStream("./src/main/resources/generatedOutput/marshall/contacts.xml");

		// Create an instance of JAXB Context
		JAXBContext jContext = JAXBContext.newInstance("com.chahar.core.jaxb.marshelling");

		// Unmarshal the data from InputStream
		ContactsBean result = (ContactsBean) jContext.createUnmarshaller().unmarshal(inputStream);

		List<ContactBean> contacts = result.getContact();
		// Lets see the results.
		for (ContactBean c : contacts) {
			System.out.println(c.getId() + " " + c.getFirstName() + " " + c.getLastName() + " " + c.getPhoneNumber());
		}

	}

}
