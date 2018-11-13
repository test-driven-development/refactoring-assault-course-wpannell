package com.wil.pannell.codesmells.messagechains.bonus;

public class Address {
	
	private Country country;

	public Address(Country country) {
		this.country = country;
	}

	public Country getCountry() {
		return country;
	}

}
