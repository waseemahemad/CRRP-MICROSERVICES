package com.customer.demo.entity;

import lombok.Data;

@Data
public class CustomerRequestDTO {
    private String companyName;
    private String registrationNumber;
    private String industry;
    private String country;
    private Double annualTurnover;
    private Long parentCompanyId;
}