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

    public Supplier(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Supplier() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String print(){
        return "Hello Java";
    }
}
