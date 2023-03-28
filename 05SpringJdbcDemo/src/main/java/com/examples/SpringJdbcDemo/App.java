package com.examples.SpringJdbcDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.SpringJdbcDemo.dao.EmployeeDAO;
import com.examples.SpringJdbcDemo.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\SpringJdbcDemo\\springconfig.xml");
    	EmployeeDAO employeedao=(EmployeeDAO) ctx.getBean("employeedao");
    	
//    	create();
//    	update();
//    	delete();
   	
    	readoneEmployee();
    	
//    	readAllEmployees();
    	
    	
 

    	
    	
    }

	private static void readAllEmployees() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\SpringJdbcDemo\\springconfig.xml");
    	EmployeeDAO employeedao=(EmployeeDAO) ctx.getBean("employeedao");
    	
    	List<Employee> employees=employeedao.read();
    	System.out.println(employees);

	}

	private static void readoneEmployee() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\SpringJdbcDemo\\springconfig.xml");
    	EmployeeDAO employeedao=(EmployeeDAO) ctx.getBean("employeedao");
    	
    	Employee employee=employeedao.read(1);
    	System.out.println(employee);
	}

	private static void delete() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\SpringJdbcDemo\\springconfig.xml");
    	EmployeeDAO employeedao=(EmployeeDAO) ctx.getBean("employeedao");
    	Employee emp=new Employee();
    	employeedao.delete(2);
	}

	private static void update() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\SpringJdbcDemo\\springconfig.xml");
    	EmployeeDAO employeedao=(EmployeeDAO) ctx.getBean("employeedao");
	   	Employee emp=new Employee();	
	   	emp.setFirstname("vishu");
    	emp.setLastname("S");
    	emp.setId(1);
    	employeedao.update(emp);
	}

	private static void create() {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com\\examples\\SpringJdbcDemo\\springconfig.xml");
    	EmployeeDAO employeedao=(EmployeeDAO) ctx.getBean("employeedao");
		Employee emp=new Employee();
    	emp.setId(2);
    	emp.setFirstname("pavana");
    	emp.setLastname("K L");
    	employeedao.create(emp);
	}
}
