package useCase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Movie;

public class GetMovieById {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ac");
		EntityManager em=emf.createEntityManager();
		Query query=em.createQuery("select m from Movie m where m.movieId=?1");
		query.setParameter(1, 1);
		List<Movie> list=query.getResultList();
		System.out.println(list.get(0));
	}
}
