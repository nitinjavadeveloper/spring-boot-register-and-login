package com.example.demo.services;


import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class AuthLogin {

	@Autowired
	private EntityManager entityManager;
	
	private HibernateTemplate hibernateTemplate;
    private static Logger log = LoggerFactory.getLogger(AuthLogin.class);
 
    private AuthLogin() { }
 
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    public boolean findUser(String username, String password) {
        log.info("Checking the user in the database");
     
        System.out.println("In Check login");
    	Session session = entityManager.unwrap(Session.class);
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY =" from Employee as o where o.user_name=?0 and o.password=?1";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,username);
		query.setParameter(1,password);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;  
        
    }
}
