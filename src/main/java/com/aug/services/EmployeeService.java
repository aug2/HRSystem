package com.aug.services;

import org.springframework.stereotype.Service;

import com.aug.entities.Employee;

@Service
public class EmployeeService {

	public boolean isLogin(Employee employee) {
		if ("admin@gmail.com".equalsIgnoreCase(employee.getEmail()))
			return true;
		return false;
	}
}
