package movieHandler;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Creates a Data Access Object for the movie archive.
 * 
 * @author Mikael Lindebrekke
 */
@Stateless
public class MovieDAO {
	@PersistenceContext(name = "mainPU")
	private EntityManager em;
	
	/**
	 * Retrieves all movies stored in the database
	 * 
	 * @return List<Movies>
	 */
	public List<Movie> getAllMovies() {
		return em.createQuery("SELECT m FROM MovieList m", Movie.class).getResultList();
	}
	
	/**
	 * Creats a new movie entry.
	 * 
	 * @param newMovie
	 */
	public void createNewMovie(Movie newMovie) {
		em.persist(newMovie);
	}
	
	//May need to change this so that it searches for Id instead of title. 
	public Movie findMovie(String title) {
		return em.find(Movie.class, title);
	}

}
