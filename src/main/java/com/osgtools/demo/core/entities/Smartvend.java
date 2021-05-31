package com.osgtools.demo.core.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Smartvend {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Customer customer;

    private String name;

    @Override
    public String toString() {
        return "Smartvend{" +
                "id=" + id +
                ", customer=" + customer +
                ", name='" + name + '\'' +
                '}';
    }
}