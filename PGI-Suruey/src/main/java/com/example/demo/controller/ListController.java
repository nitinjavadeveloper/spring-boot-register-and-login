package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("np")
public class ListController {

	/*
	 * @Autowired public UserService userService;
	 * 
	 * @RequestMapping("/all") public String getEmployees(Model model) {
	 * 
	 * List<Employee> userList = userService.getEmployees();
	 * 
	 * for (Employee em : userService.getEmployees()) { System.out.println(em); }
	 * 
	 * ModelAndView mav = new ModelAndView();
	 * 
	 * model.addAttribute("userList", userList);
	 * 
	 * return "list"; }
	 * 
	 * @RequestMapping("/edit") public ModelAndView editCustomerForm(@RequestParam
	 * long id, Model model) {
	 * 
	 * ModelAndView mv = new ModelAndView("edit"); Employee customer =
	 * userService.get(id); model.addAttribute("customer", customer);
	 * 
	 * return mv; }
	 * 
	 * @RequestMapping("/delete") public String deleteCustomerForm(@RequestParam
	 * long id) { userService.delete(id); return "redirect:/np/all"; }
	 */
}
