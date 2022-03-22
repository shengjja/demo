package com.example.mvcdemo.controller;

import javax.servlet.annotation.WebListener;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/21
 */
@Controller
public class MyController {


  @GetMapping(value = "/hello")
  public String hello(){
    return "boot";
  }

  @GetMapping(value = "/json")
  @ResponseBody
  public String json(){
    return "json";
  }

}
