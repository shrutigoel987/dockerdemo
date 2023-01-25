package com.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceController {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Docker Demo Application!!";
	}
}
