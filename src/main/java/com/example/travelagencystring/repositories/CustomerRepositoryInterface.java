package com.example.travelagencystring.repositories;

import com.example.travelagencystring.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepositoryInterface extends JpaRepository<Customer, Integer> {
    List<Customer> findByLastname(String lastname);
    
}
