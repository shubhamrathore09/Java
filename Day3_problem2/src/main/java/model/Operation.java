package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Operation {
	public static void insert() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Customer c1=new Customer();
		c1.setName("shubham");
		c1.setEmail("shubham@123");
		c1.setMobileNumber("5485");
		
		Customer c2=new Customer();
		c2.setName("banti");
		c2.setEmail("bani@123");
		c2.setMobileNumber("5485");
		
		Address a1=new Address("mp", "bhopal", "466661");
		Address a2=new Address("up", "lack", "6661");
		Address a3=new Address("up", "itaba", "66661");
		Address a4=new Address("delhi", "delhi", "4666");
		
		List<Address> l1=new ArrayList<Address>();
		l1.add(a1);
		l1.add(a2);
	
		List<Address> l2=new ArrayList<Address>();
		l2.add(a4);
		l2.add(a3);
		
		c1.setAddress(l1);
		c2.setAddress(l2);
		em.persist(c1);
		em.persist(c2);
		em.getTransaction().commit();
		em.close();
		
		
	}
	public static List<Address> getAllAddressByCustomerID() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select e from Customer e where e.cid=?1");
		query.setParameter(1, 1);
		
		List<Customer> a=query.getResultList();
		
		Customer customer=a.get(0);
		
		List<Address> list=customer.getAddress();
		return list;
		
	}
	public static void main(String[] args) {
	System.out.println(getAllAddressByCustomerID());
		
	}
}
