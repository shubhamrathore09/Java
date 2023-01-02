package manyToOneMapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

//	public static void main(String[] args) {
//		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
//		EntityManager em=emf.createEntityManager();
//		em.getTransaction().begin();
//		Department d1=new Department();
//		Employee e1=new Employee();
//		d1.setDid(3);
//		d1.setDname("Hr");
//		e1.setDepartment(d1);
//		e1.setEname("shubham");
//		Employee e2=new Employee();
//		e2.setDepartment(d1);
//		e2.setEname("rajat");
//		Employee e3=new Employee();
//		e3.setDepartment(d1);
//		e3.setEname("banti");
//		em.persist(e3);
//		em.persist(e2);
//		em.persist(e1);
//		em.getTransaction().commit();
//		em.close();
//	}
}
