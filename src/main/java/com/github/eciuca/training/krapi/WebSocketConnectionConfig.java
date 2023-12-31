package com.github.eciuca.training.krapi;

import com.github.eciuca.training.krapi.websocket.WebSocketConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@EnableWebSocket
@Configuration
public class WebSocketConnectionConfig implements WebSocketConfigurer {

    @Autowired
    private WebSocketConnection webSocketConnection;


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry
                .addHandler(webSocketConnection, "/websocket")
                .setAllowedOrigins("*");
    }
}
