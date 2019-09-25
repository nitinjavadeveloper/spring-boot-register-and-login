package com.example.demo.model;

import javax.annotation.ManagedBean;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.context.annotation.SessionScope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 
@ManagedBean
@SessionScope
@Entity
@Table(name="tbl_employee")
@JsonIgnoreProperties
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	
	private String name;
	
	private String gender;

	private String department;
	
	private String department1;

	
	private String hello;
	
	
	
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;

	}
	
	
	
}