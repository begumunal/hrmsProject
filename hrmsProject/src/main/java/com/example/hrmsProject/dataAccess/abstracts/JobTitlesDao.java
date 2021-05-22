package com.example.hrmsProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrmsProject.entities.concretes.JobTitles;

public interface JobTitlesDao extends JpaRepository<JobTitles, Integer>{

}
