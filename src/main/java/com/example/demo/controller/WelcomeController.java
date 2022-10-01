package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}

}
