package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

import com.example.demo.Enums.UserType;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSession {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sessionId;

    @Column(unique = true)
    private String token;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    private LocalDateTime starTime;
    private LocalDateTime endTime;
}
