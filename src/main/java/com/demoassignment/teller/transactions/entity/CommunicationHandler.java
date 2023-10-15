/*package com.demoassignment.teller.transactions.entity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;

@Slf4j
@Component
public class CommunicationHandler implements WebSocketHandler {

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        log.info("Connection established on session; {}",session.getId());
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
        String communicationMessage = (String) message.getPayload();
        log.info("Message:{}", communicationMessage);
        session.sendMessage(new TextMessage("Started Processing Cash Teller Transaction:"+ session + "-"+ communicationMessage));
        Thread.sleep(1000);
        session.sendMessage(new TextMessage("Completed Processing Transaction"+ communicationMessage));
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        log.info("Exception Occured: {} on session: {} ", exception.getMessage(), session.getId());

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        log.info("Connection closed on session: {} with status : {}", session.getId(), closeStatus.getCode());
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}*/
