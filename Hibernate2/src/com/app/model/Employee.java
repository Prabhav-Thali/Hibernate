package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "employee_details")
public class Employee {
	@Id
	// primary key is marked using this annotation
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int id;
	@Column(name = "employee_name")
	private String name;
	

	@Column(name = "employee_skills")
	private Skill skill;
//	private String skills;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Skill getSkills() {
		return skill;
	}

	public void setSkills(Skill skills) {
		this.skill = skills;
	}

	

}
