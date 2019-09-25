package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.AuthLogin;

@RestController
public class LoginContoller {

	@Autowired
	private AuthLogin authenticateService; // This will auto-inject the authentication service into the controller.

	private static Logger log = LoggerFactory.getLogger(LoginContoller.class);

	// Checks if the user credentials are valid or not.
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public String validateUsr(@RequestParam("username") String username, @RequestParam("password") String password) {
		String msg = "";
		boolean isValid = authenticateService.findUser(username, password);
		log.info("Is user valid?= " + isValid);

		if (isValid) {
			msg = "Welcome";
			System.out.println(msg);
			return "Ok";
		} else {
			msg = "Invalid credentials";
			System.out.println(msg);
			return "Not Match";
		}
	}
}
