package useCase;

import dao.Dao;
import dao.DaoImpl;
import exception.NotFoundException;

public class FindItemById {
public static void main(String[] args) {
	Dao dao=new DaoImpl();
	try {
		System.out.println(dao.getItem(3));
	} catch (NotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
}
