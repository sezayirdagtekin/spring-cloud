package com.sezo.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sezo.user.model.User;

import lombok.extern.java.Log;

@Service
@Log
public class UserService {
	private static List<User> users = new ArrayList<>();

	public User getUserById(Long id) {
		log.info("getUserById method called and user id=" + id);
		return users.stream().filter(u -> u.getId().equals(id)).findAny().orElseThrow();

	}

	static {

		users.add(new User(1L, "Sezayir", "Dagtekin"));
		users.add(new User(2L, "Jonh", "Papa"));
		users.add(new User(3L, "Benjamin", "Toshack"));
	}
}
