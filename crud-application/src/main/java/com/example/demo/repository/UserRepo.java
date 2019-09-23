package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.model.LoginDto;

@Repository
public interface UserRepo extends JpaRepository<Employee, Long>{
	
	
	LoginDto findByEmail(String email);
}
