package com.example.practice.services;

import java.util.List;
import java.util.Optional;


import com.example.practice.model.Milestone;

public interface MilestoneService {
	public Milestone saveMilestone(Milestone milestone);
	public List<Milestone> getAllMilestones();
	public void deleteMilestone(int milestone_id);
	public Optional<Milestone> getMilestone(int milestone_id);
	public Milestone updateMilestone(int milestone_id, String milestone_version);

}
