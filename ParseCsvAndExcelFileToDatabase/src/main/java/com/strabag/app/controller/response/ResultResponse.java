package com.strabag.app.controller.response;

import java.util.Date;

import com.strabag.app.entity.JobDetails.Status;


public class ResultResponse {

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public Date getJobCompletedDate() {
		return jobCompletedDate;
	}

	public void setJobCompletedDate(Date jobCompletedDate) {
		this.jobCompletedDate = jobCompletedDate;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	private int jobID;
	private Status status;
	private Date jobCompletedDate;
}
