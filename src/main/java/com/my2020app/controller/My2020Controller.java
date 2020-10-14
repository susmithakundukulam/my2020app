package com.my2020app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class My2020Controller {
	@RequestMapping
	public String getHomePage() 
	{
		
			return "redirect:/user";
	}	
	
	@RequestMapping(value = "/404")
	public String pageNotFound() 
	{
		
			return "404";
	}
	
	@RequestMapping(value = "/400")
	public String error400() 
	{
		
			return "400";
	}
	
	@RequestMapping(value = "/405")
	public String error405() 
	{
		
			return "405";
	}
	
	@RequestMapping(value = "/500")
	public String internalServerError() 
	{
		
			return "500";
	}
	
	@RequestMapping(value = "/somethingWentWrong")
	public String somethingWentWrong() 
	{
		
			return "somethingWentWrong";
	}
	
}
