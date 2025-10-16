package com.example.demo.Entity;

import com.example.demo.Enums.UserType;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer walletId;
    private float balance;

    @Enumerated(EnumType.STRING)
    private UserType userType;
    
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;
}
