package com.financial.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.financial.demo.entity.FinancialStatement;

public interface FinancialRepository
        extends JpaRepository<FinancialStatement, Long> {

    Optional<FinancialStatement> 
        findByCustomerIdAndFinancialYear(Long customerId, Integer year);
}