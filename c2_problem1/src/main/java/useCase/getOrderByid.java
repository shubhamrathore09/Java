package useCase;

import dao.Dao;
import dao.DaoImpl;
import exception.NotFoundException;

public class getOrderByid {
	public static void main(String[] args) {
		Dao dao=new DaoImpl();
		try {
			System.out.println(dao.getOrder(4));
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
