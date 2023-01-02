package hash_A_Mapping;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

//@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	@Embedded
	@ElementCollection
	@JoinTable(name = "address",joinColumns = @JoinColumn(name="roll"))
	private List<Address> list;

	public Student(int id, String name, List<Address> list) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
	}
	
	public Student( String name, List<Address> list) {
		
		this.name = name;
		this.list = list;
	}
	
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getList() {
		return list;
	}

	public void setList(List<Address> list) {
		this.list = list;
	}
	
	
	
}
