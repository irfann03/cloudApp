package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.*;

public interface WeeklyMenuRepository extends JpaRepository<WeeklyMenu, Integer>{

}
