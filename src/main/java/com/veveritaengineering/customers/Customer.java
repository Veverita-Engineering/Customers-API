package com.veveritaengineering.customers;

public class Customer {
    String customerName;

    String address;

    String website;

    public Customer(String customerName, String address, String website) {
        this.customerName = customerName;
        this.address = address;
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
