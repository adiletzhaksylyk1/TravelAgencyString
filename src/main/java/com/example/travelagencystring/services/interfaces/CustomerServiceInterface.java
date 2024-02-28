package com.example.travelagencystring.services.interfaces;

import com.example.travelagencystring.models.Customer;

import java.util.List;
public interface CustomerServiceInterface {
    List<Customer> getAll();
    Customer getById(int customerid);
    Customer create(Customer customer);
    List<Customer> getByLastname(String lastname);
}

