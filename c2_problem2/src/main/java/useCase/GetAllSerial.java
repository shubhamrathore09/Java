package useCase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Movie;
import model.Series;

public class GetAllSerial {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
	EntityManager em=emf.createEntityManager();
	
	Query query=em.createQuery("select s from Series s");
	List<Series> list=query.getResultList();
	for(Series i:list) {
		System.out.println(i);
	}
}
}
