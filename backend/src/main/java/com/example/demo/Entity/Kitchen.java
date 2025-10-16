package com.example.demo.Entity;


import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kitchen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer kitchenId;

    private String name;

    @Column(unique = true)
    private String phone;

    private String address;

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    private double latitude;
    
    @OneToMany(mappedBy = "kitchen", cascade = CascadeType.ALL)
    private List<Menu> menus = new ArrayList<>();
    
    @OneToMany(mappedBy = "kitchen", cascade = CascadeType.ALL)
    private List<MenuItems> menuItems = new ArrayList<>();
    
    @OneToMany(mappedBy = "kitchen", cascade = CascadeType.ALL)
    private List<Orders> orders = new ArrayList<>();
    
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
}
