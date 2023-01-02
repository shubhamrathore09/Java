package manyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void insert() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Course course=new Course();
		course.setCnmae("java");
		course.setFee(10000);
		
		Course course2=new Course();
		course2.setCnmae("pyhton");
		course2.setFee(12000);
		
		List<Course> courselist=new ArrayList<Course>();
		courselist.add(course2);
		courselist.add(course);
		
		
		Student s1=new Student();
		s1.setSname("shubham");
		s1.setCourse(courselist);
		
		Student s2=new Student();
		s2.setSname("banti");
		s2.setCourse(courselist);
		
		List<Student> studentlist=new ArrayList<Student>();
		
		studentlist.add(s2);
		studentlist.add(s1);
		
		em.persist(s1);
		em.persist(s2);
//		em.persist(course);
//		em.persist(course2);
		
		em.getTransaction().commit();
		em.close();
		
	}
	public static void main(String[] args) {
		insert();
	}
}
