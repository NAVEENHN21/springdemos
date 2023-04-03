package com.examples.SpringMVCdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.examples.SpringMVCdemo.model.User;

@Controller
public class UserController {

	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "registeruser";
	}
//	public ModelAndView showRegistrationPage() {
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("registeruser");
//		return mv;
//		
//	}
	@RequestMapping(value="/signupuser",method=RequestMethod.POST)
	public String signupuser(@ModelAttribute("user") User user,ModelMap model) {
		System.out.print("From UI> Retrieve object from spring container "+user);
		model.addAttribute("user",user);
		return "registeruserresult";
	}
//	public ModelAndView signupuser(@ModelAttribute("user") User user) {
//		System.out.print("From UI> Retrieve object from spring container "+user);
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("registeruserresult");
//		return mv;
//	}
}
