package com.my2020app.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.my2020app.controller.ManagerController;

@Controller
public class ManagerControllerImpl implements ManagerController{

	@Override
	public String getManagersPage(ModelMap model) {
		try {	
			System.out.println("managerPage..........");
					return "managerPage";
				} catch (Exception e) {
					e.printStackTrace();
					
					return "error";
				}
	}

}
