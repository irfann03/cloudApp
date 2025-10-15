package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private Integer customerid;

    private String name;

    @Column(unique = true)
    private String phone;
}