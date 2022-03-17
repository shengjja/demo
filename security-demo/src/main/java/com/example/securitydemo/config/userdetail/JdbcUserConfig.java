package com.example.securitydemo.config.userdetail;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

/**
 * 基于jdbc的配置
 * @author: jiaming.sheng
 * @date: 2022/3/17
 */
@Configuration
public class JdbcUserConfig {
  @Bean
  UserDetailsManager users(DataSource dataSource) {
//    UserDetails user = User.builder()
//        .username("user")
//        .password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
//        .roles("USER")
//        .build();
//    UserDetails admin = User.builder()
//        .username("admin")
//        .password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
//        .roles("USER", "ADMIN")
//        .build();
    JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//    users.createUser(user);
//    users.createUser(admin);
    return users;
  }

}
