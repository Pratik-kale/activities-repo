package com.npci.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.npci.LoanApplication;
import com.npci.beans.Customer;
import com.npci.beans.Loan;
import com.npci.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerSvc;
	
	@PostMapping(path = "/register")
	public ResponseEntity<Object> registerCustomer(@RequestBody Customer customer) {
		Customer cust = customerSvc.registerCustomer(customer);
		return ResponseEntity.status(200).body(cust);
		
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<Object> login(@RequestParam String emailId, @RequestParam String password){
		String cust = customerSvc.login(emailId, password);
		if (cust != null) {
	        return ResponseEntity.status(HttpStatus.OK).body(cust);
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not available with above credentials");
	    }
		
	}
	
	@GetMapping("/viewLoan")
	public ResponseEntity<Object> getAvailableLoans(){
		List<String> cust = customerSvc.getAvailableLoans();
		return ResponseEntity.status(200).body(cust);
	}
	
	@PostMapping("/applyLoan")
	public ResponseEntity<Object> applyLaon(@RequestParam int loanId, @RequestParam int customerId){
		LoanApplication cust = customerSvc.applyLoan(loanId, customerId);
		return ResponseEntity.status(200).body(cust);
		
	}
	@GetMapping("/loanStatus")
	public ResponseEntity<Object> loanStatus(){
		String cust = customerSvc.loanStatus();
		return ResponseEntity.status(200).body(cust);
		
	}
	
	
	

}
