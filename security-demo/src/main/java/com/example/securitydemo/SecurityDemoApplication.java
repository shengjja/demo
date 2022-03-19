package com.example.securitydemo;

import com.example.securitydemo.service.MyLocalCacheVerifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SecurityDemoApplication {

  public static void main(String[] args) {
    final ConfigurableApplicationContext run = SpringApplication
        .run(SecurityDemoApplication.class, args);


    final MyLocalCacheVerifier bean = run.getBean(MyLocalCacheVerifier.class);
//    bean.checkLocalCache();

  }

}
