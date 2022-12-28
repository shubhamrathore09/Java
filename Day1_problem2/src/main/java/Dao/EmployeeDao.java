package Dao;

import employee.Employee;
import exception.EmployeeException;

public interface EmployeeDao {
    public Employee RagistorEmployee(Employee employee) throws EmployeeException;
    public Employee getEmployeeById(int empid)throws EmployeeException;
    public Employee deleteEmplById(int empid)throws EmployeeException;
    public Employee UpdateEmpl(Employee employee)throws EmployeeException;
}
