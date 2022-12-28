package useCasePack;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import employee.Employee;
import exception.EmployeeException;

public class SaveEmployee {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDaoImpl();
        try {
            dao.RagistorEmployee(new Employee("shubha","bhopal",2222));
        } catch (EmployeeException e) {
            e.printStackTrace();
        }
    }
}
