package com.hospital.notification;

public interface NotificationService {
    void sendNotification(String patientId, String message);
}