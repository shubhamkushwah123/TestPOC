package com.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	String city;
	String pincode;
	String state;
	
	public Address(String city, String pincode, String state)
	{
		this.city=city;
		this.pincode = pincode;
		this.state = state;
	}
	
	public Address()
	{
		
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	

}
