package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.services.EmployeeService;
@Service

public class EmployeeServiceImpl implements EmployeeService {
private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
	super();
	this.employeeRepository = employeeRepository;
}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
	//	Optional <Employee> employee= employeeRepository.findById(id);
		//if(employee.isPresent()) {
			//return Employee.get();
		//}else {
			//throw new ResourceNotFoundException("employee", "id",id );
	//	}
		return employeeRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("employee", "id",id ));
	}

	
}
