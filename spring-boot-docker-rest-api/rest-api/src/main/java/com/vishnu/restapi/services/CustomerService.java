package com.vishnu.restapi.services;

import com.vishnu.restapi.api.v1.model.CustomerDTO;
import com.vishnu.restapi.domain.Customer;

import java.util.List;

/**
 * Customer Interface
 */
public interface CustomerService {

    // Get all customers
    List<CustomerDTO> getCustomers();

    // Get customer by id
    CustomerDTO getCustomerById(Long customerId);

    // Create new customer
    CustomerDTO createCustomer(CustomerDTO customerDTO);

    // Put customer
    CustomerDTO updateCustomer(Long customerId, CustomerDTO customerDTO);

    // Patch customer
    CustomerDTO patchCustomer(Long customerId, CustomerDTO customerDTO);

    void deleteCustomerById(Long customerId);
}
