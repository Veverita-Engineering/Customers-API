package com.veveritaengineering.customers;

import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    public void shouldCreateInstance() {
        new Customer("Test", "Test address", "www.example.com");
    }

    @Test
    public void shouldCreateCustomerName() {
        String customerName = "Test Customer";
        Customer customer = new Customer(customerName, "Test address", "www.example.com");
        assert customer.getCustomerName().equals(customerName);
    }

    @Test
    public void shouldCreateCustomerAddress() {
        String customerAddress = "38751 Blackwell Street, Anchorage, AK";
        Customer customer = new Customer("Foo", customerAddress, "www.example.com");
        assert customer.getAddress().equals(customerAddress);
    }

    @Test
    public void shouldCreateCustomerWebsite() {
        String customerWebsite = "www.example.com";
        Customer customer = new Customer("Foo", "Foo 2", customerWebsite);
        assert customer.getWebsite().equals(customerWebsite);
    }
}
