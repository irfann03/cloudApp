package com.example.demo.Entity;

import java.time.LocalDate;

import com.example.demo.Enums.DayOfWeek;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeeklyMenu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int weeklyMenuId;

    LocalDate startOfWeek;

    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;
}
