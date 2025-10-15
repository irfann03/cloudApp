package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.*;

public interface UserSessionRepository extends JpaRepository<UserSession, Integer>{

}
