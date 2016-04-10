package com.solutioneers.voting.dto;

public class APIResponse {

	private long executionTimeInMillis;

	public long getExecutionTimeInMillis() {
		return executionTimeInMillis;
	}

	public void setExecutionTimeInMillis(long executionTimeInMillis) {
		this.executionTimeInMillis = executionTimeInMillis;
	}

	private Exception exception;

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	private transient long startTime = 0;

	public APIResponse() {
		this.startTime = System.currentTimeMillis();
	}

	public APIResponse computeTime() {
		long endTime = System.currentTimeMillis();
		this.executionTimeInMillis = endTime - startTime;
		return this;
	}

	private Object response;

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}
}
