package com.npci.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.beans.CreditScore;

public interface CreditDao extends JpaRepository<CreditScore, Integer> {

}
