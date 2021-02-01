package userHandler;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Creates a user for the website
 * 
 * @author Mikael Lindebrekke
 */

@Entity
@Table(schema = "MLWebSite", name = "userlist")
public class User {

	@Id
	String username;
	@Embedded
	Password password;
	
	String firstname;
	String lastname;
	
	public User(String username, Password pwd, String fn, String ln) {
		this.username = username;
		this.password = pwd;
		this.firstname = fn;
		this.lastname = ln;
	}

	public String getUsername() {
		return username;
	}

	public Password getPassword() {
		return password;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	
}
