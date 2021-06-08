package com.osgtools.demo.core.services;

import com.osgtools.demo.core.entities.Customer;
import org.springframework.stereotype.Service;

public interface CustomerService {

    int customerCount();

    Long save(Customer customer);

}
