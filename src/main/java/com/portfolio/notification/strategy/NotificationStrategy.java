package com.portfolio.notification.strategy;

public interface NotificationStrategy {
    void send(String recipient, String message);
}