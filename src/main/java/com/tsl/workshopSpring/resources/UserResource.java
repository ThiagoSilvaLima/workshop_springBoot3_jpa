package com.tsl.workshopSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsl.workshopSpring.entities.User;
import com.tsl.workshopSpring.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> obj = userService.findAll();

		return ResponseEntity.ok().body(obj);
	}
	@GetMapping(value= "/{id}")
	public ResponseEntity<User> FindById(@PathVariable Long id){
		return ResponseEntity.ok().body(userService.findById(id));
	}

}
