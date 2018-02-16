package com.app.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

	@Column(name="Flatno")
	private int flatNo;
	@Column(name="locality")
	private String locality;
	@Column(name="state")
	private String state;
	@Column(name="pincode")
	private long pincode;

	public Address() {
		// TODO Auto-generated constructor stub

	}

	public Address(int flatNo, String locality, String state, long pincode) {
		super();
		this.flatNo = flatNo;
		this.locality = locality;
		this.state = state;
		this.pincode = pincode;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

}
