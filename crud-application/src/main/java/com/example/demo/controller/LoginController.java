package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.LoginDto;
import com.example.demo.services.UserService;

@Controller
@RequestMapping("np")
public class LoginController {

	
	public UserService userService;
	
	
	
	
	@PostMapping("/login")
	public String login(@ModelAttribute("login") LoginDto login, ModelMap model)
	
	{
		model.addAttribute("email", login.getEmail());
		model.addAttribute("password", login.getPassword());
		 if (login != null && login.getEmail() != null
	                & login.getPassword() != null) {
	            if (login.getEmail().equals("chandra@gmail.com")
	                    && login.getPassword().equals("chandra123")) {
	                model.addAttribute("msg", login.getEmail());
	                return "list";
	            } else {
	                model.addAttribute("error", "Invalid ");
	                return "index";
	            }
	        } else {
	            model.addAttribute("error", "Please enter Details");
	            return "index";
	        }
	}
	
}
