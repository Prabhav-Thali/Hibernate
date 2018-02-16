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
public class Student {
	@Id
	// primary key is marked using this annotation
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int id;
	@Column(name = "employee_name")
	private String name;
	// @Column(name = "employee_address")
	// @Embedded
	// private Address address;
	//
	// @Embedded
	// @AttributeOverrides({
	// @AttributeOverride(column=@Column(name="home_flatNo"),name="flatNo"),
	// @AttributeOverride(column=@Column(name="home_locality"),name="locality"),
	// @AttributeOverride(column=@Column(name="home_state"),name="state"),
	// @AttributeOverride(column=@Column(name="home_pin"),name="pincode")
	// })
	// private Address HomeAddress;

	@ElementCollection
	@JoinTable(name = "address_details", joinColumns = @JoinColumn(name = "empID"))
	@CollectionId(columns = { @Column(name = "address_id") }, generator = "addr_id", type = @Type(type = "int"))
	@GenericGenerator(name = "addr_id", strategy = "sequence")
	private List<Address> address = new ArrayList<Address>();

	@Column(name = "employee_skills")
	private String skills;

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

	// public Address getAddress() {
	// return address;
	// }
	//
	// public void setAddress(Address address) {
	// this.address = address;
	// }
	public List<Address> getHomeAddress() {
		return address;
	}

	public void setHomeAddress(List<Address> address) {
		this.address = address;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
