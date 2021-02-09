package com.my2020app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my2020app.domain.ResponseMessage;

@RequestMapping("/apiDb")
public interface DummyApiController {
	
    @RequestMapping(value = "/saveDummyStudent", method = RequestMethod.POST,produces="application/json") 
	public @ResponseBody ResponseMessage saveStudent(@RequestParam(value="firstName", required = true, defaultValue = "jjj") String firstName
			,@RequestParam(value="lastName") String lastName ,
			@RequestParam(value="email") String email);
  
	
	@GetMapping(value = "/studentList") //List of students
	public @ResponseBody
	   ResponseMessage studentList(HttpServletRequest request,
			   @RequestParam(value = "offset", required = true, defaultValue = "0") int offset,
	           @RequestParam(value = "recordsPerPage", required = true, defaultValue = "10") int recordsPerPage);
	  
}
