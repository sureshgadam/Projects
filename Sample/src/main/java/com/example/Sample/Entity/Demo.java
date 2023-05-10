package com.example.Sample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sample")
public class Demo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="Number")
    private int number;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Location")
	private String location;
	
	@Column(name="PhoneNumber")
	private Long phonenumber;

	public Demo(int number, String name, String location, Long phonenumber) {
		super();
		this.number = number;
		this.name = name;
		this.location = location;
		this.phonenumber = phonenumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "Demo [number=" + number + ", name=" + name + ","
				+ " location=" + location + ", phonenumber=" + phonenumber
				+ "]";
	}

	public Demo() {
		super();
	}
	
}
