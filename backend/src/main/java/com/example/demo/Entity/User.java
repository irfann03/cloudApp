package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

import com.example.demo.Enums.UserType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userid;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    private LocalDateTime createdAt = LocalDateTime.now();
}
