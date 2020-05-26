package com.educandoweb.course.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable{


	
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant timesatmp;
	private Integer status;
	private String name;
	private String message;
	private String path;
	
	
	public StandardError() {
		
	}


	public StandardError(Instant timesatmp, Integer status, String name, String message, String path) {
		super();
		this.timesatmp = timesatmp;
		this.status = status;
		this.name = name;
		this.message = message;
		this.path = path;
	}


	public Instant getTimesatmp() {
		return timesatmp;
	}


	public void setTimesatmp(Instant timesatmp) {
		this.timesatmp = timesatmp;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getPath() {
		return path;
	}


	public void setPath(String path) {
		this.path = path;
	}
	
}
