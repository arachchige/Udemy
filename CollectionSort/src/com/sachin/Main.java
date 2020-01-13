package com.sachin;

import java.util.Collections;
import java.util.List;

import com.sachin.student.Student;
import com.sachin.student.StudentData;

public class Main {

	public static void main(String[] args) {

		List<Student> studentList = StudentData.getStudents();

//		for(Student stList : studentList) {
//			System.out.println(stList);
//		}
//		System.out.println("\n");

		// lambda here!using collection sort

		Collections.sort(studentList, (Student o1, Student o2) -> o1.getAge() - o2.getAge());
		// java 8 only, lambda also, to print the List

		studentList.forEach((stList) -> System.out.println(stList));

		System.out.println("\n");

		// directly calling the collection list

		studentList.sort((Student o1, Student o2) -> o1.getAge() - o2.getAge());
		// java 8 only, lambda also, to print the List

		studentList.forEach((stList) -> System.out.println(stList));

		System.out.println("\n");

		// directly calling the collection Student list and sort by two properties

		Collections.sort(studentList, (Student o1, Student o2) -> {
			return o1.getAge().compareTo(o2.getAge()) - o1.getSex().compareTo(o2.getSex());

		});
		// java 8 only, lambda also, to print the List

		studentList.forEach((stList) -> System.out.println(stList));

		System.out.println("\n filter with sex");

		// directly calling the collection list

		studentList.sort((Student o1, Student o2) -> o1.getAge() - o2.getAge());

		// this will only print what we need(with condition) - in this case only males and print only names
		studentList.forEach((stList) -> {
			if (stList.getSex() == "male")
				System.out.println(stList.getName());
		});

	}

}
