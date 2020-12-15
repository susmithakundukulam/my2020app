package com.my2020app.controllerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.my2020app.controller.DummyApiController;
import com.my2020app.service.DummyApiService;

@Controller
public class DummyApiControllerImpl implements DummyApiController{

	@Autowired
	DummyApiService dummyApiService;

	@Override
	public String saveStudent(String firstName, String lastName, String email) {
		firstName = "Susmitha";
		lastName = "Tom";
		email = "susmithatom@gmail.com";
		return dummyApiService.saveStudent(firstName, lastName, email);
	}}
