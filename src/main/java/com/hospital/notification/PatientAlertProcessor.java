package com.hospital.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PatientAlertProcessor {

    @Autowired
    private NotificationService defaultService;

    @Autowired
    @Qualifier("emergencyService")
    private NotificationService emergencyService;

    @Value("${hospital.name:General City Hospital}")
    private String hospitalName;

    @Value("${HOSPITAL_API_SECRET}")
    private String apiSecret;

    public void run() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Secret loaded: " + (apiSecret != null));
        System.out.println("Default service: " + defaultService.getClass().getSimpleName());
        System.out.println("Emergency service: " + emergencyService.getClass().getSimpleName());

        defaultService.sendNotification("P001", "Appointment tomorrow at 10:00");
        emergencyService.sendNotification("P002", "Critical alert in ICU!");
    }
}