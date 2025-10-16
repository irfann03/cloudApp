package com.example.demo.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

import com.example.demo.Enums.UserType;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Users {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;

	    @Column(nullable = false, unique = true)
	    private String email;

	    @Column(nullable = false)
	    private String password;

	    @Enumerated(EnumType.STRING)
	    private UserType userType;
	    
	    private LocalDateTime createdAt = LocalDateTime.now();

	    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	    private Wallet wallet;
	    
	    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	    private Customer customer;
	    
	    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	    private Kitchen kitchen;
	    
	}
