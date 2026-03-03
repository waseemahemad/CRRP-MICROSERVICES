package com.customer.demo.service;

import org.springframework.stereotype.Service;

import com.customer.demo.entity.Customer;
import com.customer.demo.entity.CustomerRequestDTO;
import com.customer.demo.entity.CustomerResponseDTO;
import com.customer.demo.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerResponseDTO createCustomer(CustomerRequestDTO dto) {

        Customer parent = null;
        if (dto.getParentCompanyId() != null) {
            parent = repository.findById(dto.getParentCompanyId())
                    .orElseThrow(() -> new RuntimeException("Parent not found"));
        }

        Customer customer = Customer.builder()
                .companyName(dto.getCompanyName())
                .registrationNumber(dto.getRegistrationNumber())
                .industry(dto.getIndustry())
                .country(dto.getCountry())
                .annualTurnover(dto.getAnnualTurnover())
                .parentCompany(parent)
                .build();

        Customer saved = repository.save(customer);

        return mapToDTO(saved);
    }

    public CustomerResponseDTO getCustomer(Long id) {
        return repository.findById(id)
                .map(this::mapToDTO)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    private CustomerResponseDTO mapToDTO(Customer customer) {
        return CustomerResponseDTO.builder()
                .id(customer.getId())
                .companyName(customer.getCompanyName())
                .registrationNumber(customer.getRegistrationNumber())
                .industry(customer.getIndustry())
                .country(customer.getCountry())
                .annualTurnover(customer.getAnnualTurnover())
                .parentCompanyId(
                        customer.getParentCompany() != null ?
                                customer.getParentCompany().getId() : null)
                .build();
    }
}