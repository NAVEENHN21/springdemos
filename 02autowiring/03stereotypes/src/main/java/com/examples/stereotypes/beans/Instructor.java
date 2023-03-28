package com.examples.stereotypes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Instructor {

	@Value("10")
	int id;
	
	@Value("Anu")
	String name;
	
	@Autowired
	Address address;
	
	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
