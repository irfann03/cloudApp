package com.example.demo.Entity;


import java.time.LocalDateTime;

import com.example.demo.Enums.PaymentStatus;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RechargeHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transactionid;

    private float amount;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private LocalDateTime initatedOn = LocalDateTime.now();
}
