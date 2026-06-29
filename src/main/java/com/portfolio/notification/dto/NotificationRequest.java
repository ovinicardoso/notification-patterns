package com.portfolio.notification.dto;

public record NotificationRequest(
        String recipient,
        String message,
        String channel
) {}