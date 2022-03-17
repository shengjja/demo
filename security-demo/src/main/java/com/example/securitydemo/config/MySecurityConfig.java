package com.example.securitydemo.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/17
 */
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

  /**
   * UserDetailsService 注入这个Bean来修改框架默认的用户管理方式生成的用户
   * 用来自定义用户认证
   * @return
   */
  @Bean
  public UserDetailsService userDetailsService() {
    // ensure the passwords are encoded properly
    UserBuilder users = User.withDefaultPasswordEncoder();
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    manager.createUser(users.username("user").password("password").roles("USER").build());
    manager.createUser(users.username("admin").password("password").roles("USER","ADMIN").build());
    return manager;
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .authorizeRequests(authorize -> authorize
            .anyRequest().authenticated()
        )
        .formLogin(form -> form
            .loginPage("/login")
            .permitAll());
       // .httpBasic(withDefaults());
  }


}
