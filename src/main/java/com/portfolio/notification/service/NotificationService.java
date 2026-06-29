package com.portfolio.notification.service;

import com.portfolio.notification.dto.NotificationRequest;
import com.portfolio.notification.strategy.NotificationStrategy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class NotificationService {

    private final Map<String, NotificationStrategy> notificationStrategies;

    public void processNotification(NotificationRequest request) {
        String requestedChannel = request.channel().toUpperCase();

        NotificationStrategy strategy = notificationStrategies.get(requestedChannel);

        if (strategy == null) {
            log.error("Attempt to send via unsupported channel: {}", requestedChannel);
            throw new IllegalArgumentException("Unsupported notification channel: " + requestedChannel);
        }

        strategy.send(request.recipient(), request.message());
    }
}