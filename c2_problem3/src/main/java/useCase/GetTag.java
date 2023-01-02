package useCase;

import postException.PostNotFoundException;
import tagException.TagNotFoundException;
import timelineDao.Dao;
import timelineDao.DaoImpl;

public class GetTag {
public static void main(String[] args) {
	Dao dao=new DaoImpl();
	
	try {
		System.out.println(dao.getTag(3));
	} catch (TagNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
}
}
