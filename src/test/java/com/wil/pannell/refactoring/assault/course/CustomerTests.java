package com.wil.pannell.refactoring.assault.course;

import static org.junit.Assert.*;

import com.wil.pannell.refactoring.assault.course.Address;
import com.wil.pannell.refactoring.assault.course.Customer;
import org.junit.Test;

public class CustomerTests {
	
	@Test
	public void customerSummaryIncludesFullNameAndAddress() {
		Address address = new Address("15", "High Street", "London", "WC1 2XX");
		Customer customer = new Customer("Mr T Bidley", address, "1971-01-01");
		assertEquals("Mr T Bidley, 15 High Street, London, WC1 2XX", customer .getSummary());
	}

}
