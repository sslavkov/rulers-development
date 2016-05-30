package com.bgrulers.configs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@SpringBootApplication
@ComponentScan("com.bgrulers.web")
@EnableAutoConfiguration
@EnableJpaRepositories
//@EnableCaching
//@EnableWebSecurity
public class BgRulersApplication {

	public static void main(String[] args) {
		SpringApplication.run(BgRulersApplication.class, args);
	}
}
