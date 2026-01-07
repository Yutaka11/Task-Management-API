📌 Task Management API

The Task Management API is a modern and simple application for managing tasks, developed with a focus on clean code, best practices, and sustainable architecture.
Even though it uses only a single main entity (Task), the project is structured to reflect real-world systems, making it ideal for learning and portfolio purposes.

🚀 Features
📋 Task Management
- Create tasks
- Update tasks
- List all tasks
- Get task by ID
- Delete tasks

⭐ Task Attributes
- title
- description
- status → TODO | DOING | DONE
- priority → LOW | MEDIUM | HIGH
- dueDate
- createdAt

🔎 Deadline Filter
- The API provides smart filters to query tasks based on their deadline (dueDate):
- Overdue → tasks with expired deadlines
- Today → tasks due today
- Upcoming → tasks due in the future
- 
Example usage:
- GET /tasks?dueStatus=overdue
- GET /tasks?dueStatus=today
- GET /tasks?dueStatus=upcoming

🧠 Business Rules
- Tasks cannot be created without a title
- dueDate cannot be set in the past
- Date comparison is based on date (not only time)

🏗️ Tech Stack
- Java 17
- Spring Boot
- Lombok (to reduce boilerplate)
- PostgreSQL as the main database
- Docker for environment standardization and execution
- Swagger for API documentation

🎯 Project Purpose

- This project was created to:
- Demonstrate good development practices
- Show that even simple systems can be clean and well-structured
- Serve as a learning and evolution base
- Be part of a solid and professional portfolio

📈 Possible Future Improvements
- Authentication and user roles
- Advanced pagination and sorting
- Productivity reports
- Notifications
- Dashboard
- Multitenancy

🧪 Code Quality
- Organized architecture
- Ready for testing
- Maintainable and scalable

