package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Employee;
import com.example.demo.repository.UserDao;

@Service
@Transactional
public class UserServiceImpl implements UserServices {

	@Autowired
    UserDao userDao;
	
	@Override
	public void createUser(Employee user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getUser() {
		// TODO Auto-generated method stub
		 return userDao.getUser();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee updatePartially(Employee user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
