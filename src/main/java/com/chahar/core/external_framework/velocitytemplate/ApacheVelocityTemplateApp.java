package com.chahar.core.external_framework.velocitytemplate;

import java.io.StringWriter;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class ApacheVelocityTemplateApp {

	public static void main(String[] args) {
		Customer customer = getCustomer();

		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.init();
		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("customer", customer);

		Template template = velocityEngine.getTemplate("./src/main/resources/customer.vm");
		// Template template = velocityEngine.getTemplate("classpath:customer.vm");

		StringWriter response = new StringWriter();

		template.merge(velocityContext, response);

		System.out.println(response);
	}

	private static Customer getCustomer() {
		Customer customer = new Customer();
		customer.setCustomerNumber("ABC123");
		customer.setName("Joe JavaRanch");
		customer.setAddress("123 Rancho Javo");
		customer.setCity("Bueno Ranch");
		customer.setState("CO");
		customer.setZip("63121");
		customer.setPhone("303-555-1212");

		addInvoices(customer);

		return customer;
	}

	private static void addInvoices(Customer customer) {
		Invoice inv = null;
		Date[] datesOrder = { new GregorianCalendar(2004, 01, 21).getTime(),
				new GregorianCalendar(2003, 11, 18).getTime(), new GregorianCalendar(2003, 11, 01).getTime() };
		Date[] datesShip = { new GregorianCalendar(2004, 01, 28).getTime(),
				new GregorianCalendar(2003, 11, 20).getTime(), new GregorianCalendar(2003, 11, 15).getTime() };
		float[] invTotals = { 231.45f, 456.22f, 86.14f };
		float[] taxTotals = { 18.21f, 43.18f, 3.11f };
		float[] shipTotals = { 6.54f, 14.38f, 14.32f };
		for (int i = 0; i < datesOrder.length; i++) {
			inv = new Invoice();
			inv.setOrderDate(datesOrder[i]);
			inv.setShipDate(datesShip[i]);
			inv.setInvoiceTotal(invTotals[i]);
			inv.setTaxTotal(taxTotals[i]);
			inv.setShipTotal(shipTotals[i]);
			customer.addInvoice(inv);
		}
	}
}
