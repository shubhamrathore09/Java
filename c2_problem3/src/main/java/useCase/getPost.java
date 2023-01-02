package useCase;

import postException.PostNotFoundException;
import timelineDao.Dao;
import timelineDao.DaoImpl;

public class getPost {
public static void main(String[] args) {
	Dao dao=new DaoImpl();
	
	try {
		System.out.println(dao.getPost(4));
	} catch (PostNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
}
