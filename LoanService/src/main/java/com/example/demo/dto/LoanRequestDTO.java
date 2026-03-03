package com.example.demo.dto;

import lombok.Data;

@Data
public class LoanRequestDTO {
    private Long customerId;
    private Integer financialYear;
    private Double requestedAmount;
}