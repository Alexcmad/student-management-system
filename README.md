# Student Management System (SMS)

## Project Overview
The Student Management System (SMS) is a console-based Java application designed to help manage student records. It allows users to add, update, delete, search, and display student details. This project will help develop a strong understanding of Java, object-oriented programming (OOP), data structures, and file handling.

---

## Functional Requirements

### 1. Add a Student
- Input student details: **Name, ID, Age, Course**.
- Store student details in a data structure.

### 2. View All Students
- Display a list of all students.
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

### 6. Save Data to a File
- Save student records to a `.txt` or `.csv` file.
- Ensure data persists even after restarting the program.

### 7. Load Data from a File
- Read student records from a file at program startup.
- Populate the student list with existing data.

---

## Technical Requirements

### 1. Programming Concepts Used
- **Object-Oriented Programming (OOP)**: Utilize classes, objects, and encapsulation.
- **Collections Framework**: Use `ArrayList<Student>` to manage student records.
- **File Handling**: Implement reading and writing functionality.
- **Exception Handling**: Ensure robustness against invalid inputs.

### 2. Class Structure
#### **Student Class**
- **Fields**: ID, Name, Age, Course.
- **Methods**: Getters, setters, and a constructor.

#### **StudentManager Class**
- **Stores a list of students**.
- **Methods**:
  - `addStudent(Student student)`
  - `viewStudents()`
  - `searchStudent(String id)`
  - `updateStudent(String id, String newName, int newAge, String newCourse)`
  - `deleteStudent(String id)`
  - `saveToFile()`
  - `loadFromFile()`

### 3. User Interface
- Console-based **menu-driven** system.
- Users interact via numbered menu options.
- Ensure proper input validation.

---

## Extra Features (Optional Enhancements)
- **Sort Students**: Allow sorting by **Name, Age, or Course**.
- **Graphical User Interface (GUI)**: Implement using **JavaFX** or **Swing**.
- **Database Integration**: Use **SQLite** or **MySQL** instead of file storage.

---

## Learning Outcomes
By completing this project, you will gain hands-on experience with:
- ✅ **OOP principles** (Encapsulation, Classes, Methods)
- ✅ **Handling user input** with Scanner
- ✅ **Managing data structures** using `ArrayList<>`
- ✅ **Working with file handling** in Java
- ✅ **Basic Java logic & flow control**

---

## Next Steps
1. **Set up your Java project**.
2. **Define the `Student` and `StudentManager` classes**.
3. **Implement basic CRUD (Create, Read, Update, Delete) operations**.
4. **Add file handling for data persistence**.
5. **Test the application with sample student records**.

---

Good luck with your Java journey! 🚀

