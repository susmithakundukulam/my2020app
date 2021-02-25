package com.my2020app.controllerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.my2020app.controller.InstructorController;
import com.my2020app.domain.ResponseMessage;
import com.my2020app.model.Instructor;
import com.my2020app.service.InstructorService;

@RestController
public class InstructorControllerImpl implements InstructorController{

	@Autowired
	private InstructorService instructorService;
	
	@Override
	public ResponseMessage getAllInstructors() {
		return instructorService.getAllInstructors();
	}

	@Override
	public ResponseMessage saveInstructor(Instructor instructor) {
		instructor.setId(0);
		return instructorService.saveInstructor(instructor);
	}

}
