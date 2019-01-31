package com.mwb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudErueka3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudErueka3Application.class, args);
	}

}

