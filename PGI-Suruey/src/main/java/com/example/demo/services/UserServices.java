package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Employee;

public interface UserServices {

	public void createUser(Employee user);

	public List<Employee> getUser();

	public Employee findById(int id);

	public Employee update(Employee user, int id);

	public void deleteUserById(int id);

	public Employee updatePartially(Employee user, int id);
}
