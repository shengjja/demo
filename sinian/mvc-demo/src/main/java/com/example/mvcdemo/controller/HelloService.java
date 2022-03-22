package com.example.mvcdemo.controller;

import com.example.mvcdemo.config.MyException;
import org.springframework.stereotype.Service;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/22
 */
@Service
public class HelloService {

  public String exceptionFoo(){
    throw new MyException();
  }

}
