package spittr.testing;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

public class EncoderTesting {
	private static final Logger LOGGER = LoggerFactory.getLogger(EncoderTesting.class);

	@Test
	public void bcryptEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String encoded = bCryptPasswordEncoder.encode("53cr3T");
		System.out.println(encoded);
		LOGGER.info("Becrypt encoded " + encoded);
	}

	@Test
	public void standardEncoder() {
		StandardPasswordEncoder standardPasswordEncoder = new StandardPasswordEncoder("53cr3T");
		String encoded = standardPasswordEncoder.encode("password12345");
//		String decoded =  standardPasswordEncoder.d
		System.out.println(encoded);
		String dbPass="3d5fb43259fe858ad212c8a4db49251fba858969675ed81c8bd67ae69fc56e7844a8ec93d61a55ab";
		boolean isTrue=standardPasswordEncoder.matches("password12345", dbPass);
		
		System.out.println(isTrue);
		
		LOGGER.info("Standard encoded " + encoded);
	}
	
	@Test
	public void countTheChar() {
		String pass = "b443a1a5f61af29df8c05b7874d9abcdce125abd81676fb694a93cc980db63ff59dd7f5741a02038";
//		String pass = "3d5fb43259fe858ad212c8a4db49251fba858969675ed81c8bd67ae69fc56e7844a8ec93d61a55ab"
		LOGGER.info("Password Length "+pass.length());
	}
}
