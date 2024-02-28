package com.example.travelagencystring.services;
import com.example.travelagencystring.models.Customer;
import com.example.travelagencystring.repositories.CustomerRepositoryInterface;
import com.example.travelagencystring.services.interfaces.CustomerServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CustomerService implements CustomerServiceInterface {
    private final CustomerRepositoryInterface repo;

    public CustomerService(CustomerRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Customer> getAll() {
        return repo.findAll();
    }

    @Override
    public Customer getById(int customerid) {
        return repo.findById(customerid).orElse(null);
    }

    @Override
    public Customer create(Customer customer) {
        return repo.save(customer);
    }

    @Override
    public List<Customer> getByLastname(String lastname) {
        return repo.findByLastname(lastname);
    }
}
