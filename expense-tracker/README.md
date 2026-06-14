# Expense Tracker

A simple Spring Boot REST API for managing expenses. The application allows users to create expenses, retrieve all expenses, and fetch a specific expense by ID.

## Tech Stack

* Java 21
* Spring Boot 3
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven

---

## Project Architecture

The application follows a layered architecture:

```text
Client (Postman)
      |
      v
Controller Layer
      |
      v
Service Layer
      |
      v
Repository Layer
      |
      v
PostgreSQL Database
```

### Layers

#### Controller Layer

Handles incoming HTTP requests and returns responses.

#### Service Layer

Contains business logic and validation.

#### Repository Layer

Performs database operations using Spring Data JPA.

#### Entity Layer

Maps Java objects to database tables.

---

## Features

* Create Expense
* Get All Expenses
* Get Expense By ID
* Amount Validation
* PostgreSQL Persistence

---

## Project Structure

```text
src/main/java/com/expensetracker

├── controller
│   └── ExpenseController

├── entity
│   └── Expense

├── repository
│   └── ExpenseRepository

├── service
│   ├── ExpenseService
│   └── impl
│       └── ExpenseServiceImpl

└── ExpenseTrackerApplication
```

---

## Database Setup

Create a PostgreSQL database:

```sql
CREATE DATABASE expense_tracker;
```

Configure your database connection in:

```properties
src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/expense_tracker
spring.datasource.username=postgres
spring.datasource.password=password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## Running the Application

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project directory:

```bash
cd expense-tracker
```

Start the application:

```bash
mvn spring-boot:run
```

Application will run on:

```text
http://localhost:8080
```

---

## API Endpoints

### Create Expense

```http
POST /api/expenses
```

Request Body:

```json
{
  "amount": 500,
  "category": "Food"
}
```

Response:

```json
{
  "id": 1,
  "amount": 500,
  "category": "Food"
}
```

---

### Get All Expenses

```http
GET /api/expenses
```

---

### Get Expense By ID

```http
GET /api/expenses/{id}
```

Example:

```http
GET /api/expenses/1
```

---

## Validation

### Invalid Amount

```json
{
  "amount": -100,
  "category": "Food"
}
```

Response:

```text
Amount must be greater than 0
```

---

## Testing

Run tests using:

```bash
mvn test
```

Test APIs using Postman.


## Author

Shambhavi Singh
Java Backend Developer
