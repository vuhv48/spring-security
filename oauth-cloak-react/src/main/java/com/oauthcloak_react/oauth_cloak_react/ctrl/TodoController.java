package com.oauthcloak_react.oauth_cloak_react.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@GetMapping("/api/todo")
	public String todo() {
		return "todo";
	}
	
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	

}
