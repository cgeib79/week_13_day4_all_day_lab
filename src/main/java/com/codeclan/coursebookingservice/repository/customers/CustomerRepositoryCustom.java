package com.codeclan.coursebookingservice.repository.customers;

import com.codeclan.coursebookingservice.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersByCourse(Long courseId);

    List<Customer> findCustomerByTownByCourse(String town, Long courseId);
}
