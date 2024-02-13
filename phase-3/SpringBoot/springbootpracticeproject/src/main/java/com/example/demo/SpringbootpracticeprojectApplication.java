package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories
@SpringBootApplication
//@ComponentScan({"com.example.demo.entity", "com.example.demo.repository", "com.example.demo.controller"})
public class SpringbootpracticeprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootpracticeprojectApplication.class, args);
	}

}
