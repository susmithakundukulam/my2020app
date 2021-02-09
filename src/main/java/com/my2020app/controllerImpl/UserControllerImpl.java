package com.my2020app.controllerImpl;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.my2020app.controller.UserController;
import com.my2020app.model.Student;

@Controller
public class UserControllerImpl implements UserController{
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	public String getIntUsersPage(ModelMap model) {
		try {	
			System.out.println("homepage..........");
			return "homepage";
		} catch (Exception e) {
			e.printStackTrace();
			
			return "error";
		}
	}

	@Override
	public String getShowForm() {
		try {
			return "showForm";
		}catch (Exception e) {
			e.printStackTrace();
			
			return "error";
		}
	}

	@Override
	public String getProcessForm(HttpServletRequest request) {
		try {
			System.out.println(request.getParameter("firstName"));
			return "processForm";
		}catch (Exception e) {
			e.printStackTrace();
			
			return "error";
		}
	}


	@Override
	public String getProcessFormAttribute(String firstName, String lastName, Model model) {
		try { 
			firstName = firstName.toUpperCase(); 
			lastName = lastName.toUpperCase();
			String msg = "Hi " + firstName +" " +lastName;
			model.addAttribute("message" , msg);
			return "processFormAttr"; 
			
		}catch (Exception e) { e.printStackTrace();
				  return "error"; }
	}

	@Override
	public String getShowFormTags(Model model) {
		try {
			Student theStudent = new Student();
			model.addAttribute("student", theStudent);
			return "showFormTags";
		}catch (Exception e) {
			e.printStackTrace();
			
			return "error";
		}
	}

	@Override
	public String getProcessFormTags(Student theStudent, Model model) {
		try { 
			String firstName = theStudent.getFirstName().toUpperCase();
			String lastName = theStudent.getLastName().toUpperCase();
			String msg = "Hi " + firstName +" " +lastName;
			model.addAttribute("message" , msg);
			return "processFormTags";
		}catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	@Override
	public String showFormValidations(Model model) {
		try {
			Student theStudent = new Student();
			model.addAttribute("student", theStudent);
			return "showFormValidations";
		}catch (Exception e) {
			e.printStackTrace();
			
			return "error";
		}
	}

	@Override
	public String getProcessFormValidations(@Valid Student theStudent, 
			 BindingResult bindingResult, Model model) {
		System.out.println("getProcessFormValidations");
		try { 
			if(bindingResult.hasErrors()) {
				
				return "showFormValidations";
			}else {
				
				String firstName = theStudent.getFirstName().toUpperCase();
				String lastName = theStudent.getLastName().toUpperCase();
				String msg = "Hi " + firstName +" " +lastName;
				model.addAttribute("message" , msg);
				model.addAttribute("student", theStudent);
				return "processFormValidations";
			}
		}catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	@Override
	public String showFormCustomValidations(Model model) {
		try {
			Student theStudent = new Student();
			model.addAttribute("student", theStudent);
			return "showFormValidations";
		}catch (Exception e) {
			e.printStackTrace();
			
			return "error";
		}
	}

	@Override
	public String processFormCustomValidations(@Valid Student theStudent, 
			 BindingResult bindingResult, Model model) {
		System.out.println("getProcessFormValidations");
		try { 
			if(bindingResult.hasErrors()) {
				
				return "showFormCustomValidations";
			}else {
				
				String firstName = theStudent.getFirstName().toUpperCase();
				String lastName = theStudent.getLastName().toUpperCase();
				String msg = "Hi " + firstName +" " +lastName;
				model.addAttribute("message" , msg);
				model.addAttribute("student", theStudent);
				return "processFormCustomValidations";
			}
		}catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	
}
