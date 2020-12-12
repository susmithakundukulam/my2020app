package com.my2020app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my2020app.dao.DummyApiDAO;
import com.my2020app.model.Student;
import com.my2020app.model.StudentHib;

@Service("dummyApiService")
public class DummyApiService {
	
	@Autowired
	DummyApiDAO dummyApiDao;

	public String saveStudent(String firstName, String lastName, String email) {
	    StudentHib theStudent = new StudentHib();
	    theStudent.setFirstName(firstName);
	    theStudent.setLastName(lastName);
	    theStudent.setEmail(email);
		return dummyApiDao.saveStudent(theStudent);
	}
}
