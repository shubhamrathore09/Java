package manyToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import org.hibernate.annotations.ManyToAny;

//@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;

	public Employee(int eid, String ename, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}
	
	public Employee(String ename, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.department = department;
	}
	public Employee() {
	
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	
}
