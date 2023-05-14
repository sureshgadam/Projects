package com.example.Sample.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="number")
	private int number;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="salary")
	private long salary;
	
	@Column(name="email")
	private String email;

	public Employee(int number, String gender, long salary, String email) {
		super();
		this.number = number;
		this.gender = gender;
		this.salary = salary;
		this.email = email;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [number=" + number + ", gender=" + gender + ","
				+ " salary=" + salary + ", email=" + email + "]";
	}
	
	public Employee() {
		super();
	}
			
}
