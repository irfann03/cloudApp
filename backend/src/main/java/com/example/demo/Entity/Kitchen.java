package com.example.demo.Entity;


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
    
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
}
