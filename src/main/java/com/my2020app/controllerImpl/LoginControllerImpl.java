package com.my2020app.controllerImpl;

import org.springframework.stereotype.Controller;

import com.my2020app.controller.LoginController;

@Controller
public class LoginControllerImpl implements LoginController{

	@Override
	public String showMyLoginPage() {
		
		return "login_page";
	}

}
