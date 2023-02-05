package com.example.dummy.common.check;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

@Service
public class CommonSocket implements WebSocketHandler {
  @Override
  public Mono<Void> handle(WebSocketSession session) {
    return session.send(
        session.receive()
            .map(WebSocketMessage::getPayloadAsText)
            .map(String::toUpperCase)
            .map(session::textMessage)
    );
  }
}
