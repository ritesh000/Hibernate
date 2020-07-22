package com.hibernate.Embedtable;

import javax.persistence.Embeddable;

@Embeddable
public class address {

	private String city;
	private String street;
    private String home_number;
	public address(String city, String street, String home_number) {
		super();
		this.city = city;
		this.street = street;
		this.home_number = home_number;
	}
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHome_number() {
		return home_number;
	}
	public void setHome_number(String home_number) {
		this.home_number = home_number;
	}
	@Override
	public String toString() {
		return "address [city=" + city + ", street=" + street + ", home_number=" + home_number + "]";
	}
    
}
