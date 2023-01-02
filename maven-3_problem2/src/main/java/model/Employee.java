package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
//@NamedQuery(query = "select e from Employee e INNER JOIN e.address a where a.emp_id=e.empID AND a.state=:state", name = "add")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empID;
	private String name;
	private String gender;
	private int salary;
	
	@Embedded
	@ElementCollection
	@JoinTable(name="address",joinColumns = @JoinColumn(name="emp_id"))
	private Set<Address> empAddress = new HashSet();

	public Employee(int empID, String name, String gender, int salary, Set<Address> empAddress) {
		super();
		this.empID = empID;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.empAddress = empAddress;
	}

	public Employee(String name, String gender, int salary, Set<Address> empAddress) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.empAddress = empAddress;
	}

	public Employee() {
		super();
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Address> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Set<Address> empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", gender=" + gender + ", salary=" + salary
				+ ", empAddress=" + empAddress + "]";
	}
	
	
	
	
}
