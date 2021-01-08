package userHandler;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserDAO {
	@PersistenceContext(name = "mainPU")
	private EntityManager em; 
	
	public List<User> getAllUsers() {
		return em.createQuery("SELECT u FROM UserList u", User.class).getResultList();
	}
	
	public void createNewUser(User newUser) {
		em.persist(newUser);
	}
	
	public User findUser(String username) {
		return em.find(User.class, username);
	}
}
