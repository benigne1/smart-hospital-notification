package com.hospital.notification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationApplication  implements CommandLineRunner {

	@Autowired
	private PatientAlertProcessor processor;

	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}

	public void run(String... args) {
		processor.run();
	}
}