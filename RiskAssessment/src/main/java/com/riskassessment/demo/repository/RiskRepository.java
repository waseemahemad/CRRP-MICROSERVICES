package com.riskassessment.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riskassessment.demo.entity.RiskAssessment;

@Repository
public interface RiskRepository extends JpaRepository<RiskAssessment, Long> {

    Optional<RiskAssessment> findByCustomerIdAndFinancialYear(
            Long customerId,
            Integer financialYear
    );
}