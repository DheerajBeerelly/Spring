package com.example.practice.services;

import java.util.List;
import java.util.Optional;

import com.example.practice.model.Application;

public interface ApplicationServices {

	public Application saveApplication(Application app);
	public List<Application> getAllApplications();
	public void deleteApplication(int application_id);
	public Optional<Application> getApplication(int application_id);
	public Application updateApplication(int application_id, String application_version);
	
}
