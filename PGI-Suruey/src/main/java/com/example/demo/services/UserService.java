package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.Employee;
import com.example.demo.model.LoginDto;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {

	/*
	 * @Autowired private UserRepo userRepo;
	 * 
	 * public LoginDto findByEmail(String email) { return
	 * userRepo.findByEmail(email); }
	 * 
	 * public UserDto validate(UserDto userDto) { return
	 * userRepo.validate(userDto.getUserId(), userDto.getPassword());
	 * 
	 * }
	 * 
	 * public void login(LoginDto loginDto) { LoginDto user =
	 * userRepo.findByEmail(loginDto.getEmail()); if (user == null) { throw new
	 * RuntimeException("User does not exist."); } if
	 * (!user.getPassword().equals(loginDto.getPassword())) { throw new
	 * RuntimeException("Password mismatch."); } }
	 * 
	 * public void saveUser(Employee emp) { userRepo.save(emp); }
	 * 
	 * // list of user
	 * 
	 * public List<Employee> getEmployees() { return userRepo.findAll();
	 * 
	 * }
	 * 
	 * // find By id user
	 * 
	 * public Employee get(Long id) { return userRepo.findById(id).get(); }
	 * 
	 * // Delete user
	 * 
	 * public void delete(Long id) { userRepo.deleteById(id); }
	 */
}
