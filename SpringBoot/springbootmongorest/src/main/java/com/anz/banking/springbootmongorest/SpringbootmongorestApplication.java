package com.anz.banking.springbootmongorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@EnableMongoRepositories(basePackages={"com.anz*"})
@ComponentScan(basePackages={"com.anz*"})
@EntityScan(basePackages={"com.anz*"})
public class SpringbootmongorestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmongorestApplication.class, args);
	}
}
