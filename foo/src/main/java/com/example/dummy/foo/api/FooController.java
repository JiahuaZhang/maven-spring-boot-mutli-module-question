package com.example.dummy.foo.api;

import com.example.dummy.common.check.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FooController {
  @Autowired
  CommonService commonService;

  @GetMapping("foo")
  Mono<String> foo() {
    return Mono.just("Foo module with common module service " + commonService.message());
  }
}
