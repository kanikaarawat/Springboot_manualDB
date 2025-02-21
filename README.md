
# **Course Service API**

## **Project Overview**
This is a **Spring Boot** application that provides a simple **Course Service API**. It allows users to perform **CRUD operations** (Create, Read, Update, Delete) on course data.

## **Project Structure**
```
src/main/java/com/example/EXPT3
│── controller/
│   └── MyController.java
│── entities/
│   └── Course.java
│── services/
│   ├── CourseService.java
│   ├── CourseServiceImpl.java
│── Expt3Application.java
```

### **1. Controller (`MyController`)**
Handles incoming HTTP requests and maps them to corresponding service methods.

### **2. Entities (`Course`)**
Represents the data model for the Course entity.

### **3. Services (`CourseService`, `CourseServiceImpl`)**
- `CourseService`: Interface defining course-related operations.
- `CourseServiceImpl`: Implements the service interface, storing course data in-memory.

---

## **Endpoints & API Usage**
The API supports the following operations:

| HTTP Method | Endpoint       | Description                          |
|------------|---------------|--------------------------------------|
| `GET`      | `/courses`     | Get all courses                     |
| `GET`      | `/courses/{id}` | Get course by ID                    |
| `POST`     | `/courses`     | Add a new course                    |
| `PUT`      | `/courses/{id}` | Update an existing course by ID     |
| `DELETE`   | `/courses/{id}` | Delete a course by ID               |

---

## **Installation & Running the Project**

### **Prerequisites**
- Java 17+
- Spring Boot
- Maven
- Postman (for API testing)

### **Steps to Run Locally**
1. **Clone the repository**
   ```sh
   git clone https://github.com/your-username/your-repo.git
   cd your-repo
   ```

2. **Build and run the application**
   ```sh
   mvn spring-boot:run
   ```

3. **Access API**
   - Visit: `http://localhost:8080/courses`

---

## **Example API Requests**
### **1. Get All Courses**
**Request:**
```sh
GET /courses
```
**Response:**
```json
[
  {
    "id": 1,
    "title": "DSA",
    "description": "Algorithms"
  },
  {
    "id": 2,
    "title": "DAA",
    "description": "Structures"
  }
]
```

### **2. Add a New Course**
**Request:**
```sh
POST /courses
Content-Type: application/json
```
**Body:**
```json
{
  "id": 3,
  "title": "Spring Boot",
  "description": "Building REST APIs"
}
```

---

## **Contributing**
1. Fork the repository.
2. Create a new feature branch (`git checkout -b feature-name`).
3. Commit your changes (`git commit -m "Add new feature"`).
4. Push to the branch (`git push origin feature-name`).
5. Open a pull request.

---

## **License**
This project is licensed under the **MIT License** 🚀.

---

