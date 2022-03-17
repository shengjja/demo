package com.example.securitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/17
 */
@Controller
public class LoginController {
  @GetMapping("/login")
  String login() {
    return "login";
  }
}
