package com.tiu.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(
//		scanBasePackages = {"com.tiu.springcore",
//		"util"}
//)

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
	}

}
