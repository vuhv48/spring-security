package com.security.study_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authentication2Controller {
	
	@PostMapping("/test")
	public String login() {
		return "test";
	}

}
