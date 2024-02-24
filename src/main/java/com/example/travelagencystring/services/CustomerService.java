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
    public Customer getById(int customerId) {
        return repo.findById(customerId).orElse(null);
    }

    @Override
    public Customer create(Customer customer) {
        return repo.save(customer);
    }

    @Override
    public List<Customer> getByLastName(String lastName) {
        return repo.findByLastName(lastName);
    }
}
