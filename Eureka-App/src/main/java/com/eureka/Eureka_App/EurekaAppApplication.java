package com.eureka.Eureka_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  // enables Eureka client registration
public class EurekaAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaAppApplication.class, args);
	}
}
