package com.app.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Address;
import com.app.model.Student;

public class Application {

	public static void main(String[] args) {

		List<Student> employees = populateEmployee();

		SessionFactory sessionFactory = new Configuration().configure(
				"hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// Employee emp = (Employee) session.get(Employee.class, 1);

		for (Student employee : employees) {
			session.save(employee);
		}

		// DELETE
		// Employee emp = (Employee) session.get(Employee.class, 2);
		// session.delete(emp);

		// UPDATE
		// Employee emp = (Employee) session.get(Employee.class, 3);
		// emp.setSkills("IOT,NODE.JS");
		// session.update(emp);

		session.getTransaction().commit();

		session.close();
		sessionFactory.close();
		// System.out.println("*********************************");
		// System.out.println(emp.getName() + " : " + emp.getSkills());

	}

	private static List<Student> populateEmployee() {
		// TODO Auto-generated method stub
		List<Student> employees = new ArrayList<Student>();
		Student emp1 = new Student();
		// emp1.setId(1);
		emp1.setName("Tom");
		emp1.setSkills("Spring,Hibernate");
		emp1.getHomeAddress().add(new Address(77, "abc", "Goa", 405434));
		emp1.getHomeAddress().add(new Address(1, "sdsd", "Goa", 404343));
		// emp1.setAddress(new Address(77,"abc","Goa",405434));
		// emp1.setHomeAddress(new Address(1,"sdsd","Goa",404343));
		employees.add(emp1);

		Student emp2 = new Student();
		// emp2.setId(2);
		emp2.setName("Jerry");
		emp2.setSkills("Spring,Hibernate");
		emp2.getHomeAddress().add(new Address(80, "xyz", "afdff", 450434));
		emp2.getHomeAddress().add(new Address(2, "sdfd", "Goa", 434343));
		// emp2.setAddress(new Address(80,"xyz","afdff",450434));
		// emp2.setHomeAddress(new Address(2,"sdfd","Goa",434343));
		employees.add(emp2);

		Student emp3 = new Student();
		// emp3.setId(3);
		emp3.setName("Harry");
		emp3.setSkills("Spring,Hibernate");
		emp3.getHomeAddress().add(new Address(90, "pqr", "MAHA", 400000));
		emp3.getHomeAddress().add(new Address(1, "sgdgd", "Goa", 404343));
		// emp3.setAddress(new Address(90,"pqr","MAHA",400000));
		// emp3.setHomeAddress(new Address(1,"sgdgd","Goa",404343));
		employees.add(emp3);

		return employees;
	}
}
