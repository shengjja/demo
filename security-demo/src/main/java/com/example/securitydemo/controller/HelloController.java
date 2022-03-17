package com.example.securitydemo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/17
 */
@RestController
public class HelloController {

  @GetMapping("/hello")
  public Authentication hello() {
    return SecurityContextHolder.getContext().getAuthentication();
  }

}
