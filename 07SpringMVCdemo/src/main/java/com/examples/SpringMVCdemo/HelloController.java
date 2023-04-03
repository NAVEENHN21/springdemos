package com.examples.SpringMVCdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examples.SpringMVCdemo.model.Employee;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelview = new ModelAndView();
		modelview.addObject("id", 12);
		modelview.addObject("name", "navi");
		modelview.addObject("salary", 223445);

		modelview.setViewName("hello");

		return modelview;

	}

	@RequestMapping("/readobject")
	public ModelAndView read2() {
		ModelAndView modelview = new ModelAndView();
		Employee emp = new Employee();
		emp.setId(1234);
		emp.setName("Mary");
		emp.setSalary(23454);
		modelview.addObject("employee", emp);

		modelview.setViewName("hello");

		return modelview;

	}

	@RequestMapping("/employees")
	public ModelAndView read3() {
		ModelAndView modelview = new ModelAndView();
		List<Employee> employees = new ArrayList<>();

		Employee emp = new Employee();
		emp.setId(1234);
		emp.setName("Mary");
		emp.setSalary(23454);
		employees.add(emp);

		emp = new Employee();
		emp.setId(1235);
		emp.setName("Sunny");
		emp.setSalary(50000);
		employees.add(emp);
		
		emp = new Employee();
		emp.setId(1235);
		emp.setName("Jackson");
		emp.setSalary(50000);
		employees.add(emp);
		
		modelview.addObject("employees",employees);
		
		modelview.setViewName("employees");

		return modelview;

	}
	
	@RequestMapping("/showdata")
	public ModelAndView showdata(@RequestParam("id") int id,@RequestParam("name") String name) {
		
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("id",id);
		mv.addObject("name",name);
		
		mv.setViewName("showdata");
		return mv;


		
	}
}
