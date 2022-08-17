package com.mysite.main;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable Long id){
		return userRespository.findById(id);
	}
	
	@PostMapping("/users")
	User newUser(@RequestBody User user){
		return userRespository.save(user);
	}
	
	@DeleteMapping("/users/{id}")
	void deleteUser(@PathVariable Long id){
		userRespository.deleteById(id);
	}
	
	@PutMapping("/users/{id}")
	User updateUser(@PathVariable Long id,@RequestBody User newuser) {
		return userRespository.findById(id).map(
				user -> {
					user.setName(newuser.getName());
					return userRespository.save(user);
				}).orElseGet(() -> {
					newuser.setId(id);
					return userRespository.save(newuser);
				}		
				);
	}

}
