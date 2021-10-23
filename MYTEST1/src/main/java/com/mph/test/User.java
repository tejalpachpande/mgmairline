package com.mph.test;

public class User {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String ar[])
	{
		User u =new User();
		u.setName("tj");
		System.out.println(u.getName());
	}
	
	
	
	
}
