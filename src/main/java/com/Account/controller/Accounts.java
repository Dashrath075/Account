package com.Account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Accounts {
	@GetMapping("/Details")
	public String details() {
		return "Name: Dashrath"
				+ "Acc No: 1234"
				+ "mobile No:7892234252";
	}
}
