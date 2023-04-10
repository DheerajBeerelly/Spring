package com.example.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer>{

}
