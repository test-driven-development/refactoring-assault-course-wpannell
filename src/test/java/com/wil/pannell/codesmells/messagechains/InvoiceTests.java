package com.wil.pannell.codesmells.messagechains;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InvoiceTests {
	@Test
	public void shippingShouldBeAddedIfAddressIsNotInEurope() throws Exception {
		Address address = new Address(new Country(false));
		Customer customer = new Customer(address);

		Invoice invoice = new Invoice(customer);
		invoice.addItem(new InvoiceItem("Product X", 1, 100));

		assertEquals(100 + Invoice.SHIPPING_COST_OUTSIDE_EU, invoice .getTotalPrice(), 0);
	}
}
