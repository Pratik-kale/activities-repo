package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	Employee findByEmailId(String emailId);

}
