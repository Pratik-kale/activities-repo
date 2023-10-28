package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

	Customer findByEmailId(String emailId);

}
