# Student Management System (SMS)

## Project Overview
The Student Management System (SMS) is a console-based Java application designed to help manage student records. It allows users to add, update, delete, search, and display student details. This project will help develop a strong understanding of Java, object-oriented programming (OOP), data structures, and file handling.

---

## Functional Requirements

### 1. Add a Student
- Input student details: **Name, ID, Age, Course**.
- Store student details in a database.

### 2. View All Students
- Retrieve and display a list of all students from the database.
- Show student details in a structured format.

### 3. Search for a Student
- Find a student using their **ID**.
- Display the student's details if found.

### 4. Update Student Information
- Modify existing student details by searching via **ID**.
- Allow updating **Name, Age, and Course**.

### 5. Delete a Student
- Remove a student record using **ID**.
- Confirm before deleting.

### 6. Save Data to PostgreSQL Database
- Store student records in a **PostgreSQL database**.
- Ensure data persists even after restarting the program.

### 7. Load Data from PostgreSQL Database
- Retrieve student records from the database at program startup.
- Populate the student list dynamically.

---

## Technical Requirements

### 1. Programming Concepts Used
- **Object-Oriented Programming (OOP)**: Utilize classes, objects, and encapsulation.
- **JDBC (Java Database Connectivity)**: Use JDBC to interact with PostgreSQL.
- **Collections Framework**: Use `ArrayList<Student>` for in-memory operations.
- **Exception Handling**: Ensure robustness against invalid inputs and database errors.

### 2. Database Schema (PostgreSQL)
#### **Table: students**
```sql
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    course VARCHAR(100) NOT NULL
);
```

### 3. Class Structure
#### **Student Class**
- **Fields**: ID, Name, Age, Course.
- **Methods**: Getters, setters, and a constructor.

#### **DatabaseManager Class**
- Handles all database operations.
- **Methods**:
  - `connect()` - Establish connection to PostgreSQL.
  - `addStudent(Student student)` - Insert a new student into the database.
  - `viewStudents()` - Retrieve all students from the database.
  - `searchStudent(String id)` - Find a student by ID.
  - `updateStudent(String id, String newName, int newAge, String newCourse)` - Update student details.
  - `deleteStudent(String id)` - Delete a student by ID.
  - `closeConnection()` - Close the database connection.

### 4. User Interface
- Console-based **menu-driven** system.
- Users interact via numbered menu options.
- Ensure proper input validation.

---

## Extra Features (Optional Enhancements)
- **Sort Students**: Allow sorting by **Name, Age, or Course**.
- **Graphical User Interface (GUI)**: Implement using **JavaFX** or **Swing**.
- **REST API**: Build a web service using **Spring Boot**.

---

## Learning Outcomes
By completing this project, you will gain hands-on experience with:
- ✅ **OOP principles** (Encapsulation, Classes, Methods)
- ✅ **Handling user input** with Scanner
- ✅ **Managing data structures** using `ArrayList<>`
- ✅ **Working with PostgreSQL and JDBC** in Java
- ✅ **Basic Java logic & flow control**
- ✅ **Database transactions and SQL queries**

---

## Next Steps
1. **Set up PostgreSQL and create the database**.
2. **Define the `Student` and `DatabaseManager` classes**.
3. **Implement JDBC operations (CRUD - Create, Read, Update, Delete)**.
4. **Integrate database interactions with the console UI**.
5. **Test the application with sample student records**.

---

Good luck with your Java journey! 🚀

