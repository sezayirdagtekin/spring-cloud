package com.sezo.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sezo.finance.model.Salary;
import com.sezo.finance.service.FinanceService;

@RestController
@RequestMapping("/salary")
public class SalaryrController {

	@Autowired
	FinanceService service;

	@GetMapping("/id/{id}")
	public Salary getUserSalary(@PathVariable Long id) throws InterruptedException {
		return service.getUserSalaryById(id);
	}

}
