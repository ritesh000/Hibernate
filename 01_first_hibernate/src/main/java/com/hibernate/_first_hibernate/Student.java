package com.hibernate._first_hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mysudent")
public class Student {
   
	@Id
	private int Sid;
	private String name;
	private String city;

	public Student(int sid, String name, String city) {
		super();
		Sid = sid;
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();

	}

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", name=" + name + ", city=" + city + "]";
	}

}
