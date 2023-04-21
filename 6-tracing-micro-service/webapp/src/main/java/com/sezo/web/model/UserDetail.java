package com.sezo.web.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDetail {
	private Long userId;
	private String name;
	private String surname;
	private Double grossSalary;
	private int taxRate;
}
