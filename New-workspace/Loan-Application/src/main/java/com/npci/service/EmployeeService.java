package com.npci.service;

import com.npci.beans.LoanApp;

public interface EmployeeService {
	
	String empLogin(String emailId, String password);
	
	String updateLoanApp();
	
	int viewCredit();
	
	LoanApp viewLoanApplication(int applicationId, int customerId);
	

}
