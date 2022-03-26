package com.example.mvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class MvcDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(MvcDemoApplication.class, args);
  }


}
