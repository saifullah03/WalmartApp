package com.microtech.walmartapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Supplier {
    @Id
    @GeneratedValue
    private int id;
    private String name;
}
