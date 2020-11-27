package com.my2020app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my2020app.model.Student;


@RequestMapping("/user")
public interface UserController {

	@RequestMapping 
	public String getIntUsersPage(ModelMap model);
	
	@RequestMapping("/showForm")
	public String getShowForm();
	
	@RequestMapping("/processForm")
	public String getProcessForm(HttpServletRequest request);

	@RequestMapping("/processFormAttr")
	public String getProcessFormAttribute(@RequestParam("firstName") String firstName
			,@RequestParam("lastName") String lastName
			,Model model);
	
	@RequestMapping("/showFormTags")
	public String getShowFormTags(Model model );
	
	@RequestMapping("/processFormTags")
	public String getProcessFormTags(@ModelAttribute("student") Student theStudent
			,Model model);
	
	@RequestMapping("/showFormValidations")
	public String showFormValidations(Model model );
	
	@RequestMapping("/processFormValidations")
	public String getProcessFormValidations(@Valid @ModelAttribute("student") Student theStudent
			, BindingResult bindingResult, Model model);
}
