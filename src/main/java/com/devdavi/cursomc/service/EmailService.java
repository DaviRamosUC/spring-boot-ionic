package com.devdavi.cursomc.service;

import org.springframework.mail.SimpleMailMessage;

import com.devdavi.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
