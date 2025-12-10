package com.spring.practice.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newController {

	/*
	 * @GetMapping("/allow") public String example() { return
	 * "welcome to new spring basic application"; }
	 */
	
	@GetMapping("/allow123")
	public String example() {
		return "welcome to new spring basic application123";
	}
}
