package com.example.demo.Entity;

import com.example.demo.Enums.*;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuItems {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer menuItemId;

    private String name;
    private int price;
    
    @Enumerated(EnumType.STRING)
    private MenuItemType itemType; // TIFFIN,LUNCH,DINNER

    @Enumerated(EnumType.STRING)
    private MenuType menuType; //VEG,NON_VEG
}
