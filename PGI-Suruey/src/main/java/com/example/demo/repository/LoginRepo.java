package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.UserDto;
import com.example.demo.model.LoginDto;

public interface LoginRepo extends JpaRepository{
	/*
	 * LoginDto findByEmail(String email);
	 * 
	 * UserDto validate(String userId, String passwd);
	 */
}
