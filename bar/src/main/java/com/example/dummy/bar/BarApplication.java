package com.example.dummy.bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.dummy.common", "com.example.dummy.bar"})
public class BarApplication {

  public static void main(String[] args) {
    SpringApplication.run(BarApplication.class, args);
  }

}
