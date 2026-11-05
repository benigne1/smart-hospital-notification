package com.hospital.notification;

import org.springframework.stereotype.Component;

@Component("smsService")
public class SmsNotificationService implements NotificationService {

    public void sendNotification(String patientId, String message) {
        System.out.println("SMS to " + patientId + ": " + message);
    }
}