package com.example.practice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.dao.ApplicationRepository;
import com.example.practice.model.Application;

@Service
public class ApplicationServicesImpl implements ApplicationServices {

	@Autowired
	ApplicationRepository appRepo;
	
	@Override
	public Application saveApplication(Application app) {
		System.out.println(app.getMilestoneList().toString());
		return appRepo.save(app);
	}

	@Override
	public List<Application> getAllApplications() {
		return appRepo.findAll();
	}

	@Override
	public void deleteApplication(int application_id) {
		appRepo.deleteById(application_id);
		
	}

	@Override
	public Optional<Application> getApplication(int application_id) {
		
		return appRepo.findById(application_id);
	}

	@Override
	public Application updateApplication(int application_id, String application_version) {
		Application updateApp = appRepo.findById(application_id).orElse(null);
		updateApp.setApplication_version(application_version);
		return appRepo.save(updateApp);
	}

}
