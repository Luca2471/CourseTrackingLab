package com.codeclan.example.BookingSystem.controllers;

import com.codeclan.example.BookingSystem.models.Customer;
import com.codeclan.example.BookingSystem.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/getAllCustomersByCourse")
    public List<Customer> getAllCustomersByCourse(@RequestParam Long id){
        return customerRepository.getAllCustomersByCourse(id);
    }
}
