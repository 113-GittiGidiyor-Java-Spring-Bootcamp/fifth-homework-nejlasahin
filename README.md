### Features


- User can create instructor, course, student using object information.
- User can list instructors, courses, students.
- User can delete instructor, course, student using id information.
- User can update instructor, course, student using object information.

----

### Used Technologies

- Java 8
- Spring Boot
- Spring Web
- Lombok
- Maven
- JPA / Hibernate
- H2 Database
- MapStruct
- Swagger UI
- Mockito
- JUnit

----

## API Endpoints

![endpoints](https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/fourth-homework-nejlasahin/blob/main/week4/src/main/java/spring/bootcamp/week4/docs/images/endpoints.png?raw=true)

#### Instructor Controller

| Route                                                        | HTTP Verb | POST Body  | Description              |
| ------------------------------------------------------------ | --------- | ---------- | ------------------------ |
| http://localhost:8080/api/instructors                         | `POST`    | InstructorDto   | Create Instructor                |
| http://localhost:8080/api/instructors                      | `GET`     | List-InstructorDto-      | Get All Instructors           |
| http://localhost:8080/api/instructors/{id}            | `DELETE`  | Empty    | Delete Instructor by instructorId  |
| http://localhost:8080/api/instructors         | `PUT`     | Empty    |   Update Instructor   |


#### Student Controller

| Route                                                        | HTTP Verb | POST Body  | Description              |
| ------------------------------------------------------------ | --------- | ---------- | ------------------------ |
| http://localhost:8080/api/students                         | `POST`    | StudentDto   | Create Student                |
| http://localhost:8080/api/students                      | `GET`     | List-StudentDto-      | Get All Students           |
| http://localhost:8080/api/students/{id}            | `DELETE`  | Empty    | Delete Student by studentId  |
| http://localhost:8080/api/students         | `PUT`     | Empty    |   Update Student   |


#### Course Controller

| Route                                                        | HTTP Verb | POST Body  | Description              |
| ------------------------------------------------------------ | --------- | ---------- | ------------------------ |
| http://localhost:8080/api/courses                         | `POST`    | CourseDto   | Create Course                |
| http://localhost:8080/api/courses                      | `GET`     | List-CourseDto-      | Get All Courses           |
| http://localhost:8080/api/courses/{id}            | `DELETE`  | Empty    | Delete Course by courseId  |
| http://localhost:8080/api/courses         | `PUT`     | Empty    |   Update Course   |


#### Exception Logger Controller

| Route                                                        | HTTP Verb | POST Body  | Description              |
| ------------------------------------------------------------ | --------- | ---------- | ------------------------ |
| http://localhost:8080/api/exceptions                         | `GET`    | List-ExceptionLoggerDto-   | Get All Exception Loggers                |
| http://localhost:8080/api/exceptions/{date}                      | `GET`     | List-ExceptionLoggerDto-      | Get All Exception Loggers By Date           |
| http://localhost:8080/api/exceptions/{exceptionMessage}            | `GET`  | List-ExceptionLoggerDto-    | Get All Exception Loggers By Exception Message  |
| http://localhost:8080/api/exceptions/{statusCode}         | `GET`     | List-ExceptionLoggerDto-    | Get All Exception By Status Code|


# Be??inci hafta ??devi teslim tarihi : 14 Eyl??l Sal?? - Saat 23:00

![hm05](https://user-images.githubusercontent.com/45206582/132606840-bcc89ab7-37f4-4bbd-a950-227b838b0b3c.PNG)
