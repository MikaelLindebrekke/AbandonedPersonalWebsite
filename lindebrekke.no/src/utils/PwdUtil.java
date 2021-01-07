package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.xml.bind.DatatypeConverter;

public class PwdUtil {
	
	public static String generateRandomSalt() {
		SecureRandom sr;
		byte[] salt = new byte[16];
		try {
			sr = SecureRandom.getInstance("SHA1PRNG");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return DatatypeConverter.printHexBinary(salt);
	}
	
	public static String hashWithSalt(String pwd, String salt) {
		byte[] pwdHash = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] saltBytes = DatatypeConverter.parseHexBinary(salt);
			md.update(saltBytes);
			pwdHash = md.digest(pwd.getBytes());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return DatatypeConverter.printHexBinary(pwdHash);
	}
	
	public boolean validatePassword(String pwd, String salt, String pwdHash) {
		return pwdHash.equals(hashWithSalt(pwd, salt));
	}
	

}
