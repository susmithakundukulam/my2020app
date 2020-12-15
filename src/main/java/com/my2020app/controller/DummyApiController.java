package com.my2020app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/apiDb")
public interface DummyApiController {
	
	@RequestMapping("/saveDummyStudent")
	public String saveStudent(@RequestParam("firstName") String firstName
			,@RequestParam("lastName") String lastName ,
			@RequestParam("email") String email);
  
}
