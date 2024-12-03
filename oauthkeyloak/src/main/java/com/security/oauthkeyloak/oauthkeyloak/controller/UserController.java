package com.security.oauthkeyloak.oauthkeyloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/home")
    public String home(@RequestParam String email) {
        return "Home page";
    }
	
	@GetMapping("/test")
    public String test() {
        return "tesst";
    }
	
	@GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
	
	
	@GetMapping("/secured")
	public String secured() {
		return "secured";
	}

}
