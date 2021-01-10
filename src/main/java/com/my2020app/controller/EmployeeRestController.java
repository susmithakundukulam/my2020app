package com.my2020app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my2020app.domain.ResponseMessage;
import com.my2020app.model.Employee;

@RequestMapping("/api")
public interface EmployeeRestController {

	@GetMapping("/employeeList")
	//public List<Employee> getEmployeeList();
	public @ResponseBody
	   ResponseMessage getEmployeeList();
}
