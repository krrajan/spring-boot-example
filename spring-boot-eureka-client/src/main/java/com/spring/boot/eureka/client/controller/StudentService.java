package com.spring.boot.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentService {

	@Value("${welcome.message:Hello, India!!!!}")
	private String message;

	@RequestMapping("/hello")
	public String getMessage() {
		return message;
	}

}
