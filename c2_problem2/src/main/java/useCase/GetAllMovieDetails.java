package useCase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Movie;

public class GetAllMovieDetails {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		
		Query query=em.createQuery("select m from Movie m");
		List<Movie> list=query.getResultList();
		for(Movie i:list) {
			System.out.println(i);
		}
		
	}
}
