package com.sezo.secuireui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportController {

	@GetMapping("/")
	public String loadHome(Model model) {

		return "home";
	}

	@GetMapping("/report")
	public String loadReport(Model model) {

		return "report";
	}

}
