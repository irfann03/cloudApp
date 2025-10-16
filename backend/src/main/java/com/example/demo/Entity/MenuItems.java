package com.example.demo.Entity;

import java.util.*;

import com.example.demo.Enums.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
    
    @ManyToMany(mappedBy = "menuItems")
    @JsonIgnore
    private List<Menu> menus = new ArrayList<>();
    
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "kitchen_id")
    private Kitchen kitchen;
}
