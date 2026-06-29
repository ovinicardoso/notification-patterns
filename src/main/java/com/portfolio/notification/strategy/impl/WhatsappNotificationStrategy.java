package com.portfolio.notification.strategy.impl;

import com.portfolio.notification.strategy.NotificationStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("WHATSAPP")
public class WhatsappNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        log.info("[WHATSAPP] Sending WhatsApp message to: {} | Message: {}", recipient, message);
    }
}