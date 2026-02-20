# 🧠 Smart Expense & Family Finance Platform

A **production-grade, AI-powered, multi-tenant expense tracking platform** built with modern backend architecture, security best practices, and cloud-native principles.

This project is designed as a **portfolio-grade system** showcasing:

- Enterprise backend architecture
- Secure authentication & authorization
- Multi-tenant SaaS design
- Event-driven patterns
- AI-powered receipt understanding
- Financial domain modeling

---

# ✨ Key Features

## Core

- Multi-wallet expense tracking
- Category-based transactions
- Family & shared wallets
- Invite-based onboarding flow
- Transaction history & analytics
- Receipt upload + AI extraction (OCR + LLM)

## Security

- JWT authentication
- Multi-tenant isolation
- Role-Based Access Control (RBAC)
- Zero Trust security model
- Secure audit logging

## Architecture

- Domain-driven design (DDD)
- Event-driven design
- Modular monolith → microservice ready
- API contract-first approach
- Cloud-native containerized setup

---

# 🏗 System Architecture

```text
Frontend (React / Next.js)
        |
        v
Spring Cloud Gateway (Edge Auth + Routing)
        |
        v
------------------------------------------------
|        Backend Platform (Spring Boot)        |
|                                              |
|  Auth + RBAC + Tenant Context                |
|  Wallet Service                              |
|  Transaction Service                         |
|  Family & Invite Service                     |
|  Receipt AI Processing Service               |
|                                              |
------------------------------------------------
        |
        v
 PostgreSQL + Redis + Object Storage (S3)
```
