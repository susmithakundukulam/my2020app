package com.my2020app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my2020app.domain.ResponseMessage;

@RequestMapping("/apiDb")
public interface DummyApiController {
	
	@RequestMapping("/saveDummyStudent")
	public String saveStudent(@RequestParam("firstName") String firstName
			,@RequestParam("lastName") String lastName ,
			@RequestParam("email") String email);
  
	
	@RequestMapping(value = "/studentList") //List of students
	public @ResponseBody
	   ResponseMessage studentList(HttpServletRequest request,
			   @RequestParam(value = "offset", required = true, defaultValue = "0") int offset,
	           @RequestParam(value = "recordsPerPage", required = true, defaultValue = "10") int recordsPerPage);
	  
}
