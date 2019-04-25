package com.huawei.cse;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class AuthMain {
  public static void main(String[] args) throws Exception {
    try {
      SpringApplication.run(AuthMain.class, args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
