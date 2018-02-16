package com.app.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;
import com.app.model.Skill;

public class Application {

	public static void main(String[] args) {

		List<Skill> skills = populateSkills();
		List<Employee> employees = populateEmployee(skills);

		SessionFactory sessionFactory = new Configuration().configure(
				"hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// Employee emp = (Employee) session.get(Employee.class, 1);
		session.
		for (Employee employee : employees) {
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

	private static List<Skill> populateSkills() {
		// TODO Auto-generated method stub
		List<Skill> skills = new ArrayList<Skill>();
		Skill skill1 = new Skill();
		skill1.setName("Java");
		skill1.setVersion(1.8);
		skills.add(skill1);

		Skill skill2 = new Skill();
		skill2.setName("hibernate");
		skill2.setVersion(1.8);
		skills.add(skill2);

		Skill skill3 = new Skill();
		skill3.setName("Javascript");
		skill3.setVersion(1.8);
		skills.add(skill3);
		return skills;
	}

	private static List<Employee> populateEmployee(List<Skill> skills) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		// emp1.setId(1);
		emp1.setName("Tom");
		emp1.setSkills(skills.get(2));
		employees.add(emp1);

		Employee emp2 = new Employee();
		// emp2.setId(2);
		emp2.setName("Jerry");
		emp1.setSkills(skills.get(1));

		employees.add(emp2);

		Employee emp3 = new Employee();
		// emp3.setId(3);
		emp3.setName("Harry");
		emp1.setSkills(skills.get(0));

		employees.add(emp3);

		return employees;
	}
}
