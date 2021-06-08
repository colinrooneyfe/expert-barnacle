package com.osgtools.demo.core.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Getter @Setter
public class Customer {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(accountNo, customer.accountNo) && Objects.equals(accountName, customer.accountName) && Objects.equals(creditLimit, customer.creditLimit) && Objects.equals(balance, customer.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNo, accountName, creditLimit, balance);
    }

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
