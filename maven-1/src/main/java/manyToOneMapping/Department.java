package manyToOneMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Department {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int did;
	private String dname;
	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	
	public Department( String dname) {
	
		this.dname = dname;
	}
	
	public Department() {
	
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}
