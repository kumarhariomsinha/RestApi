package com.example.jpa.repository;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
     
	@Transactional
	@Procedure
	List<Employee> getAllEmployees();
}
