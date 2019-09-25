package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.services.UserService;

@RestController
@RequestMapping("pgi")
public class LoginController {

	/*
	 * @Autowired public UserService userService;
	 * 
	 * @PostMapping("/login") public String login(@RequestBody UserDto login)
	 * 
	 * { System.out.println(login.getUserId());
	 * System.out.println(login.getPassword()); if (login != null &&
	 * login.getUserId() != null & login.getPassword() != null) {
	 * userService.validate(login); if (null != login) { return "OK"; } else {
	 * return "Invalid"; } } else { return "Please enter Details"; } }
	 */

}
