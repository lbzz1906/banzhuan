package com.sys.service.impl;

import com.sys.dao.CustomerMapper;
import com.sys.pojo.Customer;
import com.sys.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public boolean insert(Customer customer){
        boolean flag=false;

        int num=customerMapper.insert(customer);
        if(num>0){
            flag=true;
        }
        return flag;
    }
}
