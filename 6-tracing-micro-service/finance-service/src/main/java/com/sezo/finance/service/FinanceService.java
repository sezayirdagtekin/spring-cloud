package com.sezo.finance.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.sezo.finance.model.Salary;
import lombok.extern.java.Log;

@Service
@Log
public class FinanceService {
	private static List<Salary> salaries = new ArrayList<>();

	public Salary getUserSalaryById(Long id) {
		log.info("getUserSalaryById method called and user id=" + id);
		return salaries.stream().filter(u -> u.getUserId().equals(id)).findAny().orElseThrow();

	}

	static {

		salaries.add(new Salary(1L, 12000.0, 18));
		salaries.add(new Salary(3L, 24000.0, 22));
		salaries.add(new Salary(3L, 360000.0, 30));
	}
}
