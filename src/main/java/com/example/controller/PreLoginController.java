package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Response;
import com.example.model.User;
import com.example.service.UserService;

@RestController
public class PreLoginController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value="/registration")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public ResponseEntity<Response> registration(@RequestBody User user){
		User dbUser = userService.save(user);
		if(dbUser!=null) {
			return new ResponseEntity<Response>(new Response("User is saved successfully"), HttpStatus.OK);
		}else {
			return null;
		}
	}
}
