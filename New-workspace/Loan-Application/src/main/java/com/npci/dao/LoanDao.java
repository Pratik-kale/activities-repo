package com.npci.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.Loan;

public interface LoanDao extends JpaRepository<Loan, Integer> {

	Optional<Loan> findById(Long loanIdLong);

}
