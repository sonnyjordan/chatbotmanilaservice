package com.chatbotmanila.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatbotManilaServiceApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ChatbotManilaServiceApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(ChatbotManilaServiceApplication.class, args);
	}
}
