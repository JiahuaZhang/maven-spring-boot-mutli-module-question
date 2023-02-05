package com.example.dummy.foo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.dummy.common", "com.example.dummy.foo"})
public class FooApplication {

  public static void main(String[] args) {
    SpringApplication.run(FooApplication.class, args);
  }

}
