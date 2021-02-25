package com.my2020app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my2020app.domain.ResponseMessage;
import com.my2020app.model.Instructor;

@RequestMapping("/instructor")
public interface InstructorController {

	@GetMapping("/instructors")
	public @ResponseBody ResponseMessage getAllInstructors();
	
	@PostMapping("/instructors/{id}")
	public @ResponseBody ResponseMessage saveInstructor(@RequestBody Instructor instructor);
}
