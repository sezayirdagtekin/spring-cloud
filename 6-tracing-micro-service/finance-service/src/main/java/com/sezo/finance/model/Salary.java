package com.sezo.finance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Salary {

	private Long userId;
	private Double grossSalary;
	private int taxRate;
	
}
