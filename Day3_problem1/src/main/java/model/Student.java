package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll;
	private String name;
	private String email;
	private String number;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cid")
	private College college;

	public Student(int roll, String name, String email, String number, College college) {
		super();
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.number = number;
		this.college = college;
	}

	public Student(String name, String email, String number, College college) {
		super();
		this.name = name;
		this.email = email;
		this.number = number;
		this.college = college;
	}

	public Student() {
		super();
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", email=" + email + ", number=" + number + "]";
	}



}
