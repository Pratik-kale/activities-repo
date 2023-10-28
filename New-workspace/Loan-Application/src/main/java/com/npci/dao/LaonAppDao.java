package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.LoanApplication;
import com.npci.beans.LoanApp;

public interface LaonAppDao extends JpaRepository<LoanApplication, Integer>{

	LoanApplication save(LoanApp loanApp);

	LoanApp findAllById(int applicationId);

}
