package com.example.demo.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class UserDaoImpl implements UserDao {


	
	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(Employee user) {

		Session session = sessionFactory.getCurrentSession();
		session.save(user);

	}

	@Override
	public List<Employee> getUser() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Employee> list = session.createCriteria(Employee.class).list();
		return list;
	}

	@Override
	public Employee findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee user = (Employee) session.get(Employee.class, id);
		return user;
	}

	@Override
	public Employee update(Employee user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateCountry(Employee user, int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee emp = (Employee) session.get(Employee.class, id);
		emp.setUserName(user.getUserName());
		emp.setEmail(user.getEmail());
		emp.setPassword(user.getPassword());
		emp.setDesignation(user.getDesignation());
		session.update(user);
		return user;
	}

	@Override
	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee user = findById(id);
		session.delete(user);
	}

}
