package com.spring.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/emp-manage")
public class EmployeeController {
	
	@RequestMapping("/hello")
	public @ResponseBody String getString() {
		
		System.out.println("I am in Controller");
		return "Wellcome to Spring MVC";
	}
	

}
