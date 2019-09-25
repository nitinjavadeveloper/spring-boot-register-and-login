package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeServiceImpl;

@RestController
@CrossOrigin("*")
public class ListController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@RequestMapping("/list")
	public List<Employee> get()

	{
		return employeeServiceImpl.get();
	}
}
