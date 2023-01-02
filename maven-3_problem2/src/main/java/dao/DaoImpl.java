package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import emu.Emu;
import exception.EmployeeException;
import model.Address;
import model.Employee;

public class DaoImpl implements Dao{

	public List<Employee> getAllEmployee() throws EmployeeException {
		EntityManager em=Emu.provide();
		
		Query query=em.createQuery("select e from Employee e");
		List<Employee> list=query.getResultList();
		if(list==null) {
			throw new EmployeeException("no entry are there");
		}
		else {
			return list;
		}
		
	}

	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		EntityManager em=Emu.provide();
	
//		Query query=em.createQuery("select e from Employee e INNER JOIN Address a where a.state='mp'");
		
		
//		query.setParameter("state", address);
	
		
		
		
		
		return null;
	}

	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		// TODO Auto-generated method stub
		EntityManager em=Emu.provide();
		Query query=em.createQuery("select e from Employee e where e.salary BETWEEN ?1 AND ?2");
		query.setParameter(1, startSalary);
		query.setParameter(2, endSalary);
		List<Employee> list=query.getResultList();
		if(list==null) {
			throw new EmployeeException("no employee available by that salary");
		}
		else {
			return list;
		}
		
	}

	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {
		EntityManager em=Emu.provide();
		Query query=em.createQuery("select e from Employee e where e.empID=?1");
		query.setParameter(1, empId);
		List<Employee> e=query.getResultList();
		String name="";
		long salary=0;
		for(Employee i:e) {
			name=i.getName();
			salary=i.getSalary();
		}
		Object[] a= {name,salary};
		return a;
	}

	public int getEmployeeSalaryById(int empId) throws EmployeeException {
		EntityManager em=Emu.provide();
		Query query=em.createQuery("select e.salary from Employee e where e.empID=?1");
		query.setParameter(1, empId);
		List<Integer> list=query.getResultList();
		if(list==null) {
			throw new EmployeeException("employee not available by that id");
		}
		else {
			int salary=list.get(0);
			return salary;
		}
		
	}
	public static void main(String[] args) {
		Dao obj=new DaoImpl();
		
		try {

			System.out.println(obj.getEmployeeSalaryById(1));
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
