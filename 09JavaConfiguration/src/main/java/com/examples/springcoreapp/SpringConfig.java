package com.examples.springcoreapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	@Bean
	public Employee em1() {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("John");
		return emp;
	}
	
	@Bean
	public Employee em2() {
		Employee emp=new Employee();
		emp.setId(2);
		emp.setName("Max");
		return emp;
	}
	
	@Bean
	public Employee em3() {
		Employee emp=new Employee();
		emp.setId(3);
		emp.setName("Raju");
		return emp;
	}
	
	@Bean
	public Employee emp4() {
		Employee emp=new Employee();
		emp.setId(4);
		emp.setName("Suraj");
		List<String> departments=new ArrayList<>();
		departments.add("HR");
		departments.add("Admin");
		departments.add("Developer");
		return emp;
	}

}
