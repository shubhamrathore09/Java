package oneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
//	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
//	EntityManager em=emf.createEntityManager();
//	em.getTransaction().begin();
//	
//	Person person=new Person();
////	person.setId(1);
//	person.setName("shubham");
//	
//	Number n1=new Number();
//	n1.setName("num1");
//	n1.setType(NumberType.Mobile);
////	n1.setPid(person.getId());
//	
//	Number n2=new Number();
//	n2.setName("num2");
//	n2.setType(NumberType.OfficeLandLine);
////	n2.setPid(person.getId());
//	
//	Number n3=new Number();
//	n3.setName("num3");
//	n3.setType(NumberType.LandLine);
////	n3.setPid(person.getId());
//	
//	List<Number> list=new ArrayList<Number>();
//	list.add(n3);
//	list.add(n1);
//	list.add(n2);
//	person.setNumber(list);
//	
//	em.persist(person);
//	em.getTransaction().commit();
//	em.close();
	
//	em.getTransaction().begin();
	

	
//	em.getTransaction().commit();
//	em.close();
	method();
	
}

public static void method() {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
	EntityManager em=emf.createEntityManager();
	Number n=em.find(Number.class, 2);

	
	
	}
}
