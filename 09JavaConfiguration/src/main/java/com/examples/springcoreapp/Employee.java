package com.examples.springcoreapp;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Employee {

//	public Employee(int id, String name, List<String> departments, Map<Integer, String> products,
//			Properties countrieslanguages) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.departments = departments;
//		this.products = products;
//		this.countrieslanguages = countrieslanguages;
//	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departments=" + departments + ", products=" + products
				+ ", countrieslanguages=" + countrieslanguages + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDepartments() {
		return departments;
	}
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	public Properties getCountrieslanguages() {
		return countrieslanguages;
	}
	public void setCountrieslanguages(Properties countrieslanguages) {
		this.countrieslanguages = countrieslanguages;
	}
	int id;
	String name;
	List<String> departments;
	Map<Integer,String> products;
	Properties countrieslanguages;
}
