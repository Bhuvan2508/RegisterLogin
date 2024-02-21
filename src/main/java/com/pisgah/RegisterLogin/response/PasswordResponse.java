package com.pisgah.RegisterLogin.response;

public class PasswordResponse {
	String message;

	public PasswordResponse(String message) {
		this.message = message;
	}

	public PasswordResponse() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PasswordResponse [message=" + message + "]";
	}
	
	
	
}
