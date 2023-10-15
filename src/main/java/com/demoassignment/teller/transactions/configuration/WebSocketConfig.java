/*package com.demoassignment.teller.transactions.configuration;

import com.demoassignment.teller.transactions.entity.CommunicationHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketConfigurer {
    @Autowired
    private CommunicationHandler communicationHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(communicationHandler,"/transaction").
                setAllowedOrigins("*");

    }

    @Bean
    WebSocketHandler communicationHandler(){
        return new CommunicationHandler();
    }
}
/*/