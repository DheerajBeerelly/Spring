package com.example.practice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.dao.ApplicationRepository;
import com.example.practice.model.Application;
import com.example.practice.services.ApplicationServicesImpl;

@RestController
@RequestMapping("/application")
public class ApplicationController {

	@Autowired
	ApplicationRepository appRepo;
	@Autowired
	ApplicationServicesImpl appService;
	
	@PostMapping("/add")
	@ResponseBody
	public Application saveApplication(@RequestBody Application app) {
		return appService.saveApplication(app);
	}
	
	@GetMapping("/all")
	public List<Application> getAllApplications(){
		return appService.getAllApplications();
	}
	
	@GetMapping("/{application_id}")
	public Optional<Application> getApplication(@PathVariable int application_id){
		return appService.getApplication(application_id);
	}
	
	@DeleteMapping("/delete/{application_id}")
	public void deleteApplication(@PathVariable int application_id) {
		appService.deleteApplication(application_id);
	}
	
	@PutMapping("update/{application_id}")
	@ResponseBody
	public Application updateApplication(@PathVariable int application_id , @RequestBody Application app) {
		return appService.updateApplication(application_id,app.getApplication_version());
	}
}
