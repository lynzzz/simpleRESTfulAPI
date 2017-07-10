package com.catbear.restfulAPI.model;

public class Client {

	private long id;


	private String name;
	private int age;
	

	public Client() {
	}
	
	public Client(long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public long getId() {
		return id;
	}


}
