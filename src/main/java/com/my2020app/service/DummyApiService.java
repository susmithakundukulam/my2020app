package com.my2020app.service;

import java.util.List;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my2020app.dao.DummyApiDAO;
import com.my2020app.domain.ResponseMessage;
import com.my2020app.model.StudentHib;
import com.my2020app.utils.CommonUtils;

@Service("dummyApiService") 
public class DummyApiService { 
	 
	@Autowired 
	DummyApiDAO dummyApiDao; 
	
	
	 @Autowired 
	 CommonUtils commonUtils;
	 
	 CommonUtils utils = new CommonUtils(); 
	 Properties prop = utils.getPropertyFile("message");
	 
 
	public String saveStudent(String firstName, String lastName, String email) { 
	    StudentHib theStudent = new StudentHib(); 
	    theStudent.setFirstName(firstName); 
	    theStudent.setLastName(lastName); 
	    theStudent.setEmail(email); 
		return dummyApiDao.saveStudent(theStudent); 
	}

	public ResponseMessage studentList(HttpServletRequest request, int offset, int recordsPerPage) {
		ResponseMessage response	=	new ResponseMessage();
		try{
		
				List<StudentHib> studentList	=	dummyApiDao.studentList(offset,recordsPerPage);
				int rowCount = dummyApiDao.studentListCount();
				response.setStatus(1);
				response.setMessage(prop.getProperty("success"));	
				response.addPayload("studentList", studentList);
				response.addPayload("totalRecords", rowCount);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return response;	
	} 
} 
