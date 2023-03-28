package com.examples.stereotypes.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}

	@Value("Chennai")
	String city;
	
	@Value("TN")
	String state;
	
	@Value("698088")
	String pincode;
	
}
