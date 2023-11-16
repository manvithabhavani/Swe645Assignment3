package com.swe645.assignment3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@EntityScan("com.swe645.assignment3.entity")
public class SurveyApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SurveyApplication.class, args);
	}

}
