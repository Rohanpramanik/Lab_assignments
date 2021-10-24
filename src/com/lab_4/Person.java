package com.lab_4;


public class Person 
{
	//declaring the fields as private, no one can acccess directly
	private String name;   
	private int age;
	
	public Person(String name, int age) 
	{
		this.name= name;
		this.age=age;
	}
	
	//Using toString method to override
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//declaring the getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
