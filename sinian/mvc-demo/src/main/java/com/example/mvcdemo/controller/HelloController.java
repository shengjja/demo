package com.example.mvcdemo.controller;

import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/22
 */
@RestController
public class HelloController {

  private HelloService helloService;

  private JdbcTemplate jdbcTemplate;

  public HelloController(HelloService helloService,
      JdbcTemplate jdbcTemplate) {
    this.helloService = helloService;
    this.jdbcTemplate = jdbcTemplate;
  }

  @GetMapping("/foo")
  public Resp foo(){
    final Resp resp = new Resp();
    resp.code="123";
    resp.data="hahah";
    helloService.exceptionFoo();
    return resp;
  }

  @GetMapping("/jdbc")
  public List<Map<String, Object>> jdbc(){
    final List<Map<String, Object>> users = jdbcTemplate
        .queryForList("select * from users");
    return users;
  }


  public static class Resp{
    String code;
    String data;
  }
}
