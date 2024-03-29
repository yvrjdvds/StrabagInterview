package com.strabag.app.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class JobDetails {

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getJobStartDate() {
		return jobStartDate;
	}

	public void setJobStartDate(Date jobStartDate) {
		this.jobStartDate = jobStartDate;
	}

	public Date getJobCompletedDate() {
		return jobCompletedDate;
	}

	public void setJobCompletedDate(Date jobCompletedDate) {
		this.jobCompletedDate = jobCompletedDate;
	}

	public Status getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(Status jobStatus) {
		this.jobStatus = jobStatus;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobID;

	private String fileName;

	private Date jobStartDate;

	private Date jobCompletedDate;

	@Enumerated(EnumType.STRING)
	private Status jobStatus;

	public enum Status {
		START, COMPLETED, FAILURE;
	}

}
