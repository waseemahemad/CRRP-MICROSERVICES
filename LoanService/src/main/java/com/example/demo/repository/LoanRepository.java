package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

	List<Loan> findByCustomerId(Long customerId);

    // decisionStatus exists in entity
    List<Loan> findByDecisionStatus(String decisionStatus);

    // rating exists in entity
    List<Loan> findByRating(String rating);

    List<Loan> findByRiskScoreGreaterThan(Integer riskScore);

}