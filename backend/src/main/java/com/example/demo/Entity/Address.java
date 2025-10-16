package com.example.demo.Entity;

import com.example.demo.Enums.AddressType;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addressId;

    private String details;

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    private double latitude;
    
    private boolean defaultAddress;

    @Enumerated(EnumType.STRING)
    private AddressType addressType;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}