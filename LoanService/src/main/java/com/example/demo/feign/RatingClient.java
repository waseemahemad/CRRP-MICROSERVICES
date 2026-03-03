package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.RatingResponseDTO;

@FeignClient(name = "RATING")
public interface RatingClient {

    @GetMapping("/api/rating/{customerId}/{year}")
    RatingResponseDTO getRating(
            @PathVariable Long customerId,
            @PathVariable Integer year);
}