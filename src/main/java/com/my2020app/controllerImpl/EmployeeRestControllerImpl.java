package com.my2020app.controllerImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my2020app.controller.EmployeeRestController;
import com.my2020app.domain.ResponseMessage;
import com.my2020app.model.Employee;

@Controller
public class EmployeeRestControllerImpl implements EmployeeRestController{
	
	public List<Employee> employees = new ArrayList<Employee>();

	@PostConstruct
	public List<Employee> employees(){
		employees.add(new Employee("Sus", "Tom"));
		employees.add(new Employee("Tom", "Anto"));
		employees.add(new Employee("Chris", "Tom"));
		return employees;
	}

	@Override
	public ResponseMessage getEmployeeList() {
		System.out.println("..........getEmployeeList..........");
		ResponseMessage response=new ResponseMessage();
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(new Employee("Sus", "Tom"));
//		employees.add(new Employee("Tom", "Anto"));
//		employees.add(new Employee("Chris", "Tom"));

		response.addPayload("employeeList", employees);
		return response;
	}

	@Override
	public ResponseMessage getEmployeeListById(@PathVariable Integer empId) {
		System.out.println("..............................." +empId);
		ResponseMessage response=new ResponseMessage();
		response.addPayload("result", employees.get(empId));
		return response;
	}


}
