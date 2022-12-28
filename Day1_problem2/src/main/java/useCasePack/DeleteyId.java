package useCasePack;

import Dao.EmployeeDao;
import Dao.EmployeeDaoImpl;
import exception.EmployeeException;

public class DeleteyId {
    public static void main(String[] args) {
        EmployeeDao dao= new EmployeeDaoImpl();
        try {
            System.out.println(dao.deleteEmplById(1));
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
