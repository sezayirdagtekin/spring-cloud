package com.sezo.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RateController {

	@Value("${rate}")
	String rate;

	@Value("${tollstart}")
	String tollstart;

	@Value("${lanecount}")
	String lanecount;
	
	@Value("${connstring}")
	String connstring;

	@GetMapping("/rate")
	public String getRate(Model m) {
		m.addAttribute("rateamount", rate);
		m.addAttribute("tollstart", tollstart);
		m.addAttribute("lanes", lanecount);
		m.addAttribute("connstring", connstring);
		

		return "rateview";

	}
}
