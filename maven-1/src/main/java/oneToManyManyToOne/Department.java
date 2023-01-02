package oneToManyManyToOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "department")
public class Department {

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	@Id
	private String name;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	private List<Employee> employee;

	public Department(int did, String name, List<Employee> employee) {
		super();
		this.did = did;
		this.name = name;
		this.employee = employee;
	}
	
	public Department( String name, List<Employee> employee) {
		
		this.name = name;
		this.employee = employee;
	}
	
	
	public Department() {
		
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
	
	
}
