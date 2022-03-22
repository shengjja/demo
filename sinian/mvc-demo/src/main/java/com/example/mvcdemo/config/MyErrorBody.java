package com.example.mvcdemo.config;

import lombok.Data;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/21
 */
@Data
public class MyErrorBody {
  int value;
  String message;

  public MyErrorBody(int value, String message) {
    this.value = value;
    this.message = message;
  }
}
