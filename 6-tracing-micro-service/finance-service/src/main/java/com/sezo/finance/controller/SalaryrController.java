package com.sezo.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sezo.finance.model.Salary;
import com.sezo.finance.service.FinanceService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/salary")
@Log4j2
public class SalaryrController {

	@Autowired
	FinanceService service;

	@GetMapping("/id/{id}")
	public Salary getUserSalaryById(@PathVariable Long id) throws InterruptedException {
		log.debug("getUserSalaryById userid="+id);
		return service.getUserSalaryById(id);
	}

}
