# StudentManagement
A Spring Boot REST API project for Student Management using Java, Spring Boot, Spring Data JPA, and MySQL. Supports CRUD operations including adding, viewing, updating, and deleting student records.
# Student Management System

## 📌 Project Overview
The Student Management System is a RESTful web application developed using Spring Boot and MySQL. It allows users to perform CRUD (Create, Read, Update, Delete) operations on student records.

## 🚀 Features
- Add a new student
- View all students
- View a student by ID
- Update student details
- Delete a student
- MySQL database integration
- REST APIs tested using Postman

## 🛠️ Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman
- Git & GitHub

## 📁 Project Structure

```
StudentManagement
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.studentmanagement
│   │   │       ├── controller
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       ├── service
│   │   │       └── StudentManagementApplication.java
│   │   └── resources
│   │       └── application.properties
│   └── test
├── pom.xml
└── README.md
```

## ⚙️ Database Configuration

Create a MySQL database:

```sql
CREATE DATABASE studentdb;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## ▶️ Run the Project

1. Clone the repository.
2. Open the project in Spring Tool Suite (STS) or IntelliJ IDEA.
3. Update Maven dependencies.
4. Configure the MySQL database.
5. Run `StudentManagementApplication`.

## 📬 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /students | Get all students |
| GET | /students/{id} | Get student by ID |
| POST | /students | Add a new student |
| PUT | /students/{id} | Update student |
| DELETE | /students/{id} | Delete student |

## 👩‍💻 Author

**Vedika Pawade**

GitHub: https://github.com/vedikapawade
