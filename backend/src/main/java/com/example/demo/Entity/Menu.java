package com.example.demo.Entity;

import java.util.*;

import com.example.demo.Enums.MenuType;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
    
    @ManyToMany
    @JoinTable(
    		name = "menu_menuItems",
    		joinColumns = @JoinColumn(name = "menu_id"),
    		inverseJoinColumns = @JoinColumn(name = "menuItem_id")
    		)
    private List<MenuItems> menuItems = new ArrayList<>();
    
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<Orders> orders = new ArrayList<>();
    
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "kitchen_id")
    private Kitchen kitchen;
}
