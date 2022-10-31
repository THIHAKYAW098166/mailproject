package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private SimpleMailMessage simpleMailMessage;
	
	public void sendMail(String to, String subject, String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("thihakyaw@ucsm.edu.mm");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(body);
		
		javaMailSender.send(message);
	}
	
	public void sendPreConfigureMail(String message) {
		SimpleMailMessage smpMessage = new SimpleMailMessage(simpleMailMessage);
		smpMessage.setText(message);
		javaMailSender.send(smpMessage);
	}

}
