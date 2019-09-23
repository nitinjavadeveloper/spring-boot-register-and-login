package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("np")
public class ListController {

	@Autowired
	public UserService userService;
	
	@RequestMapping("/all")
	public ModelAndView getAllUsers()
	{
//		userService.getEmployees();
		return new ModelAndView("list");
	}
	
}
