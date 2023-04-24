package com.sezo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.sezo.web.model.Salary;
import com.sezo.web.model.User;
import com.sezo.web.model.UserDetail;

@RestController
@RequestMapping("/userdetail")
public class UserDetailController {

	@Autowired
	private WebClient webClient;

	@GetMapping(value = "/{id}")
	public UserDetail getCustomer(@PathVariable Long id) {

		User user =webClient.get()
							.uri("http://localhost:8081/user/id/" + id)
							.retrieve()
							.bodyToMono(User.class)
							.block();

		Salary salary =webClient.get()
								.uri("http://localhost:8082/salary/id/" + id)
								.retrieve()
								.bodyToMono(Salary.class)
								.block();

		UserDetail userDetail =UserDetail.builder()
										 .userId(user.getId())
										 .name(user.getName())
										 .surname(user.getSurname())
										 .grossSalary(salary.getGrossSalary())
										 .taxRate(salary.getTaxRate())
										 .build();

		return userDetail;

	}
}
