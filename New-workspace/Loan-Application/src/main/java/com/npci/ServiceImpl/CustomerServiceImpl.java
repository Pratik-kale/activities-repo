package com.npci.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.LoanApplication;
import com.npci.beans.Customer;
import com.npci.beans.Loan;
import com.npci.beans.LoanApp;
import com.npci.dao.CustomerDao;
import com.npci.dao.LaonAppDao;
import com.npci.dao.LoanDao;
import com.npci.service.CustomerService;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private LoanDao loanDao;
	
	private LaonAppDao loanAppDao;
	
	Customer customer = new Customer();

	@Override
	@Transactional
	public Customer registerCustomer(Customer customer) {		
		return customerDao.save(customer);
	}

	@Override
	public String login(String emailId, String password) {
		Customer cust = customerDao.findByEmailId(emailId);
		
		if(cust != null && cust.getPassword().equals(password)) {
			return "Login Successfull";
		}else
		return "Unauthorized emaild or Password";
	}

	@Override
	public List<String> getAvailableLoans() {
		
		 List<Loan> loans = loanDao.findAll();
		 
	        List<String> availableLoanTypes = new ArrayList<>();

	        
	        for (Loan loan : loans) {
	            if (loan.getLoanType() != null && !loan.getLoanType().isEmpty()) {
	                availableLoanTypes.add(loan.getLoanType());
	            }
	        }

	        return availableLoanTypes;

	        
	}

	@Override
	public LoanApplication applyLoan(int loanId, int customerId) {
		Customer cust = new Customer();
		
		
		LoanApp loanApp = new LoanApp();
		
		
		;
		loanApp.setStatus("Pending");
		System.out.println("success");
		
		return loanAppDao.save(loanApp);
	}

	@Override
	public String loanStatus() {
		LoanApp loanApp = new LoanApp();
		return loanApp.getStatus();
	}

	

	


		
		 
}
