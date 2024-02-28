package com.example.travelagencystring.controllers;

import com.example.travelagencystring.models.Customer;
import com.example.travelagencystring.services.interfaces.CustomerServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")

public class CustomerController {

    private final CustomerServiceInterface service;

    public CustomerController(CustomerServiceInterface service) {
        this.service = service;
    }


    @GetMapping("/")
    public List<Customer> getAll(){
        return service.getAll();
    }

    @GetMapping("/{customerid}")
    public ResponseEntity<Customer> getById(@PathVariable("customerid") int customerid){
        Customer customer = service.getById(customerid);
        if(customer == null)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Customer> create(@RequestBody Customer customer){
        Customer createdCustomer = service.create(customer);
        if(createdCustomer == null)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/lastname/{lastname}")
    public List<Customer> getAllBySurname(@PathVariable("lastname") String lastname){
        return service.getByLastname(lastname);
    }

}
