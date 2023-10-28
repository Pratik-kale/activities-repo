package com.npci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.npci.beans.LoanApp;
import com.npci.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empSvc;
	
	@PostMapping(path = "/login")
	public ResponseEntity<Object> login(@RequestParam String emailId, @RequestParam String password){
		String cust = empSvc.empLogin(emailId, password);
		if (cust != null) {
	        return ResponseEntity.status(HttpStatus.OK).body(cust);
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not available with above credentials");
	    }
		
	
	}
	@GetMapping(path = "/updateStatus")
	public ResponseEntity<Object> updateLoanApp(){
		String cust = empSvc.updateLoanApp();
		return ResponseEntity.status(200).body(cust);	
	}
	
	@GetMapping(path = "/viewCreditScore")
	public ResponseEntity<Object> viewCreditScore(){
		int cust = empSvc.viewCredit();
		return ResponseEntity.status(200).body(cust);
		
	}
	
	@PostMapping(path = "/viewLoanApplication")
	public ResponseEntity<Object> viewLoanApplication(@RequestParam int applicationId,@RequestParam int customerId){
		LoanApp cust = empSvc.viewLoanApplication(applicationId, customerId);
		return ResponseEntity.status(200).body(cust);
		
	
	
	
}

}
