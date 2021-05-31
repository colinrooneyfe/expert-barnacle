package com.osgtools.demo.core.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter @Setter
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String accountNo;
    private String accountName;

    private BigDecimal creditLimit;
    private BigDecimal balance;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", accountNo='" + accountNo + '\'' +
                ", accountName='" + accountName + '\'' +
                ", creditLimit=" + creditLimit +
                ", balance=" + balance +
                '}';
    }
}
