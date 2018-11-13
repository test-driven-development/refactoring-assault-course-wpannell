package com.wil.pannell.codesmells.messagechains.bonus;

public class Customer {
	
	private Address address;

	public Customer(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

}
