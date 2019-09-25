package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Employee;

public interface UserDao {

	public void addUser(Employee user);

	public List<Employee> getUser();

	public Employee findById(int id);

	public Employee update(Employee user, int id);

	public Employee updateCountry(Employee user, int id);

	public void delete(int id);
}
