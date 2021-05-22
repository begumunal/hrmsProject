package com.example.hrmsProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrmsProject.business.abstracts.JobTitlesService;
import com.example.hrmsProject.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/job_titles")
public class JobTitlesController {

	private JobTitlesService jobTitlesService;

	@Autowired
	public JobTitlesController(JobTitlesService jobTitlesService) {
		super();
		this.jobTitlesService = jobTitlesService;
	}
	
	public List<JobTitles> getAll(){
		return this.jobTitlesService.getAll();
	}
	
}
