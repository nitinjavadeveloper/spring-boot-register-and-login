package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeService employeeService;
		
	@RequestMapping(value = {"/", "/home", "/index"})
	public List<Employee> get() {
	//	ModelAndView mav = new ModelAndView("employeesList");
		List<Employee> list = employeeService.get();
		/* mav.addObject("list", list); */
		return list;
	}
}
