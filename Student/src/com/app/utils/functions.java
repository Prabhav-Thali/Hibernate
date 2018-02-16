package com.app.utils;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.student.Student;

public class functions {
	Session session;
	SessionFactory sessionFactory;

	public void session() {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();

		session = sessionFactory.openSession();
		session.beginTransaction();

	}

	public void get(List<Student> students) {
		// Student std = (Student) session.get(Student.class, 1);
		System.out.println(students);
		for (Student std : students) {
			session.save(std);
		}

	}

	public void delete() {
		// DELETE
		Student std = (Student) session.get(Student.class, 2);
		session.delete(std);
	}

	public void update() {
		// UPDATE
		Student emp = (Student) session.get(Student.class, 3);
		emp.setName("sdsbdsjd");
		session.update(emp);
	}

	public void comclose() {
		session.getTransaction().commit();

		session.close();
		sessionFactory.close();
	}

	// System.out.println("*********************************");
	// System.out.println(emp.getName() + " : " + emp.getSkills());

}
