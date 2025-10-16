package com.example.demo.Entity;

import java.time.LocalDateTime;

import com.example.demo.Enums.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @JsonIgnore
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "kitchen_id", nullable = false)
    @JsonIgnore
    private Kitchen kitchen;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menu menu;

    private Integer quantity;

    private Double totalAmount;

    @Enumerated(EnumType.STRING)
    private OrderStatus status; // PLACED, CONFIRMED, CANCELLED, DELIVERED

    private LocalDateTime orderDate;

    private LocalDateTime deliveryDate;
}
