package com.sw.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("")
	public String ViewHomePage() {
		System.out.println("index");
		return "thymeleaf/index";
	}
}
