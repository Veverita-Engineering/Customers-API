package com.veveritaengineering.customers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {
    @GetMapping
    public List<Customer> findAllUsers() {
        List<Customer> list = new ArrayList<Customer>();
        list.add(new Customer("ACME International Ltd", "1231 Point Beach", "www.example.com"));
        return list;
    }
}
