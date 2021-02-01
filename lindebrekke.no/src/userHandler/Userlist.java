package userHandler;

import java.util.ArrayList;
import java.util.List;
/**
 * Creates an Arraylist of user
 * 
 * @author Mikael Lindebrekke
 */
public class Userlist {
	
	private List<User> ul = new ArrayList<>();
	
	public void addUser(User u) {
		ul.add(u);
	}
	
	public List<User> getUserlist() {
		return ul;
	}
}
