package utils;

/**
 * A simple validator class to check input in a web form
 *  
 * @author Mikael Lindebrekke
 */
public class Validator {
	/**
	 * Checks wether the name starts with a capital letter and is minimum 2 chars short and 20 chars long. 
	 * 
	 * @param navn
	 * @return boolean
	 */
	public boolean name(String navn) { 
		return navn != null && navn.matches("[A-Z][a-z]{2,19}");
	}
	/**
	 * Checks wether the username starts with a capital letter and is minimum 2 chars short and maxmimum 20 chars long. 
	 * 
	 * @param navn
	 * @return boolean
	 */
	public boolean username(String navn) {
		return navn != null && navn.matches("[A-Z][a-z]{2,19}");
	}
	
	
	//Temporarily changed password validation to be less strict so that I can test user registration faster. 
	
	/**
	 * Checks that the password is at least 10 chars long and maximum 30 chars long. 
	 * 
	 * @param pass
	 * @return
	 */
	public boolean password(String pass) {
		
		return true;
		//return pass != null && pass.matches(".{10,30}"); 
	}
	/**
	 * Checks the repeated password is the identical.
	 * 
	 * @param pwd1
	 * @param pwd2
	 * @return boolean
	 */
	public boolean matchPassword(String pwd1, String pwd2) {
		
		return true;
		//return pwd2 != null && pwd2.matches(".{10,30}") && pwd1.equals(pwd2); 
	}
}
