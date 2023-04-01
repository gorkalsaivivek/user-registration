package com.user.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@RestController
public class UserRegistrationController {
	
	@Autowired
	WebClient webClient;
	
	String userCommunicationBaseUrl="${http://user-communication:http://localhost}:8081";
	//"${http://user-communication:http://localhost}:8081"
	//${user_communication_URI:http://localhost}:8081
	String user_communication_URI="http://user-communication:8081";
	@GetMapping("/testuser")
	public Mono<String> testUserResponse() {
		return webClient.get().uri("http://user-communication:8081/testcommunication").header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
		.retrieve().bodyToMono(String.class);

		//return "Response Hard Coded! from User Registration Service";
	}
	
	@GetMapping("/user")
	public String testResponse() {

		return "Response Hard Coded! from User Registration";
	}
	
	

}
