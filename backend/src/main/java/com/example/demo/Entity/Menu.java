package com.example.demo.Entity;

import com.example.demo.Enums.MenuType;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer menuId;

    private String menuName;

    private Integer price;

    @Enumerated(EnumType.STRING)
    private MenuType nemuType;
}
