# Notification Service API - Design Patterns

REST API for multichannel notifications (Email, SMS, WhatsApp) built to demonstrate the application of Design Patterns in a real-world scenario.

## 🚀 Technologies

* Java 17+
* Spring Boot 3.2.5
* Maven
* Lombok

## 🧠 Design Patterns Applied

1. **Strategy Pattern:** Encapsulates the specific sending logic for each notification channel (`EmailNotificationStrategy`, `SmsNotificationStrategy`, `WhatsappNotificationStrategy`) behind a common `NotificationStrategy` interface.
2. **Factory Pattern (Map-based Injection):** The `NotificationService` dynamically selects the correct strategy at runtime using Spring's automatic `Map<String, NotificationStrategy>` injection mechanism.
3. **Singleton Pattern:** Managed natively by the Spring IoC container (`@Service`, `@Component`), ensuring only one instance of each strategy and service exists in memory during the application lifecycle.

## ⚙️ How to Run

1. Clone the repository:
```bash
   git clone https://github.com/ovinicardoso/notification-patterns.git
```
2. Navigate to the project directory:
```bash
   cd notification-patterns
```
3. Run the application using the Maven Wrapper:
```bash
   ./mvnw spring-boot:run
```
   > On Windows CMD/PowerShell, use `.\mvnw.cmd spring-boot:run`

The server will start locally on `http://localhost:8080`.

## 📡 API Usage & Testing

**Endpoint:** `POST /api/notifications`

**Headers:** `Content-Type: application/json`

**Body:**

```json
{
  "recipient": "11999999999",
  "message": "Validando o canal WhatsApp",
  "channel": "WHATSAPP"
}
```

> **Note:** Valid values for `channel` are `EMAIL`, `SMS`, or `WHATSAPP`.

### Testing via PowerShell

```powershell
Invoke-RestMethod -Uri "http://localhost:8080/api/notifications" -Method Post -Headers @{"Content-Type"="application/json"} -Body '{"recipient": "11999999999", "message": "Validando o canal WhatsApp", "channel": "WHATSAPP"}'
```

### Testing via cURL (Windows CMD)

```cmd
curl -X POST http://localhost:8080/api/notifications -H "Content-Type: application/json" -d "{\"recipient\": \"11999999999\", \"message\": \"Validando o canal WhatsApp\", \"channel\": \"WHATSAPP\"}"
```

---

Developed as part of the Santander 2026 - AI Java Back-end bootcamp.

**Developed by Vinicius Moreira Gonçalves Cardoso**
