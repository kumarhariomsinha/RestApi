package com.example.jpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.model.Employee;
import com.example.jpa.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	public List<Employee> getAllEmployeesRecord(){
		return employeeRepository.getAllEmployees();
	}
}
