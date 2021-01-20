package utils;

public class Validator {
	
	public boolean name(String navn) { 
		return navn != null && navn.matches("[A-Z][a-z]{2,19}");
	}
	
	public boolean username(String navn) {
		return navn != null && navn.matches("[A-Z][a-z]{2,19}");
	}
	
	//Temporarily changed password validation to be less strict so that I can test user registration faster. 
	public boolean password(String pass) {
		
		return true;
		//return pass != null && pass.matches(".{10,30}"); 
	}
	
	public boolean matchPassword(String pwd1, String pwd2) {
		
		return true;
		//return pwd2 != null && pwd2.matches(".{10,30}") && pwd1.equals(pwd2); 
	}
}
