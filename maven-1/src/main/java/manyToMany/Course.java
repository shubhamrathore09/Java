package manyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	private String cnmae;
	private int fee;
	
	@ManyToMany(mappedBy = "course",cascade = CascadeType.ALL)
	private List<Student> students;

	public Course(String cnmae, int fee, List<Student> students) {
		super();
		this.cnmae = cnmae;
		this.fee = fee;
		this.students = students;
	} 
	
	public Course( int fee, List<Student> students) {
		
		this.fee = fee;
		this.students = students;
	} 
	
	public Course() {

	}

	public String getCnmae() {
		return cnmae;
	}

	public void setCnmae(String cnmae) {
		this.cnmae = cnmae;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	} 
	
	
	
}
