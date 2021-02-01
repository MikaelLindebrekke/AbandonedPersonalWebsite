package userHandler;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * Creates a Data Access Object for a user.
 * 
 * @author Mikael Lindebrekke
 */
@Stateless
public class UserDAO {
	
	@PersistenceContext(name = "mainPU")
	private EntityManager em; 
	
	/**
	 * Retrieves all user stored in the database
	 * 
	 * @return List<User>
	 */
	public List<User> getAllUsers() {
		return em.createQuery("SELECT u FROM User u", User.class).getResultList();
	}
	/**
	 * Creates a new user. 
	 * 
	 * @param newUser
	 */
	public void create(User newUser) {
		em.persist(newUser);
	}
	
	/**
	 * Finds a user in the database.
	 * 
	 * @param username
	 * @return User 
	 */
	public User findUser(String username) {
		return em.find(User.class, username);
	}
}
