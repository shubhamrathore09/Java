package dao;

import java.util.List;

import exception.EmployeeException;
import model.Employee;

public interface Dao {

	public List<Employee> getAllEmployee()throws EmployeeException;
	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException;
	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary,
			int endSalary) throws EmployeeException;
	public Object[] getEmployeeNameAndSalary(int empId)throws EmployeeException;
	public int getEmployeeSalaryById(int empId)throws EmployeeException;
	


	
}
