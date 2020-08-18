package com.sys.service;

import com.sys.pojo.Customer;


public interface CustomerService {
    boolean insert(Customer customer);
    String getCustomerAddress(int userid);
    boolean addCustomersAddress(String address,int userid);
}
