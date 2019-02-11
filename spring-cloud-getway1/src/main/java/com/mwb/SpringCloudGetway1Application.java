package com.mwb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudGetway1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGetway1Application.class, args);
	}

}

