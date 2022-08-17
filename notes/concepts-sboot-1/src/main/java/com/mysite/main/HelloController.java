package com.mysite.main;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody
	String helloSpring() {
		return "Hello from my first spring controller";
	}
	
	/*
	@RequestMapping("/users")
	@ResponseBody
	String helloUsers() {
		return "Hello from my first users controller.";
	}
	
	@RequestMapping("/users/{name}")
	@ResponseBody
	String helloUserBasedOnName(@PathVariable String name) {
		return "Hello from my first user controller your name is "+name;
	}
	*/

}
