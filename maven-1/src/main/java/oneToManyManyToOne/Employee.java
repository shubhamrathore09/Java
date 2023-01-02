package oneToManyManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="depa")
	private Department department;

	public Employee(int eid, String ename, int salary, Department department) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}

	public Employee(String ename, int salary, Department department) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.department = department;
	}

	public Employee() {
		super();
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	
}
