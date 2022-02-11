package com.example.jpa.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.model.Employee;
import com.example.jpa.repository.EmployeeRepository;
import com.example.jpa.services.EmployeeServices;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {
@GetMapping("/home")
public String home() {
	return "home";
}

@Autowired
private EmployeeServices empService;
private EmployeeRepository employeeRepository;
@Autowired
@PersistenceContext

private EntityManager em;
@GetMapping("/employees")
@Transactional
public List<Employee>findEmp(){
	
	return empService.getAllEmployeesRecord();
//	return employeeRepository.getAllEmployees();
	
}


}
