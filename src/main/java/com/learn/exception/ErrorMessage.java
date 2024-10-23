package com.learn.exception;

import java.util.Date;

public class ErrorMessage {
	
	private Date timestemp;
	private String message;
	private String details;
	
	
	
	public ErrorMessage() {
		super();
	}

	public ErrorMessage(Date timestemp, String message, String details) {
		super();
		this.timestemp = timestemp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestemp() {
		return timestemp;
	}

	public void setTimestemp(Date timestemp) {
		this.timestemp = timestemp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
	
	

}
