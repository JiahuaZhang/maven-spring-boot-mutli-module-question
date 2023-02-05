package com.example.dummy.common.check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class CommonController {

  @GetMapping("/common")
  Mono<String> common() {
    return Mono.just("message from common module");
  }
}
