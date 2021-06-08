package com.osgtools.demo;


import com.osgtools.demo.core.entities.Customer;
import com.osgtools.demo.core.repos.CustomerRepo;
import com.osgtools.demo.core.services.CustomerService;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Optional;

@SpringBootTest
public class CustomerTest {

    @Autowired
    private CustomerService service;

    @Autowired
    private CustomerRepo repo;

    //@Test
    public void customerEmptyTest() {
        int count = service.customerCount();
        Assertions.assertEquals(count,0);
    }

    @Test
    public void customerCreateOneTest() {
        int count = service.customerCount();
        Customer customer1 = new Customer();
        customer1.setAccountNo("A0001");
        customer1.setAccountName("TEST CUSTOMER");
        customer1.setBalance(new BigDecimal(0.0));
        customer1.setCreditLimit(new BigDecimal(5000.0));

        Long custId = service.save(customer1);

        Assertions.assertEquals(custId,1);
    }

    @Test
    public void customerCreateTwoTest() {

        Customer customer1 = new Customer();
        customer1.setAccountNo("A0001");
        customer1.setAccountName("TEST CUSTOMER");
        customer1.setBalance(new BigDecimal("0.00"));
        customer1.setCreditLimit(new BigDecimal("5000.00"));

        repo.saveAndFlush(customer1);

        Customer customer2 = repo.findById(customer1.getId())
                                .orElse(null);
        Assertions.assertEquals(customer1, (Customer) customer2);

    }


    @Test
    public void contextLoads() {
    }
}
