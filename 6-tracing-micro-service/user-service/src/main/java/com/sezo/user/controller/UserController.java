package com.sezo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sezo.user.model.User;
import com.sezo.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService service;

	@GetMapping("/id/{id}")
	public User getUser(@PathVariable Long id) {
		return service.getUserById(id);
	}

}
