package manyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Course> course;

	public Student(int sid, String sname, List<Course> course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
	}	
	public Student( String sname, List<Course> course) {
		this.sname = sname;
		this.course = course;
	}
	public Student() {
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	
	
	
}
