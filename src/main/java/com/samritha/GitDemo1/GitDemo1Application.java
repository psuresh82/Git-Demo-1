package com.samritha.GitDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
@SpringBootApplication
public class GitDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(GitDemo1Application.class, args);
	}
	@GetMapping
	public String GitTestMessage()
	{
		return "Git Demo-1 Custom Message";
	}
}
