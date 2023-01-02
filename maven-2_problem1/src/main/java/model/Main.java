package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void insert() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Employee e1=new Employee();
		e1.setGender("male");
		e1.setName("banti");
		e1.setSalary(7511);
		
		Employee e2=new Employee();
		e2.setGender("female");
		e2.setName("jagriti");
		e2.setSalary(78000);
		
		
		Employee e3=new Employee();
		e3.setGender("male");
		e3.setName("tarun");
		e3.setSalary(75171);
		
		Employee e4=new Employee();
		e4.setGender("female");
		e4.setName("rinki");
		e4.setSalary(78441);
		
		Address a1=new Address();
		a1.setCity("bhopal");
		a1.setPincode("466661");
		a1.setState("mp");
		a1.setType("home");
		
		Address a2=new Address();
		a2.setCity("sehore");
		a2.setPincode("445161");
		a2.setState("agara");
		a2.setType("office");
		
		Set<Address> set=new HashSet<Address>();
		set.add(a2);
		set.add(a1);
		
		e1.setEmpAddress(set);
		e2.setEmpAddress(set);
		e3.setEmpAddress(set);
		e4.setEmpAddress(set);
		
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		
		em.getTransaction().commit();
		em.close();
		

	}
	public static void main(String[] args) {
		insert();
	}

}
