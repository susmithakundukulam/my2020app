package com.my2020app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/user")
public interface UserController {

	@RequestMapping 
	public String getIntUsersPage(ModelMap model);
}
