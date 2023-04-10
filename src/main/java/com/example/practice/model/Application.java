package com.example.practice.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Application {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int application_id;
	private String application_name;
	private String application_version;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "application")
	private List<Milestone> milestoneList;
	
	public List<Milestone> getMilestoneList() {
		return milestoneList;
	}
	
	public void setMilestoneList(List<Milestone> milestoneList) {
		this.milestoneList = milestoneList;
	}
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	public String getApplication_name() {
		return application_name;
	}
	public void setApplication_name(String application_name) {
		this.application_name = application_name;
	}
	public String getApplication_version() {
		return application_version;
	}
	public void setApplication_version(String application_version) {
		this.application_version = application_version;
	}
	
}
