package com.validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ValidatorApplication {

  public static void main(String[] args) {
    SpringApplication.run(ValidatorApplication.class, args);
  }

}
