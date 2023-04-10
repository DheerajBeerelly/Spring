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

import com.example.practice.dao.MilestoneRepo;
import com.example.practice.model.Milestone;
import com.example.practice.services.MilestoneServiceImpl;

@RestController
@RequestMapping("/milestone")
public class MilestoneController {


	@Autowired
	MilestoneRepo mileRepo;
	@Autowired
	MilestoneServiceImpl mileService;
	
	@PostMapping("/add")
	public Milestone saveMilestone(@RequestBody Milestone milestone) {
		return mileService.saveMilestone(milestone);
	}
	
	@GetMapping("/all")
	public List<Milestone> getAllMilestones(){
		return mileService.getAllMilestones();
	}
	
	@GetMapping("/{milestone_id}")
	public Optional<Milestone> getMilestone(@PathVariable int milestone_id){
		return mileService.getMilestone(milestone_id);
	}
	
	@DeleteMapping("/delete/{milestone_id}")
	public void deleteMilestone(@PathVariable int milestone_id) {
		mileService.deleteMilestone(milestone_id);
	}
	
	@PutMapping("update/{milestone_id}")
	@ResponseBody
	public Milestone updateMilestone(@PathVariable int milestone_id , @RequestBody Milestone milestone) {
		return mileService.updateMilestone(milestone_id,milestone.getMilestone_version());
	}
}
