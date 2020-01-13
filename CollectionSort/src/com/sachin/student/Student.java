package com.sachin.student;

public class Student {
	
	
	private String name;
	private Integer age;
	private String Sex;
	
	
	public Student(String name, Integer age, String sex) {
		
		this.name = name;
		this.age = age;
		Sex = sex;
	
	
	}
	
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getSex() {
		return Sex;
	}
	@Override
	public String toString() {
		return "name=" + name + ", \tage=" + age + ",\tSex=" + Sex ;
	}
	

}
