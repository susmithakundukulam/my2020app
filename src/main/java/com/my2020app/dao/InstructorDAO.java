package com.my2020app.dao;

import java.util.List;

import com.my2020app.model.Instructor;

public interface InstructorDAO {
	
	public List<Instructor> getAlInstructors();
	
	public Instructor saveInstructor(Instructor instructor);
}
