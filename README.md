# Task Manager Spring Application

This project is a simple **Task Manager API** built using **Spring Boot** and **Maven**. It provides basic functionality to manage tasks, including creating, retrieving, and listing tasks.

---

## Features

- **Create Tasks**: Add new tasks with a title and description.
- **Retrieve All Tasks**: Get a list of all tasks.
- **Retrieve Task by ID**: Fetch details of a specific task by its unique ID.

---

## Technologies Used

- **Spring Boot**: For building the application backend.
- **Maven**: Dependency management and build tool.
- **Java**: Programming language.
- **Spring Initializer**: Used to bootstrap the project.

---

## Prerequisites

Before running the application, ensure you have the following installed:

- **Java 17** (or higher)
- **Maven 3.8+**
- A text editor or IDE (e.g., IntelliJ IDEA, Eclipse)

---

## Installation and Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo/task-manager-spring-app.git
   cd task-manager-spring-app
   ```

2. Build the project using Maven:
   ```bash
   mvn clean install
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access the API at `http://localhost:8080/tasks`.

---

## API Endpoints

### Base URL: `/tasks`

1. **Get All Tasks**
   - **GET** `/`
   - **Response**: Returns a list of all tasks.
   ```json
   [
       {
           "id": 0,
           "title": "Task Title",
           "description": "Task Description",
           "createdAt": "2024-12-29T12:00:00",
           "completed": false
       }
   ]
   ```

2. **Get Task by ID**
   - **GET** `/{id}`
   - **Response**: Returns the task with the specified ID or a `404 Not Found` if it doesn't exist.

3. **Create a New Task**
   - **POST** `/addTask`
   - **Request Body**:
     ```json
     {
         "title": "Task Title",
         "description": "Task Description"
     }
     ```
   - **Response**: Returns the created task with an assigned ID and timestamp.

---

## Project Structure

```
src/
├── main/
│   ├── java/com/akash/taskmanager_spring_app/
│   │   ├── controller/TaskController.java
│   │   ├── dto/CreateTaskDto.java
│   │   ├── entities/TaskEntity.java
│   │   └── services/TaskServices.java
│   └── resources/
│       ├── application.properties
│       └── static/
├── test/
└── pom.xml
```

---

## Future Improvements

- Add database integration (e.g., MySQL or PostgreSQL).
- Include additional endpoints for updating and deleting tasks.
- Add user authentication and authorization.
- Improve validation for incoming requests.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Author

**Akash Dange**  
[GitHub](https://github.com/AkashDange03) | [LinkedIn](https://linkedin.com/in/akash-dange-98a699243)
