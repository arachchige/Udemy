package com.sachin.student;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
	
	public static List<Student> getStudents() {

		List<Student> studentData = new ArrayList<>();
	
	studentData.add(new Student("sachin", 5, "male"));
	studentData.add(new Student("david", 10, "male"));
	studentData.add(new Student("kumu", 4, "female"));
	studentData.add(new Student("jose", 4, "male"));
	studentData.add(new Student("payal", 9, "female"));
	return studentData;

}
}
