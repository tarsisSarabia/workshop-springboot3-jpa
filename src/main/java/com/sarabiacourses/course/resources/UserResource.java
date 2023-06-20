package com.sarabiacourses.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarabiacourses.course.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Tarsis Sarabia", "tarsisfabiano@gmail.com", "44 99105-1935", "123456");
		return ResponseEntity.ok().body(u); 
	}

}
