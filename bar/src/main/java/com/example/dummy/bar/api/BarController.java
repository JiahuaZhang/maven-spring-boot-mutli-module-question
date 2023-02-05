package com.example.dummy.bar.api;

import com.example.dummy.common.check.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BarController {
  @Autowired
  CommonService commonService;

  @GetMapping("bar")
  Mono<String> bar() {
    return Mono.just("Bar module with common module service " + commonService.message());
  }
}
