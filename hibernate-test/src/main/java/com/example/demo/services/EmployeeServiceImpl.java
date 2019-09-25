package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> get() {
		return employeeDAO.get();
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
