package com.chahar.core.external_framework.velocitytemplate;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	String customerNumber;
	String name;
	String address;
	String city;
	String state;
	String zip;
	String phone;

	private List<Invoice> invoices = new ArrayList<Invoice>();

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String s) {
		customerNumber = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String s) {
		address = s;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String s) {
		city = s;
	}

	public String getState() {
		return state;
	}

	public void setState(String s) {
		state = s;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String s) {
		zip = s;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String s) {
		phone = s;
	}

	public void addInvoice(Invoice invoice) {
		invoices.add(invoice);
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}
}
