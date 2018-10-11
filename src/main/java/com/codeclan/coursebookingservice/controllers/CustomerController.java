package com.codeclan.coursebookingservice.controllers;

import com.codeclan.coursebookingservice.models.Customer;
import com.codeclan.coursebookingservice.repository.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{id}")
    public List<Customer> findCustomerByCourse(@PathVariable Long id){
        return customerRepository.findCustomersByCourse(id);
    }

}
