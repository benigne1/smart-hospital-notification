package com.hospital.notification;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements NotificationService {

    public void sendNotification(String patientId, String message) {
        System.out.println("EMAIL to " + patientId + ": " + message);
    }
}