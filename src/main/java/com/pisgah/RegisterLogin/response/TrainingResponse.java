package com.pisgah.RegisterLogin.response;

public class TrainingResponse {
	String message;
	Boolean status;
	public TrainingResponse(String message, Boolean status) {
		this.message = message;
		this.status = status;
	}
	public TrainingResponse() {
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "TrainingResponse [message=" + message + ", status=" + status + "]";
	}
	
	
	
}
