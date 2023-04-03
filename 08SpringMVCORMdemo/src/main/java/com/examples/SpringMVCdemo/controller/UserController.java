package com.examples.SpringMVCdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.examples.SpringMVCORMdemo.exception.UserAlreadyExistsException;
import com.examples.SpringMVCORMdemo.service.UserService;
import com.examples.springORMdemo.entity.User;

@Controller
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/register")
	public String showRegistartionPage() {
		
		return "userreg";
	}
	
	@RequestMapping("/registeruser")
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		int result;
		try {
			result = userservice.save(user);
			model.addAttribute("message","User Created with id "+result);
			model.addAttribute("users",userservice.getUsers());
		} catch (UserAlreadyExistsException e) {
			// TODO Auto-generated catch block
			
			model.addAttribute("message","User Already Exists");
		}
		
		return "userreg";
	}

	@RequestMapping("/users")
	public String getusers(ModelMap model) {
		model.addAttribute("users",userservice.getUsers());
		return "displayusers";
	}
}
