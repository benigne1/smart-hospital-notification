# Smart Hospital Notification System

A Spring Boot application that shows IoC, @Primary, @Qualifier and @Value.

## How to run
1. Clone this repository
2. Copy `.env.example` and rename the copy to `.env`
3. Open `.env` and put your own values:
    - HOSPITAL_API_SECRET=your_secret_key_here
    - HOSPITAL_NAME=Your_Hospital_Name
4. Run the `NotificationApplication` class in IntelliJ (or use `./mvnw spring-boot:run`)
5. Use Java 17

## How it works
- `NotificationService` is the interface, with 3 implementations:
    - `EmailNotificationService`: default, marked with `@Primary`
    - `SmsNotificationService`: `@Component("smsService")`
    - `EmergencyUrgentNotificationService`: `@Component("emergencyService")`
- `PatientAlertProcessor` injects the default service with `@Autowired` (no `@Qualifier`)
  and the emergency service with `@Autowired` + `@Qualifier("emergencyService")`
- `@Value` reads `hospital.name` (default: "General City Hospital") and `HOSPITAL_API_SECRET`

## Security
- The real `.env` file is listed in `.gitignore` and is never committed
- Only `.env.example` (a template with fake values) is on GitHub