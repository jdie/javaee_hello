package ru.shangin.beans;

public class Hello {
	
	private String message;
	 
	public void setMessage(String message) {
		this.message = message;
	}

	public String printHello() {
		return "Hello " + message;
	}
}

