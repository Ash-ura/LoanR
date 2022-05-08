package com.Ashura.LoanR;

import com.Ashura.LoanR.domain.model.User;
import com.Ashura.LoanR.domain.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanRApplication implements CommandLineRunner{

	@Autowired 
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(LoanRApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User(1, "Ashura", "von Jaeger", 22, "Engineer"));
		userRepository.save(new User(2, "Kharis", "von Ember", 22, "Pastor")); 
		userRepository.save(new User(3, "Raksha", "von Tenebris", 22, "Serial Killer"));


	}

}
