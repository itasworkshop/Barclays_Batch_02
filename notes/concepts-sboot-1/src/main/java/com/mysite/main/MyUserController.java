package com.mysite.main;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyUserController {
	
	private final UserRepository userRespository;
	
	MyUserController(UserRepository userRespository){
		this.userRespository = userRespository;
	}
	
	@GetMapping("/users")
	List<User> getAll(){
		return userRespository.findAll();
	}

}
