package com.my2020app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my2020app.dao.InstructorDAO;
import com.my2020app.domain.ResponseMessage;
import com.my2020app.model.Instructor;

@Service
public class InstructorService {

	@Autowired
	private InstructorDAO instructorDAO;
	
	public ResponseMessage getAllInstructors() {
		ResponseMessage response = new ResponseMessage();
		try {
			List<Instructor> instList = instructorDAO.getAlInstructors();
			response.addPayload("instructors", instList);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response;		
	}
	
	public ResponseMessage saveInstructor(Instructor instructor) {
		ResponseMessage response = new ResponseMessage();
		System.out.println("*************************************************");
		System.out.println(instructor.getFirstName());
		System.out.println(instructor.getInstructorDetail().getYoutubeChannel());
		try {
			instructor = instructorDAO.saveInstructor(instructor);
			response.addPayload("Instructor", instructor);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return response;
	}
}
