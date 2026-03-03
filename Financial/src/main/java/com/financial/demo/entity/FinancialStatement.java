package com.financial.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "financial_statements",
       uniqueConstraints = @UniqueConstraint(columnNames = {"customerId", "financialYear"}))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FinancialStatement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private Integer financialYear;

    private Double totalAssets;
    private Double totalLiabilities;
    private Double totalEquity;

    private Double revenue;
    private Double netProfit;

    private Double currentAssets;
    private Double currentLiabilities;

    private Double interestExpense;
    private Double ebit;
}