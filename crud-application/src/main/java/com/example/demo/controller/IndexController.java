package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.services.UserService;

@Controller
@RequestMapping("np")
public class IndexController {

//	index url mapping

	public UserService userService;

	@RequestMapping("/")
	public ModelAndView index()

	{
		return new ModelAndView("index");
	}

	// Add New User

	@PostMapping("/saveUser")
	public String saveCustomer(@ModelAttribute("user") Employee emp) {

		userService.saveUser(emp);

		return "redirect:/";
	}

	// list of user

//	@GetMapping("/list")
//	public String listCustomers(Model theModel) {
//		List<Employee> theCustomers = userService.getCustomers();
//		theModel.addAttribute("customers", theCustomers);
//		return "list-customers";
//	}

	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Employee theCustomer = new Employee();
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

//	 
//	 @GetMapping("/updateForm")
//	    public String showFormForUpdate(@RequestParam("customerId") int theId,
//	        Model theModel) {
//	        User theCustomer = userService.getCustomer(theId);
//	        theModel.addAttribute("customer", theCustomer);
//	        return "customer-form";
//	    }

//	@GetMapping("/delete")
//	public String deleteCustomer(@RequestParam("customerId") int theId) {
//		userService.deleteCustomer(theId);
//		return "redirect:/customer/list";
//	}
}
