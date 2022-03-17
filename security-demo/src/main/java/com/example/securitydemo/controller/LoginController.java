package com.example.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/17
 */
@RestController
public class LoginController {

  @GetMapping("/hello")
  public String hello() {
    return "你好";
  }

}
