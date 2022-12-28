package Dao;

import employee.Employee;
import emuit.Emu;
import exception.EmployeeException;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public Employee RagistorEmployee(Employee employee)throws EmployeeException {

        EntityManager em=Emu.provide();
        if(employee ==null){
            throw new EmployeeException("employee data is not valid");
        }
        else{
            em.getTransaction().begin();
            em.persist(employee);
            em.getTransaction().commit();
            em.close();
            return employee;
        }

    }

    @Override
    public Employee getEmployeeById(int empid)throws EmployeeException {
        EntityManager em=Emu.provide();
        Query query=em.createNamedQuery("findById");
        query.setParameter("id",empid);
        List<Employee>list= query.getResultList();
        Employee employee=null;
        for(Employee i:list){
            employee=i;
        }
        if(employee==null){
            throw new EmployeeException("no employee available by that id");
        }
        else{
            return  employee;
        }

    }

    @Override
    public Employee deleteEmplById(int empid) throws EmployeeException{
        EntityManager em=Emu.provide();
        Query query=em.createNamedQuery("findById");
        query.setParameter("id",empid);
        Employee employee=null;
        List<Employee> list=query.getResultList();
        for(Employee i:list){
            employee=i;
        }
        if(employee==null){
            throw new EmployeeException("no employee available by that id");
        }
        else {
            Employee ee=employee;
            em.getTransaction().begin();
            em.remove(employee);
            em.getTransaction().commit();
            em.close();
            return ee;
        }
    }

    @Override
    public Employee UpdateEmpl(Employee employee) throws EmployeeException{

        EntityManager em=Emu.provide();
        Query query=em.createNamedQuery("findById");
        query.setParameter("id",employee.getEmpid());
        Employee e=null;
        List<Employee> list=query.getResultList();
        for(Employee i:list){
            e=i;
        }
        if(e==null){
            throw new EmployeeException("wrong employee id pass in details");
        }else{
            em.getTransaction().begin();
            e.setSalary(employee.getSalary());
            e.setAddress(employee.getAddress());
            e.setName(employee.getName());
            em.getTransaction().commit();
            em.close();
            return e;
        }
    }
}
