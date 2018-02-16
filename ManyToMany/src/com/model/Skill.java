package com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

@Entity
@Table(name="skill_details")
public class Skill implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4631232365678321540L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="skill_id")
	private int id;
	private String name;
	private double version;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="skills"/*,fetch=FetchType.EAGER*/)
	private List<Employee> emps = new ArrayList<Employee>();
	
	
	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public Skill(int id, String name, double version) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
	}
	
	public Skill() {
		super();
	}
	
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

}
