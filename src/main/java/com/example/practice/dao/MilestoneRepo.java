package com.example.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.model.Milestone;

public interface MilestoneRepo extends JpaRepository<Milestone, Integer>{

}
