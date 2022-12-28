package useCasePack;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import employee.Employee;
import exception.EmployeeException;

public class updateEmployee {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDaoImpl();
        try {
            System.out.println(dao.UpdateEmpl(new Employee(2,"tarun","bhopa",23232)));
        } catch (EmployeeException e) {
            e.printStackTrace();
        }
    }
}
