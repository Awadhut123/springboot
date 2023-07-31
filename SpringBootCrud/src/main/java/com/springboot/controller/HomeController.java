package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@ResponseBody
	@GetMapping("/home")
	public String home() {
		return "Welcome - to springboot crud operation using JPA!!";
	}
	
	
	
	
	
	
	
	
	
}
