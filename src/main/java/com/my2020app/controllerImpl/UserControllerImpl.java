package com.my2020app.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.my2020app.controller.UserController;

@Controller
public class UserControllerImpl implements UserController{

	public String getIntUsersPage(ModelMap model) {
		try {	
	System.out.println("hhhh..........");
			return "homepage";
		} catch (Exception e) {
			e.printStackTrace();
			
			return "error";
		}
	}
}
