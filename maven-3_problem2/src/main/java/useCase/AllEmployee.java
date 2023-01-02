package useCase;

import dao.Dao;
import dao.DaoImpl;
import exception.EmployeeException;

public class AllEmployee {
	public static void main(String[] args) {
		Dao dao=new DaoImpl();
		try {
			System.out.println(dao.getAllEmployee());
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
