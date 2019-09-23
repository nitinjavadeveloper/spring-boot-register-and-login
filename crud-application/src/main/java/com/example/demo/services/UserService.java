package com.example.demo.services;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.model.LoginDto;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private EntityManager em;

	public LoginDto findByEmail(String email) {
		return userRepo.findByEmail(email);
	}

	public void login(LoginDto loginDto) {
		LoginDto user = userRepo.findByEmail(loginDto.getEmail());
		if (user == null) {
			throw new RuntimeException("User does not exist.");
		}
		if (!user.getPassword().equals(loginDto.getPassword())) {
			throw new RuntimeException("Password mismatch.");
		}
	}

	public void saveUser(Employee emp) {
		userRepo.save(emp);
	}

	// list of user

	public List<Employee> getEmployees() {

		Employee e = new Employee();

		return userRepo.findAll();

	}

}