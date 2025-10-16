package com.example.demo.Entity;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;

    private String name;

    @Column(unique = true)
    private String phone;
    
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<Address> addresses = new ArrayList<>();
    
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<RechargeHistory> pastRecharge = new ArrayList<>();
    
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    List<WeeklyMenu> weeklyMenu = new ArrayList<>();
    
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
}