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
	 
 
	public ResponseMessage saveStudent(String firstName, String lastName, String email) { 
		System.out.println("saveStudent-2");
		ResponseMessage response = new ResponseMessage();
	    StudentHib theStudent = new StudentHib(); 
	    theStudent.setFirstName(firstName); 
	    theStudent.setLastName(lastName); 
	    theStudent.setEmail(email);
	    
	    String result = dummyApiDao.saveStudent(theStudent);
	    response.setMessage(result);
		return response; 
		
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
