package com.sample.domain;

public class Message {

	private String id;
	private String message;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		System.out.println("now we r in message class toString method");
		return "Message [id=" + id + ", message=" + message + "]";
	}
	

}
