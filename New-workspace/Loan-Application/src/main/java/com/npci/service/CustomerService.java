package com.npci.service;

import java.util.List;

import com.npci.LoanApplication;
import com.npci.beans.Customer;

public interface CustomerService {
	
	Customer registerCustomer(Customer customer);
	
	String login(String emailId, String password);
	
	List<String> getAvailableLoans();
	
	LoanApplication applyLoan(int loanId, int customerId);
	
	String loanStatus();
	


}

  