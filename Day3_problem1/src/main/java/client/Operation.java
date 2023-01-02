package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.College;
import model.Student;

public class Operation {
	
	public  void insert() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		College c1=new College();
		College c2=new College();
		
		c1.setCaddress("bhopal");
		c1.setCname("sistec");
		
		c2.setCaddress("sehore");
		c2.setCname("sai");
		
		Student s1=new Student("shubham", "shubham@123", "8357888995", c1);
		Student s2=new Student("hemant", "hemant@123", "8357888995", c1);
		Student s3=new Student("nikhil", "nikhil@123", "8357888995", c1);
		Student s4=new Student("sonu", "sonu@123", "8357888995", c1);
		
		List<Student> list1=new ArrayList<Student>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		c1.setList(list1);
		
		Student s5=new Student("rohit", "rohit@123", "7540", c2);
		Student s6=new Student("sagar", "sagar@123", "86940", c2);
		Student s7=new Student("lokesh", "lokesh@123", "789950", c2);
		Student s8=new Student("tarun", "raghu@123", "954540", c2);
		
		List<Student> list2=new ArrayList<Student>();
		list2.add(s5);
		list2.add(s6);
		list2.add(s7);
		list2.add(s8);
		c2.setList(list2);
		
		em.persist(c1);
		em.persist(c2);
		
		em.getTransaction().commit();
		em.close();

	}
	
	public List<Student> getAllStudentByCollegeId(int id) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createNativeQuery("select * from Student where cid=?1",Student.class);
		query.setParameter(1, id);
		List<Student> list=query.getResultList();
	
		return list;
		}
		

	public College GetCollegeDetails(int roll) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("select s from Student s where s.roll=?1");
		query.setParameter(1, roll);
		List<Student> list=query.getResultList();
		College college=new College();
		for(Student i:list) {
			college=i.getCollege();
		}
	return college;
		
	}	

}
