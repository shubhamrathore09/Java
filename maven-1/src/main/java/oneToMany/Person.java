package oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pid")

	private int id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user",joinColumns = @JoinColumn(name="pid"))
	private List<Number> number=new ArrayList<Number>();

	public Person(int id, String name, List<Number> number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	public Person( String name, List<Number> number) {
		this.name = name;
		this.number = number;
	}
	public Person() {

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

	public List<Number> getNumber() {
		return number;
	}

	public void setNumber(List<Number> number) {
		this.number = number;
	}
	
	
	
}
