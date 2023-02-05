package com.example.dummy.common.check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.WebSocketHandler;

import java.util.Map;

@Configuration
public class ReactiveWebSocketConfig {
  @Autowired
  CommonSocket commonSocket;

  @Bean
  public HandlerMapping webSocketHandlerMapping() {
    Map<String, WebSocketHandler> map = Map.of("/ws/common", commonSocket);

    SimpleUrlHandlerMapping handlerMapping = new SimpleUrlHandlerMapping(map);
    handlerMapping.setOrder(Ordered.HIGHEST_PRECEDENCE);
    return handlerMapping;
  }
}
