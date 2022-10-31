package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class EmailConfig {
	
	@Bean
	public SimpleMailMessage emailTemplate() {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		
		simpleMailMessage.setTo("tk5754661@gmail.com");
		simpleMailMessage.setFrom("thihakyaw@ucsm.edu.mm");
		simpleMailMessage.setSubject("Testing Mail");
		simpleMailMessage.setText("Spring Mail testing");
		
		return simpleMailMessage;
	}

}
