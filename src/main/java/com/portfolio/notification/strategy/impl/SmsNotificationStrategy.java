package com.portfolio.notification.strategy.impl;

import com.portfolio.notification.strategy.NotificationStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component("SMS")
public class SmsNotificationStrategy implements NotificationStrategy {
    @Override
    public void send(String recipient, String message) {
        log.info("[SMS] Sending SMS to: {} | Message: {}", recipient, message);
    }
}