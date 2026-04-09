# WerkFlow API

Backend system for connecting customers with craftsmen and service providers,
built with Java 21 and Spring Boot 3.

## Motivation

Finding a reliable craftsman is frustrating — for customers and service providers alike.
Requests get lost in WhatsApp chats, appointments are missed, and invoices are sent as photos.

WerkFlow digitizes this process: customers submit a job request with photos and a description,
choose an appointment slot, and receive a confirmed booking. Craftsmen manage their incoming
jobs, update status in real time, and issue invoices — all through a structured REST API.

Built as a portfolio project to demonstrate real-world backend design with Spring Boot,
JWT security, and domain-driven workflows.

## Tech Stack

| Layer         | Technology                              |
|---------------|-----------------------------------------|
| Language      | Java 21                                 |
| Framework     | Spring Boot 3.5                         |
| Security      | Spring Security 6 + JWT                 |
| Persistence   | Spring Data JPA + Hibernate             |
| Database      | PostgreSQL (Production) / H2 (Tests)    |
| Build         | Maven                                   |
| Testing       | JUnit 5 + Mockito                       |
| Documentation | SpringDoc OpenAPI (Swagger UI)          |

## Architecture

Layered Architecture (Controller → Service → Repository → Domain)

- **Controller Layer** — HTTP only, no business logic, DTOs in/out
- **Service Layer** — all business logic, @Transactional
- **Repository Layer** — database access only
- **Domain Layer** — Entities (Lombok), DTOs and Requests (Java Records)

## Core Features

- JWT Authentication with role-based access (`CUSTOMER`, `CRAFTSMAN`, `ADMIN`)
- Job request submission with photo upload and problem description
- Appointment scheduling with craftsman confirmation
- Job lifecycle as state machine (`OPEN → ACCEPTED → IN_PROGRESS → DONE`)
- Invoice generation per completed job
- Craftsman dashboard for managing incoming jobs

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
- [ ] User & Craftsman Domain
- [ ] Job Request with Photo Upload
- [ ] Appointment Scheduling
- [ ] Job Lifecycle State Machine
- [ ] Invoice Generation
- [ ] Unit & Integration Tests
- [ ] Swagger / OpenAPI Documentation
- [ ] Docker Compose Setup

## Project Status

🚧 In active development — built as a Java portfolio project
alongside studying Spring Boot 3 and Spring Framework 6.
