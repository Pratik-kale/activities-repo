package com.npci.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LoanApp {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private int applicationId; 
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name = "loan_id")
    private Loan loanId;

    @Column(nullable = false)
    private String status;

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Loan getLoanId() {
		return loanId;
	}

	public void setLoanId(Loan loanId) {
		this.loanId = loanId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanApp [applicationId=" + applicationId + ", customerId=" + customerId + ", loanId=" + loanId
				+ ", status=" + status + "]";
	}

	public LoanApp(int applicationId, Customer customerId, Loan loanId, String status) {
		super();
		this.applicationId = applicationId;
		this.customerId = customerId;
		this.loanId = loanId;
		this.status = status;
	}

	public LoanApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	}
