package com.osgtools.demo.core.repos;

import com.osgtools.demo.core.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

}
