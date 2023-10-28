package com.npci.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CreditScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String pan; 

    @Column(nullable = false)
    private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "CreditScore [pan=" + pan + ", score=" + score + "]";
	}

	public CreditScore(String pan, int score) {
		super();
		this.pan = pan;
		this.score = score;
	}

	public CreditScore() {
		super();
		
	}
    
    

  
}

