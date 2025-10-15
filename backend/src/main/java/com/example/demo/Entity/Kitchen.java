package com.example.demo.Entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kitchen {

    @Id
    private Integer kitchenId;

    private String name;

    @Column(unique = true)
    private String phone;

    private String address;

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    private double latitude;
}
