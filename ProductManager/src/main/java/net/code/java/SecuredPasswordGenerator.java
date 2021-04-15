package net.code.java;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecuredPasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String namhmPassword = "javacode";
		String namhmEncodePassword = encoder.encode(namhmPassword);
		String rawPassword = "nimda";
		String encodePassword = encoder.encode(rawPassword);
		
		System.out.println(namhmEncodePassword);
	}
	

}
