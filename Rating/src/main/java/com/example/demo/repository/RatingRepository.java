package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CreditRating;

public interface RatingRepository
        extends JpaRepository<CreditRating, Long> {

    Optional<CreditRating>
        findByCustomerIdAndFinancialYear(Long customerId,
                                         Integer financialYear);
    
    
}