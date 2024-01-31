package com.strabag.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.strabag.app.entity.JobDetails;

@Repository
public interface JobDetailsRepository extends JpaRepository<JobDetails, Integer> {

}
