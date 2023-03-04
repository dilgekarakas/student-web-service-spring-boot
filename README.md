# student-web-service-spring-boot

This project provides a RESTful API for managing students. It includes a Student entity class and a StudentService class that provides methods for retrieving, creating, updating, and deleting students.

Requirements
------------

To run this project, you will need the following:

-   Java 17
-   Maven
-   MySQL

Installation
------------

1.  Clone the repository to your local machine.

2.  Configure your MySQL database settings in the `application.properties` file.

3.  Run the following command to build the project:

    Copy code

    `mvn clean install`

4.  Start the application by running the following command:

    bashCopy code

    `java -jar target/hw3-0.0.1-SNAPSHOT.jar`

API Endpoints
-------------

The following API endpoints are available:

-   `GET /Students`: Returns a list of all students.
-   `GET /Students/{id}`: Returns a specific student by ID.
-   `POST /Students`: Creates a new student.
-   `PUT /Students`: Updates an existing student.
-   `DELETE /Students`: Deletes an existing student.

Technologies Used
-----------------

-   Spring Boot
-   Spring Data JPA
-   Spring MVC
-   MySQL
-   Maven

Dependencies
------------

The following dependencies are included in this project:

-   spring-boot-starter-data-jdbc
-   spring-boot-starter-data-jpa
-   spring-boot-starter-jdbc
-   spring-boot-devtools
-   mysql-connector-j
-   spring-boot-starter-test
-   spring-boot-starter-web

License
-------

This project is licensed under the MIT License. See the `LICENSE` file for details.
