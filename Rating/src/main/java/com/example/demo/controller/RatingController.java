package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RatingResponseDTO;
import com.example.demo.service.RatingService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/rating")
@RequiredArgsConstructor
public class RatingController {

    private final RatingService service;

    @PostMapping("/{customerId}/{year}")
     public ResponseEntity<RatingResponseDTO> generate(
             @PathVariable Long customerId,
             @PathVariable Integer year) {
 
         return ResponseEntity.ok(
                 service.generateRating(customerId, year));
     }

     @GetMapping("/{customerId}/{year}")
     public ResponseEntity<RatingResponseDTO> getRating(
             @PathVariable Long customerId,
             @PathVariable Integer year) {
 
         return ResponseEntity.ok(
                 service.generateRating(customerId, year));
     }
}