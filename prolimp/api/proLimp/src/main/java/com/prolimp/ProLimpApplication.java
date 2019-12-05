package com.prolimp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages = {"com.prolimp.model"})
@ComponentScan(basePackages = {"com.*"})
@EnableJpaRepositories(basePackages = "com.prolimp.repository")
@EnableTransactionManagement
@EnableWebMvc
@RestController
public class ProLimpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProLimpApplication.class, args);
	}

}
