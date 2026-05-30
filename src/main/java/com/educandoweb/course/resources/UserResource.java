package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll () {
		User u = new User(1L, "Bruna", "bruninha@gmail.com", "86 9 9999 9999", "rayssinha123");
		return ResponseEntity.ok().body(u);
	}
}
