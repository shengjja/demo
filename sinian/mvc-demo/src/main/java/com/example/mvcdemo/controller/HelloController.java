package com.example.mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/22
 */
@RestController
public class HelloController {

  @Autowired
  HelloService helloService;

  @GetMapping("/foo")
  public Resp foo(){
    final Resp resp = new Resp();
    resp.code="123";
    resp.data="hahah";
    helloService.exceptionFoo();
    return resp;
  }


  public static class Resp{
    String code;
    String data;
  }
}
