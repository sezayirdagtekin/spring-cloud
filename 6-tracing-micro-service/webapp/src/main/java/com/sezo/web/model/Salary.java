package com.sezo.web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Salary {

	private Long userId;
	private Double grossSalary;
	private int taxRate;
	
}
