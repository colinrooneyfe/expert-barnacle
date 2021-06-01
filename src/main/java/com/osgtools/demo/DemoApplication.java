package com.osgtools.demo;

import com.osgtools.demo.core.entities.Customer;
import com.osgtools.demo.core.entities.Smartvend;
import com.osgtools.demo.core.repos.CustomerRepo;
import com.osgtools.demo.core.repos.SmartvendRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private SmartvendRepo smartvendRepo;

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

    }

    @RequestMapping("/")
    public String home() {

        makeEntityDemo();

        return "Hello Docker World. Test Data created!!";
    }


    @RequestMapping("/customer")
    public String customer() {
        return customerRepo.findById(1L).toString();
    }

    @RequestMapping("/vend")
    public String smartvend() {
        return smartvendRepo.findById(2L).toString();
    }

    // minor change to test github user used - again
    private void makeEntityDemo() {
        Customer depuy = new Customer();
        depuy.setAccountNo("J0125");
        depuy.setAccountName("Depuy");
        depuy.setCreditLimit(new BigDecimal(10000.00));
        depuy.setBalance(new BigDecimal(1000.00));
        customerRepo.save(depuy);

        Smartvend v1 = new Smartvend();
        v1.setName("VEND01");
        v1.setCustomer(depuy);
        smartvendRepo.save(v1);
    }

}