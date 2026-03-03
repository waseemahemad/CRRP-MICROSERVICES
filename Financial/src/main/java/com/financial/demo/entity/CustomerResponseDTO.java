package com.financial.demo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerResponseDTO {
    private Long id;
    private String companyName;
    private String registrationNumber;
    private String industry;
    private String country;
    private Double annualTurnover;
    private Long parentCompanyId;
}