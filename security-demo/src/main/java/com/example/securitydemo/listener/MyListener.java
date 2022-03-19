package com.example.securitydemo.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/18
 */
public class MyListener implements ApplicationListener {


  @Override
  public void onApplicationEvent(ApplicationEvent event) {
    System.out.println(event.getClass().getName());
  }
}
