package oneToManyManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
	public static void insert() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Department department=new Department();
		department.setName("Hr");
//		department.setDid(1);
		Department department2=new Department();
		department2.setName("it");
//		department2.setDid(2);
		
		Employee e1 =new Employee("shubham",45000 ,department);
		Employee e2=new Employee("rajat",450000, department);
		
		Employee e3=new Employee("rahul", 500000, department2);
		Employee e4=new Employee("banti",80000,department2);
		
		List<Employee> l2=new ArrayList<Employee>();
		l2.add(e4);
		l2.add(e3);
		department2.setEmployee(l2);
		
		List<Employee> l1=new ArrayList<Employee>();
		l1.add(e2);
		l1.add(e1);
		department.setEmployee(l1);
		
		em.persist(department);
		em.persist(department2);
		
		em.getTransaction().commit();
		em.close();
		
		
	}
	public static void method() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select e from Employee e");
		List<Employee> list=query.getResultList();
		int sum=0;
		for(Employee i:list) {
			if(i.getDepartment().getName()=="Hr") {
				sum+=i.getSalary();
			}
		}
		System.out.println(sum);
		
	}
	
public static void main(String[] args) {
//	insert();
	method();
}
}
