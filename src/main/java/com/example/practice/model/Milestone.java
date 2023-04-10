package com.example.practice.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Milestone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int milestone_id;
	private String milestone_name;
	private String milestone_version;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Application application;
	
	public Application getApplication() {
		return application;
	}
	public void setApplication(Application application) {
		this.application = application;
	}
	public int getMilestone_id() {
		return milestone_id;
	}
	public void setMilestone_id(int milestone_id) {
		this.milestone_id = milestone_id;
	}
	public String getMilestone_name() {
		return milestone_name;
	}
	public void setMilestone_name(String milestone_name) {
		this.milestone_name = milestone_name;
	}
	public String getMilestone_version() {
		return milestone_version;
	}
	public void setMilestone_version(String milestone_version) {
		this.milestone_version = milestone_version;
	}
	
}
