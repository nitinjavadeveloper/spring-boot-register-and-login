package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.services.UserService;

@Controller
@RequestMapping("np")
public class RegisterController {

	/*
	 * @Autowired public UserService userService;
	 * 
	 * @RequestMapping("/register") public ModelAndView registerPage()
	 * 
	 * { return new ModelAndView("register"); }
	 * 
	 * @PostMapping("/save") public String saveUser(@ModelAttribute("register")
	 * Employee emp, ModelMap model)
	 * 
	 * { model.addAttribute("userName", emp.getUserName());
	 * model.addAttribute("email", emp.getEmail()); model.addAttribute("password",
	 * emp.getPassword()); model.addAttribute("designation", emp.getDesignation());
	 * 
	 * userService.saveUser(emp);
	 * 
	 * return "redirect:/";
	 * 
	 * }
	 */
}
