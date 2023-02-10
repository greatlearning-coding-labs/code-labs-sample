
# React, Spring Boot(Hibernate) and MySQL webapp!


![Application Home page](https://cdn-images-1.medium.com/max/1000/1*H4KTKqkilycIb1ebhvN85w.png)


![List of all data in our React app](https://cdn-images-1.medium.com/max/1000/1*h8A68kGQpM6QoQYOCqux6g.png)

### Installation

#### Prerequisites

    maven
    npm
    JAVA

#### create db learncrud and table tb_emp
    mysql --host=127.0.0.1 --user=root --password=

    CREATE DATABASE learncrud;

    USE learncrud;
    
    CREATE TABLE `tb_emp` (`id` int(11) NOT NULL AUTO_INCREMENT, `name` varchar(255) DEFAULT NULL,`gender` varchar(255) DEFAULT NULL, `department` varchar(255) DEFAULT NULL, `dob` date DEFAULT NULL, PRIMARY KEY (`id`));

    insert into `tb_emp` (`id`, `name`, `gender`, `department`, `dob`) values('3','Anjali Chaudhary','Male','React','1998-04-02');
    insert into `tb_emp` (`id`, `name`, `gender`, `department`, `dob`) values('4','d','a','a','1998-04-02');

```sh
mvn clean package
java -jar target/springboot-0.0.1-SNAPSHOT.jar

or

mvn spring-boot:run
```

### To run test cases 
    mvn clean test

### To Test

#### Frontend:
    https://<your_domain>.fsd-mygreatlearning.net:8080

#### Backend:

GET

    curl --location --request GET 'https://<your_domain>.fsd-mygreatlearning.net:8080/api/employee' \
    --header 'Content-Type: application/json'


POST

    curl --location --request POST 'https://<your_domain>.fsd-mygreatlearning.net:8080/api/employee' \
    --header 'Content-Type: application/json' \
    --data-raw '{
        "name": "TestCurl2",
        "department": "Tech",
        "gender": "F",
        "dob": "1996-12-07"
    }'