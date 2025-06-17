# 🔐 Ecommerce Auth Service – Spring Boot JWT Authentication API

This project is a backend service built with Spring Boot that handles user authentication using JWT (JSON Web Token). It supports secure user registration, login, and protected routes for an e-commerce system or any web application.

---

## 🚀 Features

- User Registration (`/signup`)
- User Login and JWT token generation (`/login`)
- Token-based Authentication
- Role-based Authorization (`ADMIN`, `USER`, etc.)
- Spring Security Integration
- CORS Configuration
- Layered architecture (Controller, Service, Repository, DTO, etc.)

---

## 🧰 Tech Stack

- Java 17+
- Spring Boot
- Spring Security
- JWT (io.jsonwebtoken)
- Maven
- Lombok
- JPA / Hibernate
- H2 / PostgreSQL (for persistence)

---

## 📁 Project Structure

```
src/main/java/com/devsukray/ecommerce/
│
├── config              # CORS and security configuration
├── controller          # REST endpoints for authentication
├── dto                 # Data Transfer Objects
├── entity              # JPA entities (e.g., User)
├── enums               # User roles
├── filters             # JWT request filter
├── repository          # Database access layer
├── services
│   ├── auth            # Business logic for authentication
│   └── jwt             # JWT utilities and UserDetails service
```

---

## 📌 API Endpoints

| Method | Endpoint           | Description              |
|--------|--------------------|--------------------------|
| POST   | `/api/auth/signup` | Register a new user      |
| POST   | `/api/auth/login`  | Authenticate and get JWT |
| GET    | `/api/user/me`     | Get authenticated user   |

> 🔐 All protected routes require a valid JWT token in the `Authorization` header.

---

## ⚙️ Getting Started

1. **Clone the project:**
```bash
git clone https://github.com/yourusername/ecommerce-auth-service.git
cd ecommerce-auth-service
```

2. **Give execution permission to Maven Wrapper (on Unix/macOS):**
```bash
chmod +x mvnw
```

3. **Install dependencies and build the project:**
```bash
./mvnw clean install
```

4. **Run the application:**
```bash
./mvnw spring-boot:run
```

> 💡 **Tip:** On Windows, use `mvnw.cmd` instead of `./mvnw`.

5. **Access the application:**
- App URL: `http://localhost:8080`
- H2 Console: `http://localhost:8080/h2-console`

---

## 🧪 Sample Requests (Postman or cURL)

### 🔐 Login Request:
```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"email":"test@example.com", "password":"yourPassword"}'
```

### 🔐 Authorization Header:
```
Authorization: Bearer <your-jwt-token>
```

---

## 🧩 Environment Configuration

You can edit these values in:

```
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:h2:mem:testdb
jwt.secret=yourSecretKey
jwt.expiration=86400000
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update
```

---

## 💡 Possible Improvements

- 🔁 Refresh Token support
- 📄 Swagger/OpenAPI Integration
- ✉️ Email Verification & Password Reset
- 🐳 Docker support
- 🔐 OAuth2 / Social login integration

---

## 🧠 Project Concepts Summary

| Layer         | Responsibility                                               |
|---------------|---------------------------------------------------------------|
| Controller     | Accepts requests, returns responses                          |
| Service        | Contains business logic (authentication, user ops, etc.)     |
| Repository     | Communicates with the database                               |
| DTO            | Structures request/response data                             |
| Filter         | Intercepts HTTP requests and validates JWT                   |
| Config         | Configures Spring Security, CORS, and authorization rules    |

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome. Feel free to fork the repository and submit a pull request.

---



---

## 👨‍💻 Developer

**Şükran Sinci**  
Java Backend Developer  
[GitHub Profile](https://github.com/yourusername)
