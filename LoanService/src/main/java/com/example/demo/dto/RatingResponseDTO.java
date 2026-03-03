package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RatingResponseDTO {

    private Long customerId;
    private Integer financialYear;

    private Integer riskScore;
    private String riskLevel;
    private String rating;
}