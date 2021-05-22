package com.example.hrmsProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hrmsProject.business.abstracts.JobTitlesService;
import com.example.hrmsProject.dataAccess.abstracts.JobTitlesDao;
import com.example.hrmsProject.entities.concretes.JobTitles;

public class JobTitlesManager implements JobTitlesService{

	private JobTitlesDao jobTitlesDao;
	
	@Autowired
	public JobTitlesManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}


	@Override
	public List<JobTitles> getAll() {
		return this.jobTitlesDao.findAll();
	}

}
