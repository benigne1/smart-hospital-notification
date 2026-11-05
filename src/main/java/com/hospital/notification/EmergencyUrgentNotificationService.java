package com.hospital.notification;

import org.springframework.stereotype.Component;

@Component("emergencyService")
public class EmergencyUrgentNotificationService implements NotificationService {

    public void sendNotification(String patientId, String message) {
        System.out.println("EMERGENCY to " + patientId + ": " + message);
    }
}