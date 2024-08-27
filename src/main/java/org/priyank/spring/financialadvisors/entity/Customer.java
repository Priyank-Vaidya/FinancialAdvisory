package org.priyank.spring.financialadvisors.entity;

import jakarta.persistence.*;
import org.springframework.aop.Advisor;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_id;
    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisorId", nullable = false)
    private Advisor advisor;
    public Customer() {

    }

}
