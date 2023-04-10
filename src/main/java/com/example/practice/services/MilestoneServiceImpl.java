package com.example.practice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.dao.MilestoneRepo;

import com.example.practice.model.Milestone;

@Service
public class MilestoneServiceImpl implements MilestoneService{

	
	@Autowired
	MilestoneRepo mileRepo;
	
	@Override
	public Milestone saveMilestone(Milestone milestone) {
		return mileRepo.save(milestone);
	}

	@Override
	public List<Milestone> getAllMilestones() {
		return mileRepo.findAll();
	}

	@Override
	public void deleteMilestone(int milestone_id) {
		mileRepo.deleteById(milestone_id);		
	}

	@Override
	public Optional<Milestone> getMilestone(int milestone_id) {

		return mileRepo.findById(milestone_id);
	}

	@Override
	public Milestone updateMilestone(int milestone_id, String milestone_version) {
		Milestone updateMilestone = mileRepo.findById(milestone_id).orElse(null);
		updateMilestone.setMilestone_version(milestone_version);
		return mileRepo.save(updateMilestone);
	}

}
