package edu.northeastern.cs5200.controllers.hello;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;
@Entity(name="hello")
public class HelloObject{
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	private String message;
    public HelloObject() {
}
public HelloObject(String message) {
	super();
	this.message=message;
}

public String getmessage() {
	return message;
}
public void setmessage(String message) {
	this.message=message;
}
}

