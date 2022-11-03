package com.suburb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.suburb.persistence.repo")
@EntityScan("com.suburb.persistence.model")
@SpringBootApplication
public class SuburbApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuburbApiApplication.class, args);
	}

}
