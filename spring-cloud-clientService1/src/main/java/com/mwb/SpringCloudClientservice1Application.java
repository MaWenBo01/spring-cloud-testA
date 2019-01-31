package com.mwb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*@EnableDiscoveryClient*/
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudClientservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClientservice1Application.class, args);
	}

}

