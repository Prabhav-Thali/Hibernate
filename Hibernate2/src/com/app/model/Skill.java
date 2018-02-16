package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Skill {
	@Id
	// primary key is marked using this annotation
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "skill_id")
	private int id;
	private String name;
	private double version;
	@Column(name = "employees")
	private Employee employee;

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

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public Skill(int id, String name, double version) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
	}

	public Skill() {
		// TODO Auto-generated constructor stub
	}

}
