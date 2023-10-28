package com.npci.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId; 

    @Column(name = "employee_name",nullable = false)
    private String employeeName;

    @Column(name = "email_id",unique = true, nullable = false)
    private String emailId;

    @Column(nullable = false)
    private String password;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", password=" + password + "]";
	}

	public Employee(int employeeId, String employeeName, String emailId, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.password = password;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

    
}
