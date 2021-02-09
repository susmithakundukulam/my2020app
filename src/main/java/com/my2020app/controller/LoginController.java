package com.my2020app.controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface LoginController {
	
	@GetMapping("/showMyLoginPage")
	public String showMyLoginPage() ;
	
	@GetMapping("/accessDenied")
	public String accessDeniedPage() ;
 
}
