package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.RiskResponseDTO;

@FeignClient(name = "RISKASSESSMENT")
public interface RiskClient {

    @PostMapping("/api/risk/{customerId}/{year}")
    RiskResponseDTO assessRisk(
            @PathVariable Long customerId,
            @PathVariable Integer year);
}