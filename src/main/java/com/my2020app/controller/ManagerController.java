package com.my2020app.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/manager")
public interface ManagerController {

	@RequestMapping 
	public String getManagersPage(ModelMap model);
}
