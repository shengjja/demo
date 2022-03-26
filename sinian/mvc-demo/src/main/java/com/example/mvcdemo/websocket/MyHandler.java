package com.example.mvcdemo.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @author: jiaming.sheng
 * @date: 2022/3/26
 */
public class MyHandler extends TextWebSocketHandler {

  @Override
  protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    super.handleTextMessage(session, message);
  }
}
