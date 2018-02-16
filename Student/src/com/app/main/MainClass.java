package com.app.main;

import java.util.ArrayList;
import java.util.List;

import com.app.student.Address;
import com.app.student.Student;
import com.app.utils.functions;

public class MainClass {
	public static void main(String[] args) {
		
		functions f = new functions();f.session();
		List<Student> students = populateStudents();
		
		System.out.println(students);
		f.get(students);
		f.comclose();
		
	}
	public static List<Student> populateStudents() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		Student std1 = new Student();
		std1.setRollNo(1);
		std1.setName("abc");
		std1.setAddress(new Address(1, "sdd"));
		students.add(std1);

		Student std2 = new Student();
		std2.setRollNo(2);
		std2.setAddress(new Address(2, "dhsv"));
		std2.setName("xyz");
		students.add(std2);

		Student std3 = new Student();
		std1.setRollNo(3);
		std1.setAddress(new Address(3, "sdsds"));
		std1.setName("pqr");
		students.add(std3);

		return students;
	}

}
