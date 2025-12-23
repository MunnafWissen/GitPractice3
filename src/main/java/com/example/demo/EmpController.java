package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@GetMapping("/")
	public String Home() {
		return "This is the home page";
	}
	
}
