package com.osgtools.demo.core.services.Impl;

import com.osgtools.demo.core.entities.Customer;
import com.osgtools.demo.core.repos.CustomerRepo;
import com.osgtools.demo.core.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Override
    public int customerCount() {
        return repo.findAll().size();
    }

    @Override
    public Long save(Customer customer) {
        repo.save(customer);
        return customer.getId();
    }
}
