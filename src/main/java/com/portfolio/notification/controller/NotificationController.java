package com.portfolio.notification.controller;

import com.portfolio.notification.dto.NotificationRequest;
import com.portfolio.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody NotificationRequest request) {
        notificationService.processNotification(request);

        return ResponseEntity.accepted().build();
    }
}