# **Demo Spring Boot Restful API 💻** 

## **Description**
This is my first project using **Java** and **Spring Boot**, where I explore building a simple RESTful API. The project demonstrates foundational concepts such as database integration, entity management, and REST endpoints.
![Image Description]( https://www.4xtreme.com/wp-content/uploads/2019/10/spring-boot-logo.png)
## **Project Features**
- CRUD operations for managing data in a MySQL database.
- RESTful API endpoints built using Spring Web.
- Integration with JPA for database interaction.
- Hot reload support with Spring DevTools.
 
![Image Description](https://res.cloudinary.com/practicaldev/image/fetch/s--nuh-DiTy--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/i/ne3oi81rawpgef1up502.png)

---

## **Technologies and Tools**
- **Java Version:** 17
- **Spring Boot Version:** 3.3.6
- **Build Tool:** Maven
- **Database:** MySQL(via XAMPP)


<div style="display: flex; justify-content: space-between; align-items: center;" >
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaZabrx5N548Q6ldKZbAjpQSFNaRyNQL6K-g&s" alt="Image Description" width="300">
  <img src="https://bestinternet.co.th/img/blog/phpmyadmin-logo-%E0%B8%84%E0%B8%B7%E0%B8%AD%E0%B8%AD%E0%B8%B0%E0%B9%84%E0%B8%A3.png" alt="Image Description" width="300">
</div>

---

## **Dependencies**
The project uses the following Spring Boot dependencies:
- **MySQL Driver**: For connecting the application to a MySQL database.
- **Spring Data JPA**: To simplify database operations and ORM integration.
- **Spring Web**: For creating RESTful APIs.
- **Spring DevTools**: To support live reload and faster development.

---

## **Setup Instructions**

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/PunMung-66/demorestapi.git
   cd demorestapi
   ```

2. **Configure Database**  
   Update the `application.properties` file located in `src/main/resources` with your MySQL database credentials:
   ```properties
    spring.application.name=demorestapi
    spring.datasource.url=jdbc:mysql://localhost:3306/userdb
    spring.datasource.username=root
    spring.datasource.password=
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql: true
   ```

3. **Run the Application**  
   Run the application using the following Maven command:
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**  
   The application will start on `http://localhost:8080`. Use tools like **Postman** or a browser to interact with the endpoints.

---

## **Endpoints**

| Method | Endpoint          | Description              |
|--------|-------------------|--------------------------|
| GET    | `/api/users`      | Get all users            |
| GET    | `/api/users/{id}` | Get user by id           |
| POST   | `/api/users`      | Save user(with Json body)|
| PUT    | `/api/users`      | Update an existing item  |
| DELETE | `/api/users`      | Delete an existing item  |

---

## **Learnings**
Through this project, I learned:
- The basics of Java and Spring Boot.
- How to set up and configure a MySQL database in Spring Boot.
- The fundamentals of RESTful API design and implementation.
- Spring Boot Flow Architecture
