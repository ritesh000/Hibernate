package com.hibernate.Embedtable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student2")
public class student {

	@Id
	@Column(name = "s_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sid;
	@Column(name = "S_name", length = 30, nullable = true)
	private String Sname;
	private String Ssection;
	address addres;
	public student(int sid, String sname, String ssection, address addres) {
		super();
		Sid = sid;
		Sname = sname;
		Ssection = ssection;
		this.addres = addres;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSsection() {
		return Ssection;
	}
	public void setSsection(String ssection) {
		Ssection = ssection;
	}
	public address getAddres() {
		return addres;
	}
	public void setAddres(address addres) {
		this.addres = addres;
	}
	@Override
	public String toString() {
		return "student [Sid=" + Sid + ", Sname=" + Sname + ", Ssection=" + Ssection + ", addres=" + addres + "]";
	}
	
	

}
