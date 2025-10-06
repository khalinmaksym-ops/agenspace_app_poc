# App POC

A minimal Spring Boot application with a `GET /api/hello` endpoint and a static page that fetches and displays the greeting.

## Requirements

- Java 17 (or compatible version configured in `build.gradle`)
- Gradle 8.14.3+ (or use the Gradle Wrapper once generated — run `gradle wrapper` if missing)

## Running the application

```powershell
# From the project root (Gradle Wrapper recommended)
.\gradlew.bat bootRun
```

> On macOS/Linux use `./gradlew bootRun` instead.

Navigate to <http://localhost:8080> to use the hello page.

### CORS customization

CORS is configured via the `app.cors.*` properties in `application.properties`. Adjust the allowed origins, methods, or headers there if you serve the frontend from a different location.

## Testing

```powershell
.\gradlew.bat test
```

> On macOS/Linux use `./gradlew test` instead.

If you don't have the Gradle Wrapper files yet, generate them once with `gradle wrapper` and re-run the commands above.

## API Overview

| Endpoint | Method | Description |
| --- | --- | --- |
| `/api/hello` | GET | Returns `{ "message": "Hello, world!" }` |

## Project structure

```
app_poc
├── build.gradle
├── settings.gradle
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── app
│   │   │               ├── AppPocApplication.java
│   │   │               └── controller
│   │   │                   └── CalculatorController.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   │           ├── app.js
│   │           ├── index.html
│   │           └── styles.css
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── app
│                       └── controller
│                           └── CalculatorControllerTest.java
└── README.md
```
