package com.java.springSecurity.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")

public class ApplicationController {
	
	@GetMapping("/getMsg")
	
	public String greeting(){
		return "Spring security examples";
	}

}
