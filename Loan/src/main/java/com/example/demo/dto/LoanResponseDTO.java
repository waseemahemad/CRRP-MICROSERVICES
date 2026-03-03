package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoanResponseDTO {

    private Long customerId;
    private Double requestedAmount;
    private Double approvedAmount;
    private Double interestRate;
    private String riskLevel;
    private String rating;
    private String decisionStatus;
}