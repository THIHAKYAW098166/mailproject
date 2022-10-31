package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.services.EmailService;

@SpringBootApplication
public class SpringmaildemoApplication implements CommandLineRunner {
	
	@Autowired
	private EmailService emailService;

	public static void main(String[] args) {
		SpringApplication.run(SpringmaildemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		emailService.sendMail("tk5754661@gmail.com", "Happy Coding", "Email send with demo application");
		emailService.sendPreConfigureMail("Happy Coding");
		
	}

}
