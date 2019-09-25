package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.services.UserService;
import com.example.demo.services.UserServices;

@RestController
@RequestMapping("np")
public class IndexController {

//	index url mapping

	public UserServices userService;

	/*
	 * @RequestMapping("/") public ModelAndView index()
	 * 
	 * { return new ModelAndView("index"); }
	 */
	
	@RequestMapping("/")
	public List<Employee> list()
	
	{
		return userService.getUser();
	}
	
	// Add New User

	/*
	 * @PostMapping("/saveUser") public String saveCustomer(@ModelAttribute("user")
	 * Employee emp) {
	 * 
	 * userService.saveUser(emp);
	 * 
	 * return "redirect:/"; }
	 * 
	 */
}
