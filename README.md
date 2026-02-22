# Hibernate-Project – Student Management System (Hibernate)

A professional Java web application that performs full CRUD (Create, Read, Update, Delete) operations using Hibernate ORM with a clean layered architecture.
This project demonstrates a complete Student Management System with JSP/Servlets frontend and Hibernate-based backend connected to a relational database.

---

## 📌 Project Overview

**Hibernate-Project** is a web-based Student Management System developed using Java, Hibernate, Servlets, and JSP.
The application allows users to register, login, view, update, and delete student records while following industry-standard layered architecture (Controller, Service, DAO, Entity).

This project is designed for learning Hibernate integration in real-time web applications using Maven and Apache Tomcat.

---

## 🏗️ Architecture

The project follows a multi-layered architecture:

Controller → Service → DAO → Hibernate (ORM) → Database

* **Controller Layer** – Handles HTTP requests and responses (Servlets)
* **Service Layer** – Contains business logic
* **DAO Layer** – Manages database operations using Hibernate Sessions & Transactions
* **Entity Layer** – Maps Java objects to database tables
* **Configuration Layer** – Hibernate configuration (hibernate.cfg.xml)

---

## 📂 Project Structure

```id="n4q2l8"
MyHibernateProj
│
├── src/main/java
│    ├── com.example.Controller
│    │    ├── StudentLogin.java
│    │    ├── StudentRegister.java
│    │    ├── StudentHome.java
│    │    ├── StudentEdit.java
│    │    └── StudentDelete.java
│    │
│    ├── com.example.dao
│    │    └── DataBaseOperations.java
│    │
│    ├── com.example.daoimplementation
│    │    └── DataBaseOperationsImp.java
│    │
│    ├── com.example.Entity
│    │    └── Student.java
│    │
│    ├── com.example.Service
│    │    └── Service.java
│    │
│    └── com.example.ServiceImplementation
│         └── ServiceImp.java
│
├── src/main/resources
│    └── hibernate.cfg.xml
│
├── src/test/java
├── src/test/resources
├── target
└── pom.xml
```

---

## 🚀 Key Features

* Student Registration Module
* Secure Login Functionality (GET & POST handling)
* View All Students (Dashboard/Home)
* Update Student Records
* Delete Student Records
* Layered Architecture (MVC-based design)
* Hibernate Session & Transaction Management
* Maven Dependency Management
* Clean and Scalable Code Structure

---

## 🛠️ Technology Stack

* **Programming Language:** Java (JDK 8)
* **Framework:** Hibernate ORM
* **Frontend:** JSP, HTML, CSS
* **Backend:** Servlets
* **Build Tool:** Maven
* **Database:** MySQL / PostgreSQL (Configurable)
* **Server:** Apache Tomcat
* **Configuration:** hibernate.cfg.xml

---

## ⚙️ Prerequisites

Ensure the following software is installed before running the project:

* Java JDK 8 or higher
* Apache Maven
* Apache Tomcat (v8 or above)
* MySQL or PostgreSQL Database
* IDE (Eclipse / STS / IntelliJ IDEA)
* Git (optional, for version control)

---

## 🔧 Setup & Installation Guide

### 1️⃣ Clone the Repository

```bash id="y4l2r1"
git clone https://github.com/your-username/MyHibernateProj.git
```

### 2️⃣ Import Project into IDE

* Open Eclipse / STS
* Go to: File → Import → Existing Maven Project
* Select the project root folder (MyHibernateProj)

### 3️⃣ Configure Database

Open the file:

```id="g1k8p3"
src/main/resources/hibernate.cfg.xml
```

Update the following properties:

* Database URL
* Username
* Password
* Hibernate Dialect
* Driver Class Name

Example:

```xml id="f6t9z2"
<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/your_database</property>
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">your_password</property>
```

---

## ▶️ Running the Application

1. Configure Apache Tomcat Server in your IDE
2. Right-click on project → Run on Server
3. Start the Tomcat Server
4. Open browser and access:

```id="c9w7m5"
http://localhost:8080/MyHibernateProj/
```

---

## 🌐 Application Modules & Flow

| Module          | Description                      |
| --------------- | -------------------------------- |
| StudentLogin    | Handles user login (GET & POST)  |
| StudentRegister | Handles student registration     |
| StudentHome     | Displays all student records     |
| StudentEdit     | Updates existing student details |
| StudentDelete   | Deletes student records          |

---

## 🧩 Core Components Explanation

* **Student.java** → Entity class mapped to Student database table
* **DataBaseOperations.java** → DAO interface defining CRUD methods
* **DataBaseOperationsImp.java** → Hibernate implementation using Session & Transactions
* **ServiceImp.java** → Business logic layer between Controller and DAO
* **hibernate.cfg.xml** → Hibernate configuration and database connectivity

---

## 📊 Database Integration

* Uses Hibernate ORM for object-relational mapping
* Supports any relational database (MySQL/PostgreSQL)
* Automatic table mapping using Entity annotations
* Transaction management using Hibernate SessionFactory

---

## 📸 Frontend (JSP Pages)

* Login Page
* Registration Page
* Home/Dashboard Page (Student List)
* Edit Student Page

---

## 👩‍💻 Author

**Ramadevi Kattherapalle**
Java Full Stack Learner | Hibernate | JPA | JDBC Projects

---

## 📜 License

This project is developed for educational and learning purposes to demonstrate Hibernate CRUD operations in a Java Web Application.

