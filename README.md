# JDBC Connection Project

## Overview

This project demonstrates JDBC (Java Database Connectivity) operations using MySQL database. It includes CRUD operations (Create, Read, Update, Delete) and basic database connectivity in Java.

## Features

* MySQL Database Connection
* Insert Records
* Retrieve Records
* Update Records
* Delete Records
* PreparedStatement Usage
* Exception Handling

## Technologies Used

* Java
* JDBC
* MySQL
* Eclipse IDE

## Project Structure

```text
src/
├── InsertData.java
├── RetrieveData.java
├── UpdateData.java
├── DeleteData.java
└── TestDB.java
```

## Database Configuration

Create a database:

```sql
CREATE DATABASE jdbc_db;
USE jdbc_db;
```

Create table:

```sql
CREATE TABLE register (
    yname VARCHAR(100),
    gmail VARCHAR(100),
    gender CHAR(1),
    city VARCHAR(100)
);
```

## JDBC Driver

Add MySQL Connector/J to your project.

Example connection:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/jdbc_db",
    "root",
    "your_password"
);
```

## CRUD Operations

### Insert

Insert records into database.

### Retrieve

Fetch records using SELECT query.

### Update

Update existing records.

### Delete

Delete records based on conditions.

## How to Run

1. Install MySQL Server.
2. Create the database and table.
3. Add MySQL JDBC Driver.
4. Configure database credentials.
5. Run Java files from Eclipse.

## Author

**Sanjay Verma**

Java Developer | JDBC | Servlet | JSP | MySQL

## Future Improvements

* Servlet Integration
* JSP Integration
* Login & Registration Module
* Connection Pooling
* Spring Boot Integration
