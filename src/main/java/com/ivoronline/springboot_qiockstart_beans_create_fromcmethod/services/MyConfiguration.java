package com.ivoronline.springboot_qiockstart_beans_create_fromcmethod.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

  //=======================================================================
  // SAY HELLO
  //=======================================================================
  @Bean
  public String sayHello() {
    return "Hello from Configuration Bean";
  }

}
