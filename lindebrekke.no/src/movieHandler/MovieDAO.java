package movieHandler;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class MovieDAO {
	@PersistenceContext(name = "mainPU")
	private EntityManager em;
	
	public List<Movie> getAllMovies() {
		return em.createQuery("SELECT m FROM MovieList m", Movie.class).getResultList();
	}
	
	
	public void createNewMovie(Movie newMovie) {
		em.persist(newMovie);
	}
	
	//May need to change this so that it searches for Id instead of title. 
	public Movie findMovie(String title) {
		return em.find(Movie.class, title);
	}

}
