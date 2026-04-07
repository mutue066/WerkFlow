# WerkFlow API

Backend system for field service and construction site management,
built with Java 21 and Spring Boot 3.

## Motivation

Small and medium-sized contractors in Germany and Turkey manage
their teams, materials, and daily reports almost entirely via
WhatsApp. WerkFlow replaces this fragmented communication with
structured digital workflows and a clear manager dashboard.

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot 3.5 |
| Security | Spring Security 6 + JWT |
| Persistence | Spring Data JPA + Hibernate |
| Database | PostgreSQL (Production) / H2 (Tests) |
| Build | Maven |
| Testing | JUnit 5 + Mockito |
| Documentation | SpringDoc OpenAPI (Swagger UI) |

## Architecture

Layered Architecture (Controller → Service → Repository → Domain)

- **Controller Layer** — HTTP only, no business logic, DTOs in/out
- **Service Layer** — all business logic, @Transactional
- **Repository Layer** — database access only
- **Domain Layer** — Entities (Lombok), DTOs and Requests
  (Java Records)

## Core Features

- JWT Authentication with role-based access (MANAGER, WORKER)
- Project management (construction sites)
- Worker check-in / check-out with automatic overtime calculation
- Material requests as state machine
  (PENDING → APPROVED → DELIVERED)
- Daily site reports
- Manager dashboard

## Getting Started
```bash
# Clone the repository
git clone https://github.com/mutue066/WerkFlow.git
cd WerkFlow

# Run locally (requires PostgreSQL)
./mvnw spring-boot:run
```

## Roadmap

- [x] Project setup (Spring Boot 3.5, Java 21, Maven)
- [x] Layered package structure
- [ ] JWT Authentication & Role-based Access
- [ ] Project & Worker Domain
- [ ] Worker Check-in / Check-out Logic
- [ ] Material Request State Machine
- [ ] Daily Site Reports
- [ ] Unit & Integration Tests
- [ ] Swagger / OpenAPI Documentation
- [ ] Docker Compose Setup

## Project Status

🚧 In active development — built as a Java portfolio project
alongside studying Spring Boot 3 and Spring Framework 6.
