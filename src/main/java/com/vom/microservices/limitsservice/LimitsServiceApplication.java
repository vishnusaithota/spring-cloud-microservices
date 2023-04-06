package com.vom.microservices.limitsservice;

import com.vom.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LimitsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServiceApplication.class, args);
	}

}
