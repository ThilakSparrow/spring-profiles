package demo.springprofiles.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class demo {

	@Value("${spring.profiles.active}")
	String profile;
	
	@Value("${my.thankyoumessage}")
	String thankyoumessage;

	@PostConstruct
	public void printMessage() {
		System.out.println("Active profile : " + profile);
		System.out.println("Message : " + thankyoumessage);
	}
	
}
