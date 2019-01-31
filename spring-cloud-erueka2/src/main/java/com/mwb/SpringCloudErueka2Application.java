package com.mwb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudErueka2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudErueka2Application.class, args);
	}

}

