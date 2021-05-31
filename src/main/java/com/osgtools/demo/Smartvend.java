package com.osgtools.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Smartvend {

    @Id
    private Long id;

    private String name;

}