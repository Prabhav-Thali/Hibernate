package com.app.student;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int hno;
	private String State;

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		this.State = state;
	}

	public Address(int hno, String state) {
		super();
		this.hno = hno;
		this.State = state;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}
}
